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
import com.gl.trans.model.Vehicle;
import com.gl.trans.model.Vendor;
import com.gl.trans.repo.VendorRepository;
import com.gl.trans.service.DriverServiceImpl;
import com.gl.trans.service.VehicleServiceImpl;

@Controller
public class VehicleController
{
	private static Logger log=Logger.getRootLogger();
	
	@Autowired
	 VehicleServiceImpl vehicleService;
	@Autowired
	VendorRepository vendorRepo;

	@RequestMapping(value="/addVehicleToDatabase",method = RequestMethod.POST )


	public String uploadFile(@RequestParam ("uploadedFileName") MultipartFile file,@RequestParam("vendor") String vendorName,ModelMap model) throws IOException {
		FileInputStream inputStream = (FileInputStream) file.getInputStream();
		
		List<Vehicle> driverObjects=vehicleService.storeFileInDatabase(inputStream,vendorName);
		
		model.put("driverObjects", driverObjects);
		
		return  "vehicleList";
	}
	
@RequestMapping("/addVehicle")
	
	public String getDashBoard(ModelMap model)
	{
	 List<Vendor> vendorObject=(List<Vendor>) vendorRepo.findAll();
	 log.debug(vendorObject.get(0));
	 model.put("vendorObject",vendorObject);
		return "addVehicle";
	}
}
