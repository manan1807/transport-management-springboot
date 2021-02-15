package com.gl.trans.controller;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.gl.trans.model.Driver;
import com.gl.trans.model.Vendor;
import com.gl.trans.repo.VendorRepository;
import com.gl.trans.service.DriverServiceImpl;
import com.gl.trans.service.VendorServiceImpl;

@Controller
public class DriverController {
	private static Logger log=Logger.getRootLogger();

	 @Autowired
	 DriverServiceImpl driverService;
	 @Autowired
	 VendorServiceImpl vendorService;
  @Autowired
  VendorRepository vendorRepo;
	@RequestMapping(value="/addDriverToDatabase",method = RequestMethod.POST )

	public String uploadFile(@RequestParam ("uploadedFileName") MultipartFile file,@RequestParam("vendor") String vendorName,ModelMap model) throws IOException {
		FileInputStream inputStream = (FileInputStream) file.getInputStream();
		
		log.debug("vendor name"+vendorName);
		
		List<Driver> driverObjects=driverService.storeFileInDatabase(inputStream,vendorName);
		
		model.put("driverObjects", driverObjects);
		
		return  "driverList";
	}

@RequestMapping("/addDriver")
	
	public String getDashBoard(ModelMap model)
	{
	 List<Vendor> vendorObject=(List<Vendor>) vendorRepo.findAll();
	 log.debug(vendorObject.get(0));
	 model.put("vendorObject",vendorObject);
		return "addDriver";
	}
}
