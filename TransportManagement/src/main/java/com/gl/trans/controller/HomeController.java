package com.gl.trans.controller;

//import java.util.List;


//import java.util.Optional;

import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.gl.model.Student;
//import com.gl.repo.StudentRepository;
//import com.gl.trans.model.Employee;
//import com.gl.trans.repo.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
  private static Logger logger = Logger.getRootLogger();
	
//	@Autowired
//	EmployeeRepository studentRepo;
//	
//	@RequestMapping("/")
//	
//	public void getHome()
//	{
//		return  index;
//		
//	}
	
//	@RequestMapping("/students")
	
//	public Iterable<Student> getStudents()
//	{
//		Iterable<Student> optStudent2= studentRepo.findAll();
//		return optStudent2;
//	}
	
//@RequestMapping("/studentsName")
//	
//	public List<Student> getStudentBySname()
//	{
//		
//		return studentRepo.findBySname("Anand");
//	}


//@RequestMapping("/studentsCity")
//
//public List<Employee> getStudentByCity()
//{
//	
//	return studentRepo.findByCity("delhi");
//}
//
//
//@RequestMapping("/login")
//@ResponseBody
//public Student getStudent(@RequestParam("userid") String userId)
//{
//	
//	
//	Optional<Student> optional = studentRepo.findById(Integer.parseInt(userId));
//	
//	
//	Student student = optional.get();
//	
//	return student;
//
//	
//} 
//  @RequestMapping("/driver")
  
//	
//

  @RequestMapping(value = "/", method = { RequestMethod.GET })
	public String getLoginPage()
	{
		System.out.println("home redirecting to login");
		return "login";
	}
  @RequestMapping("/addRequest")
	public String getAddRequestPage()
	{
		return "adhocRequest";
	}
  @RequestMapping("/s")
	public String getAdd()
	{
		return "startEmployee";
	}
  
  @RequestMapping("/adminDashboard")
	public String getAddRequestPagea()
	{
		return "adminDashboard";
	}
//
//@RequestMapping("/adddriver")
//
//public String addDriver()
//{
//	return "forward:/uploadYourFile";
//}
//

}
