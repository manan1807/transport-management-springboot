package com.gl.trans.algo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import org.apache.log4j.Logger;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.repo.CabDriverRepository;
import com.gl.trans.repo.EmployeeRepository;
import com.gl.trans.repo.GuardRepository;
import com.gl.trans.repo.OfficeAddressRepository;
import com.gl.trans.repo.RouteRepository;
import com.gl.trans.service.CabDriverService;
import com.gl.trans.service.EmployeeService;
import com.gl.trans.model.*;
@Service
public class RouteGenerator {
	@Autowired
	RouteGenerator routeGenerator;
	
	List<Route> listRoutes= new ArrayList<Route>();
	Employee current; 
	Employee nearestEmployee;
	RouteDetail routedetail;
	Guard guard;
	static boolean picked[];
	List<Vehicle> vehicleList;
	List<CabDriver> cabDriverList;
	List<Vendor> vendorList;
	List<Driver> driverlist;
	
	@Autowired
	EmployeeRepository employeeRepo;
	@Autowired
	RouteRepository routeRepo;

	@Autowired
	CabDriverService cabDriverService;

	@Autowired
	DistanceCalculater distanceCalc;

	@Autowired
	GuardRepository  guardRepo;

	@Autowired
	OfficeAddressRepository officeRepo;
	
	@Autowired
	TimeCalculatorImpl timeCalculator;
	
	@Autowired
	AddRoutetoDb addRoutetoDb;




	private static Logger logger=Logger.getRootLogger();

	public  List<Route> getRoutes(  List<Employee> employeeList,boolean drop, Date date,List<Request> requestList){
		logger.debug(LocalTime.now()+" route generation start here");
		OfficeAddress oa=officeRepo.findById(2001).get();
		Time shiftTime;
		Date curdate=new Date(System.currentTimeMillis());
//		logger.debug("starting route generatoe");
		Employee employeeDummy=new Employee();
		employeeDummy.setEmployeeId(0);employeeDummy.setLatitude(oa.getLatitude());employeeDummy.setLongitude(oa.getLongitude());employeeDummy.setGender("male");
		
		employeeList.add(0, employeeDummy);employeeDummy.setName("Office");
		logger.debug(LocalTime.now()+" Adjecency start here");
		double distance[][]=distanceCalc.getDistanceMatrix(employeeList);
		
		logger.debug(LocalTime.now()+"  Adjecency stop here");
		boolean guardAllocated =false;
		cabDriverList=cabDriverService.findAll();

		Collections.sort(cabDriverList, (p1,p2)-> 
				p1.getVehicle().getVehicleCapacity()-p2.getVehicle().getVehicleCapacity());
		int size=employeeList.get(1).getEmployeeId()-1;


		logger.debug("route generatoe");
		//e1.findAll().forEach(employeeList::add);

		picked=new boolean[employeeList.size()+1];
		int cabdriverno=0,count=0;
		boolean done=false;
		picked[0]=true;
		List<Employee> curRoute=new ArrayList<>();
		logger.debug(distance.length+" length distance");
		while(!done) {
			Employee farthestEmployee= distanceCalc.findFarthestEmployee(distance[0],picked,employeeList);
			if(farthestEmployee==null) break;
			curRoute.add(farthestEmployee);
			picked[employeeList.indexOf(farthestEmployee)]=true;
			count++;
			current=farthestEmployee;

			if(drop && farthestEmployee.getGender().equals("F")) {
				curRoute.add(farthestEmployee);
				guardAllocated=true;
			}
			while(curRoute.size()<cabDriverList.get(cabdriverno).getVehicle().getVehicleCapacity()) {
				nearestEmployee =distanceCalc.findNearestEmployee( picked,employeeList, current);
				if(nearestEmployee==null) break;
				picked[employeeList.indexOf(nearestEmployee)]=true;

				curRoute.add(nearestEmployee);

				current=nearestEmployee;
				count++;
			}
			if (drop) {
			 shiftTime=farthestEmployee.getShift().getShiftEndTime();}
			else {
				shiftTime = farthestEmployee.getShift().getShiftStartTime();
			}
			System.out.println(curRoute.toString()+" cur route");
			List<Time> timeList=timeCalculator.allocateTime(distance, shiftTime, curRoute,drop,employeeList.size());
			System.out.println(timeList.toString()+" here before adder");
			
			Route routeAddedToDb = addRoutetoDb.addToDatabase(curRoute, cabdriverno,cabDriverList, drop,requestList,date,distance,guardAllocated,timeList);
			
			listRoutes.add(routeAddedToDb);
			timeList.clear();
			guardAllocated=false;
			//					
			if(count==employeeList.size()-1) {
				break;
			}
			curRoute.clear();
			cabdriverno++;
		}	
		logger.debug(listRoutes.toString());
		logger.debug(LocalTime.now()+"route generation stop time");
		return listRoutes;
	}

}
