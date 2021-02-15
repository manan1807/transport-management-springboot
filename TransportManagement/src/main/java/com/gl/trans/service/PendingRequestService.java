package com.gl.trans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Request;
@Service
public interface PendingRequestService {

	public  List<Request> getPendingRequest(int employeeId);

	public int getPendingRequestCount(int employeeId);
	
	
}
