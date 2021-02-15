package com.gl.trans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Vendor;
@Service
public interface VendorService {
	
	void add(Vendor vendor);
	void remove(Vendor vendor);
	void update(Vendor vendor);
	Vendor find(int vendorId); 
	List<Vendor> findAll();
	void addToDatabase(String vendorId, String vendorName,String govtId, String gstin,
			String contactPerson, String phone, String addressLine1, String addressLine2,
			String addressLine3, String city, String state, String pinCode, String pan, 
			String bankAccountName, String bankaccountNumber, String ifsc);

	List<Object> countTotalCabs();

}
