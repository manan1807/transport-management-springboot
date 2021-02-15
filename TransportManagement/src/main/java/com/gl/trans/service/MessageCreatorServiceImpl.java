package com.gl.trans.service;

import java.sql.Time;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;
import com.gl.trans.repo.RouteDetailRepository;

@Service
public class MessageCreatorServiceImpl implements MessageCreatorService {

	
	 private static Logger logger = Logger.getRootLogger();

	@Autowired
	RouteDetailRepository routeDetailRepository;
	
	@Override
	public Map<String,String> createMessage(int initialRouteDetailId, int lastRouteDetailId) {
		// TODO Auto-generated method stub	
		
		Map<String,String> map = new HashMap<String,String>();
		
	
		for (int i=initialRouteDetailId;i<=lastRouteDetailId;i++)
		{
			
			 	logger.debug(i);
			 	System.out.println();
			Optional<RouteDetail> rdid= routeDetailRepository.findById(i);
			//logger.debug(rdid);
			RouteDetail routedetail = rdid.get();
			//logger.debug(routedetail);
			String employeecontactnumber = routedetail.getEmployee().getContactNumber();
			
			String driverName = routedetail.getRoute().getCabdriver().getDriver().getName();
			
			String driverNumber = routedetail.getRoute().getCabdriver().getDriver().getPhoneNumber();
			
			String cabNumber  = routedetail.getRoute().getCabdriver().getVehicle().getVehicleNumber();
			
			Time pickupTime = routedetail.getRouteDetailTime();
			
			String message = "\nCab Number : "+cabNumber+"\n"+"Driver Name: "+driverName+"\n"+"Driver Number: "+driverNumber+"\n"+"Pickup Time: "+pickupTime ;
		
			
			
			map.put(employeecontactnumber,message);
			logger.debug(map);
			System.out.println();
			
		 
		}
	
	
		return map;
	}



}
