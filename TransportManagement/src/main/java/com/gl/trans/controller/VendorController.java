package com.gl.trans.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gl.trans.model.Vendor;
import com.gl.trans.repo.VendorRepository;
import com.gl.trans.service.VendorService;
import com.gl.trans.service.VendorServiceImpl;

@Controller
@Transactional
public class VendorController {

	@Autowired
	VendorRepository vendorRepository;
	@Autowired
	VendorServiceImpl vendorServiceImple;

	private static Logger logger = Logger.getRootLogger();
	
	@RequestMapping(value="/vendordetail")	
	//	@ResponseBody
	public String get(ModelMap model)
	{
		List<Vendor> vendorlist = new ArrayList<Vendor>();
		vendorlist = (List<Vendor>) vendorRepository.findAll();
		for(Vendor v : vendorlist)
		{
			logger.debug(v.getVendorId());
		}
		//		vendorRepository.save(vendor);
		model.put("vendors", vendorlist);
		List<Object> count=vendorServiceImple.countTotalCabs();
		model.put("count",count);
		return "vendors";
	}

	@RequestMapping(value="/addvendor")
	public String get1(ModelMap model)
	{
		return "addvendor";

	}

	@RequestMapping("/addDriverWithDropDown")
	public String getVendorforDriverDropDown(ModelMap model)
	{
		List<Vendor> vendorlist =(List<Vendor>) vendorRepository.findAll();
		for(Vendor v : vendorlist)
		{
			logger.debug(v.getVendorId());
		}
		//		vendorRepository.save(vendor);
		model.put("vendors", vendorlist);
		return "addDriver";
	}
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") String id)
	{
//		Optional<Vendor> v1=vendorRepository.findById(Integer.parseInt(id));
//		Vendor vendor=v1.get();

		logger.debug("Vendor Id"+id);

		vendorRepository.deleteById(Integer.parseInt(id));
		return "redirect:/vendordetail";	
	}

	@RequestMapping(value="/particularDetail")
	public String vendor(@RequestParam("id") String id,ModelMap model)
	{
		Optional<Vendor> v1=vendorRepository.findById(Integer.parseInt(id));
		Vendor vendor=v1.get();
		logger.debug("Edit Vendor ========>"+id);
		model.put("vendor", vendor);
		return "editVendor";
	}
 
	@RequestMapping("/addvendortodb") 
	public String getValueFromAddVendor(@RequestParam ("vendorId") String VendorId,
			@RequestParam ("vendorName") String VendorName,
			@RequestParam ("govtid") String govtid, 
			@RequestParam ("gstin") String gstin, 
			@RequestParam ("phone") String phone,
			@RequestParam ("contactPerson") String contactPerson, 
			@RequestParam ("addressLine1") String addressLine1, 
			@RequestParam ("addressLine2") String addressLine2, 
			@RequestParam ("addressLine3") String addressLine3, 
			@RequestParam ("city") String city,
			@RequestParam ("state") String state,
			@RequestParam ("pinCode") String pincode,
			@RequestParam ("bankAccountName") String bankAccountName,
			@RequestParam ("bankAccountNumber") String bankAccountNumber,
			@RequestParam ("ifsc") String ifsc,
			@RequestParam ("pan") String pan)
	{
		
		vendorServiceImple.addToDatabase(VendorId, VendorName, govtid, gstin, contactPerson, phone, addressLine1, addressLine2, addressLine3, city, state, pincode, pan, bankAccountName, bankAccountNumber, ifsc);
		logger.debug("aded to db verndor , redirect to vendordetail");
	return "forward:/vendordetail";	
	}
}
