package com.gl.trans.service;

import java.util.List;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;

@Service
public interface RouteDetailService {

	

	Map<Integer,Route> getEmployeeCabDetails(Employee employee);

	
	
	Map<Route,List<RouteDetail>> getEmployeeRouteStatus(Employee employee);
	


	void saveAcknowledgement(int routedetailId, String acknowledgement);

	



}
