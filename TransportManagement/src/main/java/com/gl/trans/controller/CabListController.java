package com.gl.trans.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.trans.service.CabListService;
import com.gl.trans.service.CabListServiceImpl;



@Controller	
public class CabListController
{
	
	@Autowired
	CabListService cablistService;
	
	private static Logger logger = Logger.getRootLogger();
	
	@RequestMapping("/cablist")
	public String updateCabList(ModelMap model)
	{	
		List<Object[]> cablist = cablistService.getcabList();
		logger.debug("====="+cablist);
		model.put("cablist", cablist );
	
		
		return "cablist";
	}
	
	@RequestMapping(value="/addstarttime",method = RequestMethod.POST )
	public String addStartTime(@RequestParam("start")String start)
	{
		
		cablistService.saveStartTimeToDatabase();
		return "forward:/cablist";
		
	}
	
}
