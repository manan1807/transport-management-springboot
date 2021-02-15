package com.gl.trans.model;

import java.io.Serializable;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import com.opencsv.bean.CsvBindByName;

import java.util.List;


/**
 * The persistent class for the driver database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Driver.findAll", query="SELECT d FROM Driver d")
public class Driver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "driverid")
	@CsvBindByName(column = "driverId", required = true)
	private int driverId;
	@Column(name = "addressline1")
	@CsvBindByName(column = "addressLine1", required = true)
	private String addressLine1;
	@Column(name = "addressline2")
	@CsvBindByName(column = "addressLine2", required = false)
	private String addressLine2;
	@Column(name = "addressline3")
	@CsvBindByName(column = "addressLine3", required = false)
	private String addressLine3;
	@Column(name = "city")
	@CsvBindByName(column = "city", required = true)
	private String city;
	@Column(name = "driverlicensenumber")
	@CsvBindByName(column = "driverLicenseNumber", required = true)
	private String driverLicenseNumber;
	@Column(name = "name")
	@CsvBindByName(column = "name", required = true)
	private String name;
	@Column(name = "phonenumber")
	@CsvBindByName(column = "phoneNumber", required = true)
	private String phoneNumber;
	@Column(name = "pincode")
	@CsvBindByName(column = "pinCode", required = true)
	private int pinCode;
	@Column(name = "state")
	@CsvBindByName(column = "state", required = true)
	private String state;

	//bi-directional many-to-one association to Vendor
	@ManyToOne
	@JoinColumn(name="vendorid")
	@CsvBindByName(column = "vendor", required = false)
	private Vendor vendor;

	//bi-directional many-to-one association to Route
	//	@OneToMany(mappedBy="driver")
	//	private List<Route> routes;

	public Driver() {
	}

	public int getDriverId() {
		return this.driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDriverLicenseNumber() {
		return this.driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}


	//	public List<Route> getRoutes() {
	//		return this.routes;
	//	}
	//
	//	public void setRoutes(List<Route> routes) {
	//		this.routes = routes;
	//	}

	//	public Route addRoute(Route route) {
	//		getRoutes().add(route);
	//		route.setDriver(this);
	//
	//		return route;
	//	}
	//
	//	public Route removeRoute(Route route) {
	//		getRoutes().remove(route);
	//		route.setDriver(null);
	//
	//		return route;
	//	}
	

}