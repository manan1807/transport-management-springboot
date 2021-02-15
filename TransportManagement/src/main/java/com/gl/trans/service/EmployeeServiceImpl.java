package com.gl.trans.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.algo.PasswordHasher;
import com.gl.trans.model.Employee;
import com.gl.trans.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static Logger logger = Logger.getRootLogger();
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	PasswordHasher passwordHasher;

	//	@Autowired
	//	EntityManager entityManager;

	@Override
	public boolean checkLogin(String emailId, String password) {

		logger.debug(password);
		logger.debug(emailId);

		System.out.println(emailId);
		System.out.println(password);

		//		entityManager.getTransaction().begin();
		//	    Employee employee = entityManager.find(Employee.class, emailId);
		try
		{
			logger.debug("trying to find employee with email " + emailId);

			Employee employee =  employeeRepository.findFirstByEmailId(emailId.trim());
			logger.debug("got emp with email " + employee);

			if((employee.getPassword().equals(passwordHasher.hashPassword(password))))
			{
				return true;
			}

		}
		catch(Exception e)
		{
			logger.error(e);
		}
		return false;
	}
	@Override
	public List<Employee> getPresentEmployee() {
		final List<Employee>  employeeList=new ArrayList<>();
		employeeRepository.findAll().forEach(e -> employeeList.add(e));
		List<Employee> presentEmpList = employeeList.stream().filter(e -> e.getLeaveStatus().equals("present"))
		.collect(Collectors.toList());
		logger.debug("returning present employees " + presentEmpList.size());
		
		return presentEmpList;
	}

	@Override
	public List<Employee> getShiftEmployee(List<Employee> employeeList, String shift) {
		employeeList= employeeList.stream().filter((e)-> e.getShift().getShiftName().equals(shift)).collect(Collectors.toList());
		return employeeList;
	}



}
