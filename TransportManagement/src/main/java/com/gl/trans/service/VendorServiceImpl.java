package com.gl.trans.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.trans.model.Vendor;
import com.gl.trans.repo.VehicleRepository;
import com.gl.trans.repo.VendorRepository;

@Component
@Transactional
public class VendorServiceImpl implements VendorService {

	private static Logger logger = Logger.getRootLogger();
	@Autowired
	VendorRepository vendorRepository;

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public Vendor find(int vendorId) {
		return vendorRepository.findById(vendorId).orElse(null);
		
	}

	@Override
	public List<Vendor> findAll() {
		Iterable<Vendor> iter = vendorRepository.findAll();
		List<Vendor> list = new ArrayList<>();
		iter.forEach(list::add);
		return list;
	}

	@Override
	public void add(Vendor vendor) {
		vendorRepository.save(vendor);
		
	}

	@Override
	public void remove(Vendor vendor) {
		vendorRepository.delete(vendor);
		
		
	}

	@Override
	public void update(Vendor vendor) {
	//	vendorRepository.
		
	}


	@Override
	public  List<Object> countTotalCabs() {
		Query nativeQuery = entityManager.createNativeQuery("Select count(vehicleid) from vehicle group by vendorid");
		List<Object> resultList = nativeQuery.getResultList();
	    return resultList;

//		int count = ((BigInteger) nativeQuery.getSingleResult()).intValue();
//		logger.debug("count :"+count);
//		return count;
	}

	@Override
	public void addToDatabase(String vendorId, String vendorName, String govtId, String gstin, String contactPerson,
			String phone, String addressLine1, String addressLine2, String addressLine3, String city, String state,
			String pinCode, String pan, String bankAccountName, String bankaccountNumber, String ifsc) {
		int VendorId=Integer.parseInt(vendorId);
		Vendor vendor=new Vendor(VendorId,addressLine1,addressLine2,addressLine3,bankAccountName,bankaccountNumber,city,govtId,gstin,ifsc,pan,phone,pinCode,state,vendorName,contactPerson);
		vendor=vendorRepository.save(vendor);
	}

	

}
