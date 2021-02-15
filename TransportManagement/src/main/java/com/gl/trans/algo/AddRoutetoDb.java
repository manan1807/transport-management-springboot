package com.gl.trans.algo;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.Employee;
import com.gl.trans.model.Request;
import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;
import com.gl.trans.repo.GuardRepository;
import com.gl.trans.repo.RouteDetailRepository;
import com.gl.trans.repo.RouteRepository;

@Component
public class AddRoutetoDb {
	@Autowired
	GuardRepository guardRepo;
	@Autowired
	AddRoutetoDb dataDaseAdder;

	
	@Autowired
	RouteRepository routeRepo;

	@Autowired
	RouteDetailRepository routeDetailRepo;

	@Autowired
	EntityManager entityManager;

//	@Transactional	
	Route addToDatabase(List<Employee> employee, int cabdriverno, List<CabDriver> cabDriverList2, boolean drop, List<Request> requestList,Date date, double[][] distance,  boolean guardAllocated, List<Time> timeList) {
		Route route = new Route();
		int guard=1;
		Employee emp=employee.get(0);
		if(employee.size()>1) {
			if(employee.get(0).equals(employee.get(1))) {
				employee.remove(0);
			}}

		CabDriver cabDriver=cabDriverList2.get(cabdriverno);
		route.setCabdriver(cabDriver);
		if(guardAllocated) {
			route.setGuard(guardRepo.findById(guard).get());
			guard++;
		}
		route.setRouteDate(date);
		route.setVendor(cabDriver.getVehicle().getVendor());
		if(drop) {
			route.setEstimatedStartTime(emp.getShift().getShiftEndTime());
			route.setEstimatedEndTime(timeList.get(timeList.size()-1));}
		else {
			route.setEstimatedStartTime(timeList.get(timeList.size()-1));
			route.setEstimatedEndTime(emp.getShift().getShiftStartTime());
		}
		routeRepo.save(route);
		System.out.println(timeList.toString());
		dataDaseAdder.generateAndSaveRouteDetail(employee,route,timeList,date);
		
	
		return route;
	}


//associates routedetail object to each of the employee assiciated with that routedetail
	
	private void generateAndSaveRouteDetail(List<Employee> employee, Route route2, List<Time> timeList, Date date) {
		
		int i=0;
		int size=employee.size();
		Collections.reverse(employee);
//		sele
		System.out.println(timeList.toString()+" rime  list");
		System.out.println(employee.toString()+" employee name");
		for( Employee emp:employee) 
		{
//			Employee emp = employee.get(i);
			RouteDetail routeDetail=new RouteDetail();
//			System.out.println("emp" + emp.toString());

			routeDetail.setRoute(route2);
			routeDetail.setEmployee(emp);
			routeDetail.setRouteDetailDate(date);
			routeDetail.setRouteDetailTime(timeList.get(size-i-1));
			routeDetailRepo.save(routeDetail);
			System.out.println(timeList.get(size-i-1)+" name "+emp.getName());
			routeDetail=null;
			i++;
		}
	}
}
