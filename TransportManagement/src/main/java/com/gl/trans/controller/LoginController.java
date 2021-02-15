package com.gl.trans.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.trans.model.Employee;
import com.gl.trans.repo.EmployeeRepository;
import com.gl.trans.service.EmployeeService;
import com.gl.trans.service.PendingRequestService;
import com.gl.trans.service.PendingRequestServiceImpl;

@Controller
public class LoginController
{
	private static Logger logger = Logger.getRootLogger();
	
//	@Autowired
//	ServletContext context; 

	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	PendingRequestService pendingRequestService;

	@RequestMapping(value= "/signIn", method=RequestMethod.POST)
	public String  findByEmailId(@RequestParam("login") String emailId , @RequestParam("password") String password, ModelMap model, HttpServletRequest request, HttpServletRequest response) {
		logger.debug("Not logged in");

		boolean checkPassword = employeeService.checkLogin(emailId, password);
		
		logger.debug("CheckPassword ===================>"+checkPassword);
		
//		int pendingRequestCount = pendingRequestService.getPendingRequest()

		if(checkPassword) {
             logger.debug("check password sahi aa rha hai");
//			Employee employee =  employeeRepository.findFirstByEmailId(emailId.trim());
             List<Employee> emp=employeeRepository.findByEmailId(emailId.trim());
             Employee employee=emp.get(0);
             logger.debug("Bhai ye employee hai"+employee.getName());
			HttpSession session = request.getSession(); // creates a session and sends back the session id as cookie back to the client
			session.setAttribute("employee",employee);
			String userType= employee.getUserType();
			if (userType.equals("employee"))
			{
				logger.debug("ma+na+na=manana");
//				session.setAttribute("employee",employee);
//				int pendingRequestCount = pendingRequestService.getPendingRequestCount((employee.getLineManager()).getEmployeeId());
//				model.put("pendingRequestCount",pendingRequestCount);
				return "forward:/listOfRouteDetails";
			}
			if (userType.equals("admin"))
			{
//				session.setAttribute("employee",employee);
				return "adminDashboard";
			}
			if (userType.equals("line manager"))
			{
//				session.setAttribute("employee",employee);
				return "startLineManager";
			}
//			logger.debug("returning to home unknown user type");
//			return "/";
		}

	
			logger.debug("Not logged in");
			model.put("checkPass", "Wrong loginId and password ");
			return "login";    	 
		
	
	}


//	   public String setUserType()

}

