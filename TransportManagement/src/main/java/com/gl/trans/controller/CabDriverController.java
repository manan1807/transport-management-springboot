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

import com.gl.trans.service.CabDriverServiceImpl;
@Controller
public class CabDriverController {


	@Autowired
	CabDriverServiceImpl cabDriverService;

	private static Logger log=Logger.getRootLogger();


	@RequestMapping(value="/addCabDriverToDatabase",method = RequestMethod.POST )

	public String uploadFileToCabDriverController(@RequestParam ("uploadedFile") MultipartFile file,ModelMap model) throws IOException {
		FileInputStream inputStream = (FileInputStream) file.getInputStream();
		System.out.println("we r in controller");
		cabDriverService.storeCabDriverInDatabase(inputStream);


		return  "cabDriverList";
	}


}
