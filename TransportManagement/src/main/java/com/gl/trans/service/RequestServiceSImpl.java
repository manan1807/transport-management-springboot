package com.gl.trans.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Request;
import com.gl.trans.repo.RequestRepository;
@Component
public class RequestServiceSImpl implements RequestService {

     @Autowired
     RequestRepository requestRespository;
     //add a Service
    
     @Override
     public List<Request> getTodayRequest(Date date) {
           
           List<Request> requestList = (List<Request>) requestRespository.findAll();
           
           List<Request> requests = requestList.stream().filter((req) -> req.getDropState().equals(date)).collect(Collectors.toList());
           
           return requests;
     }

	@Override
	public List<Employee> getRequestedEmployee(List<Employee> employeeList, List<Request> requestList) {
		List<Employee> requestedEmployeeList=new ArrayList<Employee>();
		for(Request requests:requestList) {
			if(employeeList.contains(requests.getEmployee())) {
				requestedEmployeeList.add(requests.getEmployee());
			}
		}
		return requestedEmployeeList;
	}

	@Override
	public List<Request> findAll() {
		List<Request> requestList=new ArrayList<>();
		
		requestRespository.findAll().forEach(requestList::add);
		return requestList;
	}

}

