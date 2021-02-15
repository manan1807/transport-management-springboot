package com.gl.trans.service;

import java.io.BufferedReader;

//import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.trans.model.Driver;
import com.gl.trans.model.Vendor;
import com.gl.trans.repo.DriverRepository;
import com.gl.trans.repo.VendorRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

	private static Logger log=Logger.getRootLogger();

	@Autowired
	DriverRepository driverRepo;
	@Autowired
	VendorRepository vendorRepo;
	@Override
	public List<Driver> storeFileInDatabase(FileInputStream inputStream,String vendor) {

		Vendor vendor2=vendorRepo.findByVendorName(vendor);
		log.debug(vendor2);
		InputStreamReader inputStreamreader=new InputStreamReader(inputStream);	
		System.out.println("ye wali line bht important hai" +inputStreamreader);
		CsvToBean<Driver> csvToBean = new CsvToBeanBuilder<Driver>(inputStreamreader).withType(Driver.class).withIgnoreLeadingWhiteSpace(true).build();
		List<Driver> driverObject = csvToBean.parse();
		log.debug("driver list receiveing");
		for(Driver driver: driverObject) {
			driver.setVendor(vendor2);
			driver=driverRepo.save(driver);
		}
		return driverObject;
	}




}
