package com.gl.trans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Employee;

@Service
public interface EmployeeService {

	public boolean checkLogin(String emailId, String password);

	List<Employee> getPresentEmployee();

	List<Employee> getShiftEmployee(List<Employee> employeeList, String shift);
	
}
