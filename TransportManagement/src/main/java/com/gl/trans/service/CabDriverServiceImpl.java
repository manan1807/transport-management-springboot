package com.gl.trans.service;

import java.io.BufferedReader;

//import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
//import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.CabDriverCsv;
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
public class CabDriverServiceImpl implements CabDriverService {

	private static Logger log=Logger.getRootLogger();

	@Autowired
	CabDriverRepository cabDriverRepo;
	@Autowired
	DriverRepository driverRepo;
	@Autowired
	VehicleRepository vehicleRepo;
	@Override
	public void storeCabDriverInDatabase(FileInputStream inputStream) {
		InputStreamReader inputStreamreader=new InputStreamReader(inputStream);	

		CsvToBean<CabDriverCsv> csvToBean = new CsvToBeanBuilder<CabDriverCsv>(inputStreamreader).withType(CabDriverCsv.class).withIgnoreLeadingWhiteSpace(true).build();

		List<CabDriverCsv> cabDriverCsvObject = csvToBean.parse();

		log.debug("driver list receiveing");

		for(CabDriverCsv cabCsvDriver: cabDriverCsvObject) {
			try
			{
			CabDriver cabDriver=new CabDriver();
			Vehicle vehicle=vehicleRepo.findFirstByVehicleNumber(cabCsvDriver.getVehicleNumber());
			System.out.println("Vehicle aa gya"+vehicle);
			Driver driver=driverRepo.findFirstByDriverLicenseNumber(cabCsvDriver.getDriverLicenseNumber());
			System.out.println("Driver aa gya"+ driver);
			int cabDriverId=cabCsvDriver.getCabDriverId();
			String cDate=cabCsvDriver.getCabDriverDate();
			cabDriver.setDriver(driver);
			cabDriver.setVehicle(vehicle);
			cabDriver.setCabDriverId(cabDriverId);
			cabDriver.setCabDriverDate(Date.valueOf(cDate));
			cabDriverRepo.save(cabDriver);
			System.out.println(cabDriver);
			}
			catch(Exception e)
			{
				log.error(e);
			}
		}	

	}

	@Override
	public List<CabDriver> findAll() {
		List<CabDriver> cabDriverList=new ArrayList<CabDriver>();
		cabDriverRepo.findAll().forEach(cabDriverList::add);
		return cabDriverList;
	}



}
