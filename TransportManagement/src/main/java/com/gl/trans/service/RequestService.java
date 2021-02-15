package com.gl.trans.service;

import java.sql.Date;
import java.util.List;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Request;

public interface RequestService {

	List<Request> getTodayRequest(Date date);

	List<Employee> getRequestedEmployee(List<Employee> employeeList, List<Request> requestList);

	List<Request> findAll();


	
}
