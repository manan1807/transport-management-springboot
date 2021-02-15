package com.gl.trans.controller;

import java.util.List;


import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpSession;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;
import com.gl.trans.repo.EmployeeRepository;
import com.gl.trans.service.RouteDetailService;

@Controller
public class AcknowledgementController {

	private static Logger logger = Logger.getRootLogger();
	@Autowired
	RouteDetailService routeDetailService;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/ack")
	
	public String getAcknowledgement(@RequestParam("ack") String acknowledgement, @RequestParam("RouteDetailId") int RouteDetailId)
	{
		
		
		
		routeDetailService.saveAcknowledgement(RouteDetailId, acknowledgement);
		
		
	//	model.put("cabStatus", map);
		//model.put("roster",route );
		 
		
		
		return "forward:/listOfRouteDetails";
		
	} 
	
	
//	@RequestMapping("/rosterChart")
//	@ResponseBody
//	public Route getLoginChart( HttpSession session)
//	
//	{
//	
//		Employee employee = (Employee) session.getAttribute("employee");
//		
//		Route route = RouteDetailService.getEmployeeCabDetails(employee);
//		
//		return route;
//	}
//	
//	@RequestMapping("/routeStatus")
//	@ResponseBody
//	public Map<Employee,String> getRouteStatus( HttpSession session)
//	{
//		Employee employee = (Employee) session.getAttribute("employee");
//		Map<Employee,String> map= RouteDetailService.getEmployeeRouteStatus(employee);
//		return map;
//		
//	}
//	
	
}
