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

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.Driver;
import com.gl.trans.model.Vehicle;
import com.gl.trans.model.Vendor;
import com.gl.trans.repo.CabDriverRepository;
import com.gl.trans.repo.DriverRepository;
import com.gl.trans.repo.VehicleRepository;
import com.gl.trans.repo.VendorRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

	private static Logger log=Logger.getRootLogger();

	@Autowired
	CabDriverRepository cabDriverRepo;
	@Autowired
	VendorRepository vendorRepo;
	@Autowired
	VehicleRepository vehicleRepo;

	@Override
	public List<Vehicle> storeFileInDatabase(FileInputStream inputStream, String vendor) {
		
		
			Vendor vendor2=vendorRepo.findByVendorName(vendor);
			log.debug(vendor2);
			InputStreamReader inputStreamreader=new InputStreamReader(inputStream);	
			System.out.println("ye wali line bht important hai" +inputStreamreader);
			CsvToBean<Vehicle> csvToBean = new CsvToBeanBuilder<Vehicle>(inputStreamreader).withType(Vehicle.class).withIgnoreLeadingWhiteSpace(true).build();
			List<Vehicle> vehicleObject = csvToBean.parse();
			log.debug("driver list receiveing");
			for(Vehicle vehicle: vehicleObject) {
				vehicle.setVendor(vendor2);
				vehicle=vehicleRepo.save(vehicle);
			}
			return vehicleObject;
		
	}
	
	



}
