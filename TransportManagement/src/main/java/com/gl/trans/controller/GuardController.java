package com.gl.trans.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gl.trans.model.Driver;
import com.gl.trans.model.Guard;
import com.gl.trans.model.Vendor;
import com.gl.trans.service.DriverServiceImpl;
import com.gl.trans.service.GuardServiceImpl;

@Controller
public class GuardController 
{
	private static Logger log=Logger.getRootLogger();
	 @Autowired
	 GuardServiceImpl guardService;
	 
	@RequestMapping(value="/addguard",method = RequestMethod.POST )
	public String uploadFile(@RequestParam ("uploadedFileName") MultipartFile file,ModelMap model) throws IOException 
	{
		FileInputStream inputStream = (FileInputStream) file.getInputStream();
		String filename=file.getOriginalFilename();
		
		List<Guard> guard=guardService.setValueInStringArray(inputStream);
		
		model.put("guard", guard);
		
		return "guardlist";
	}
@RequestMapping("/addGuard")
	
	public String getDashBoard(ModelMap model)
	{
	 
		return "guard";
	}

}
