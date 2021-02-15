package com.gl.trans.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;


public interface MessageCreatorService {

	
	
	
	
	// 
	Map<String, String> createMessage(int initialRouteDetailId, int lastRouteDetailId);
	
}
