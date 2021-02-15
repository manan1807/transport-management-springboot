package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vendor database table.
 * 
 */
@Entity
@Table(name="vendor")
//@NamedQuery(name="Vendor.findAll", query="SELECT v FROM Vendor v")
public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="vendorid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vendorId;
	
	@Column(name="addressline1")
	private String addressLine1;

	@Column(name="addressline2")
	private String addressLine2;

	@Column(name="addressline3")
	private String addressLine3;

	@Column(name="bankaccountname")
	private String bankAccountName;

	@Column(name="bankaccountnumber")
	private String bankAccountNumber;

	@Column(name="city")
	private String city;

	@Column(name="govtid")
	private String govtId;

	@Column(name="gstin")
	private String gstin;

	@Column(name="ifsc")
	private String ifsc;

	@Column(name="pan")
	private String pan;

	@Column(name="phone")
	private String phone;

	@Column(name="pincode")
	private String pinCode;

	@Column(name="state")
	private String state;

	@Column(name="vendorname")
	private String vendorName;
	
	@Column(name="contactperson")
	private String contactPerson;

	//bi-directional many-to-one association to Driver
//	@OneToMany(mappedBy="vendor")
//	private List<Driver> drivers;

	//bi-directional many-to-one association to Route
//	@OneToMany(mappedBy="vendor")
//	private List<Route> routes;

	//bi-directional many-to-one association to Vehicle
//	@OneToMany(mappedBy="vendor")
//	private List<Vehicle> vehicles;


	public Vendor() {
		super();
	}


//	public Vendor(int vendorId, String addressLine1, String addressLine2, String addressLine3, String bankAccountName,
//			String bankAccountNumber, String city, String govtId, String gstin, String ifsc, String pan, String phone,
//			String pinCode, String state, String vendorName, String contactPerson, List<Driver> drivers,
//			List<Route> routes, List<Vehicle> vehicles) {
//		super();
//		this.vendorId = vendorId;
//		this.addressLine1 = addressLine1;
//		this.addressLine2 = addressLine2;
//		this.addressLine3 = addressLine3;
//		this.bankAccountName = bankAccountName;
//		this.bankAccountNumber = bankAccountNumber;
//		this.city = city;
//		this.govtId = govtId;
//		this.gstin = gstin;
//		this.ifsc = ifsc;
//		this.pan = pan;
//		this.phone = phone;
//		this.pinCode = pinCode;
//		this.state = state;
//		this.vendorName = vendorName;
//		this.contactPerson = contactPerson;
//		this.drivers = drivers;
//		this.routes = routes;
//		this.vehicles = vehicles;
//	}


	public int getVendorId() {
		return vendorId;
	}


	public Vendor(int vendorId, String addressLine1, String addressLine2, String addressLine3, String bankAccountName,
		String bankAccountNumber, String city, String govtId, String gstin, String ifsc, String pan, String phone,
		String pinCode, String state, String vendorName, String contactPerson) {
	super();
	this.vendorId = vendorId;
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
	this.addressLine3 = addressLine3;
	this.bankAccountName = bankAccountName;
	this.bankAccountNumber = bankAccountNumber;
	this.city = city;
	this.govtId = govtId;
	this.gstin = gstin;
	this.ifsc = ifsc;
	this.pan = pan;
	this.phone = phone;
	this.pinCode = pinCode;
	this.state = state;
	this.vendorName = vendorName;
	this.contactPerson = contactPerson;
}


	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine3() {
		return addressLine3;
	}


	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	public String getBankAccountName() {
		return bankAccountName;
	}


	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}


	public String getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGovtId() {
		return govtId;
	}


	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}


	public String getGstin() {
		return gstin;
	}


	public void setGstin(String gstin) {
		this.gstin = gstin;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


//	public List<Driver> getDrivers() {
//		return drivers;
//	}
//
//
//	public void setDrivers(List<Driver> drivers) {
//		this.drivers = drivers;
//	}
//
//
//	public List<Route> getRoutes() {
//		return routes;
//	}
//
//
//	public void setRoutes(List<Route> routes) {
//		this.routes = routes;
//	}
//
//
//	public List<Vehicle> getVehicles() {
//		return vehicles;
//	}
//
//
//	public void setVehicles(List<Vehicle> vehicles) {
//		this.vehicles = vehicles;
//	}


	

}