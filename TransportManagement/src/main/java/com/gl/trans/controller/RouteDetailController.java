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


import com.gl.trans.model.Employee;
import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;
import com.gl.trans.repo.EmployeeRepository;
import com.gl.trans.service.RouteDetailService;

@Controller
public class RouteDetailController {

	private static Logger logger = Logger.getRootLogger();
	@Autowired
	RouteDetailService routeDetailService;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@RequestMapping("/listOfRouteDetails")
	public String listOfRouteDetail(HttpSession session, ModelMap model)
	{
		
					
			Employee empl = (Employee) session.getAttribute("employee");
			 
			Optional<Employee> optionalemployee = employeeRepository.findById(empl.getEmployeeId());
			
			Employee employee = optionalemployee.get();
			
			
			
			Map<Route,List<RouteDetail>> map1= routeDetailService.getEmployeeRouteStatus(employee);
		    
		    
			model.put("route", map1);
			
			return "employeeCard";
		
	}
//	@RequestMapping("/listOfRoster")
//	public String listOfRoute(HttpSession session, ModelMap model)
//	{
//		
//					
//			Employee empl = (Employee) session.getAttribute("employee");
//			
//			Optional<Employee> optionalemployee = employeeRepository.findById(empl.getEmployeeId());
//			
//			Employee employee = optionalemployee.get();
//			
//			
//			
//			Map<Integer,Route> map =  RouteDetailService.getEmployeeCabDetails(employee);
//		
//		
//		
//	
//		model.put("cabStatus", map);
//		
//		return "employeeCard";
//		
//		
//	}
	@RequestMapping(value="/employeeDashboard")
	public String getEmployeeDashboard()
	{
		return "employeeCard";
	}
}
