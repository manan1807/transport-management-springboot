package com.gl.trans.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Request;
import com.gl.trans.repo.RequestRepository;

@Service
public class PendingRequestServiceImpl implements PendingRequestService {
	
	@Autowired
	RequestRepository requestRepository;

	@Override
	public List<Request> getPendingRequest(int lineManagerId) {
		
		
		List<Request> employeeRequest = (List<Request>) requestRepository.findAll();
		
		List<Request> requests = employeeRequest.stream()
				.filter((r) -> r.getEmployee().getLineManager().getEmployeeId()==lineManagerId)
				.filter(r -> r.getRequestStatus().equals("pending"))
				.collect(Collectors.toList());
		return requests;
	}
	
	 
	
	public int getPendingRequestCount(int lineManagerId) {
		
		List<Request> employeeRequest = (List<Request>) requestRepository.findAll();
		
		int count=employeeRequest.stream()
				.filter((r) -> r.getEmployee().getLineManager().getEmployeeId()==lineManagerId)
				.filter(r -> r.getRequestStatus().equals("pending"))
				.collect(Collectors.toList()).size();
		
		return count;
		
		
	}
	
	
	
	
}
