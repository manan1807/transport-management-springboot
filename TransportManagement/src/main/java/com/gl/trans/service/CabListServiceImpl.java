package com.gl.trans.service;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Route;
import com.gl.trans.repo.RouteRepository;
import com.gl.trans.repo.VehicleRepository;

@NamedNativeQuery (name = "cablistQuery" , query = " select Rd.routeId,count(Rd.acknowledgement), veh.vehicleNumber, veh.vehicleCapacity\r\n" + 
		" from routedetail Rd, route R, cabdriver cd, vehicle veh\r\n" + 
		" where Rd.routeId=R.routeId\r\n" + 
		" and R.cabDriverId=cd.cabDriverId\r\n" + 
		" and cd.vehicleId=veh.vehicleId")
@Service
public class CabListServiceImpl implements CabListService 
{
	private static Logger logger = Logger.getRootLogger();
	
	@Autowired
	VehicleRepository vehicleRepo;
	@Autowired
	RouteRepository routeRepository;
	@Autowired
	EntityManager entityManager;


	@Override
	public List<Object[]> getcabList()
	{
		logger.debug("Native Before");
//		String cablistQ = " select Rd.routeId,count(Rd.acknowledgement), veh.vehicleNumber, veh.vehicleCapacity\r\n" + 
//				" from routedetail Rd, route R, cabdriver cd, vehicle veh\r\n" + 
//				" where Rd.routeId=R.routeId\r\n" + 
//				" and R.cabDriverId=cd.cabDriverId\r\n" + 
//				" and cd.vehicleId=veh.vehicleId";
		String cablistQ="select Rd.routeId, veh.vehicleNumber, veh.vehicleCapacity, dvr.name, vdr.vendorName, count(Rd.acknowledgement)\r\n" + 
				"from routedetail Rd, route R, cabdriver cd, vehicle veh, driver dvr, vendor vdr\r\n" + 
				"where Rd.routeId=R.routeId\r\n" + 
				"and R.cabDriverId=cd.cabDriverId\r\n" + 
				"and cd.vehicleId=veh.vehicleId\r\n" + 
				"and cd.driverId=dvr.driverId\r\n" + 
				"and veh.vendorId=vdr.vendorId\r\n" + 
				"group by Rd.routeId, veh.vehicleNumber, veh.vehicleCapacity, dvr.name, vdr.vendorName\r\n";

		Query query = entityManager.createNativeQuery(cablistQ);
           
		logger.debug("Native After");

		List<Object[]> objectResult = query.getResultList();
		logger.debug("meri native query chal rhi h"+objectResult.get(0).toString());
//		List<String> result = objectResult.stream().map(ob ->Arrays.toString(ob) ).collect(Collectors.toList());
//		List<List<String>> result2 = new ArrayList<>();
		
		if(objectResult == null) { logger.debug("no cablist found. List is null" );}
//		System.out.println(objectResult.size() + " number of cablist obtained");

		return objectResult;
	}
	@Override
	public void saveStartTimeToDatabase()
	{
		Route route = new Route();
		LocalTime now = LocalTime.now();
		logger.debug("save ho rha hai");
		 Time time = Time.valueOf( now ); 
		route.setActualStartTime(time);
		route.setActualEndTime(time);
		route=routeRepository.save(route);
	}
}