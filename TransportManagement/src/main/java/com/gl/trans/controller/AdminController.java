package com.gl.trans.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Request;
import com.gl.trans.model.Route;

import com.gl.trans.repo.RequestRepository;
import com.gl.trans.service.EmployeeService;
import com.gl.trans.service.RequestService;
import com.gl.trans.algo.RouteGenerator;

@Controller
public class AdminController {
	private static Logger logger=Logger.getRootLogger();
	@Autowired
	RequestService requestService;
	
	@Autowired
	RouteGenerator routeGenerate;
	@Autowired 
	EmployeeService employeeService;
	@RequestMapping("/generateRoute")	
//	public void routeGenerator(@RequestParam("drop" ) String drop,ModelMap model ) {
		public String routeGenerator(ModelMap model ) {
		logger.debug("Generating Route");
		Date date=new Date(System.currentTimeMillis());
		boolean drop=true;
		String shift="Morning";
		//if(pickupDrop.equals("drop")) drop=true;
		List<Employee> employeeList=employeeService.getPresentEmployee();
		List<Request> requestList=requestService.findAll();
		employeeList=employeeService.getShiftEmployee(employeeList,shift);
		
//		employeeList=requestService.getRequestedEmployee(employeeList,requestList);
		List<Route> routeList=routeGenerate.getRoutes(employeeList, drop, date,requestList);
		for(Route route: routeList)
		{
			//do nothing
		}
		model.put("generatedRoute",routeList);
		return "generateRoute";
		
	}
}
