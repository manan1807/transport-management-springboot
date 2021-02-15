package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;


/**
 * The persistent class for the guard database table.
 * 
 */
@Entity
@XmlRootElement
@NamedQuery(name="Guard.findAll", query="SELECT g FROM Guard g")
public class Guard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "guardid")
	private int guardId;
	@Column(name = "addressline1")
	private String addressLine1;
	@Column(name = "addressline2")
	private String addressLine2;
	@Column(name = "addressline3")
	private String addressLine3;
	@Column(name = "city")
	private String city;
	@Column(name = "guardcode")
	private String guardCode;
	@Column(name = "name")
	private String name;
	@Column(name = "phonenumber")
	private String phoneNumber;
	@Column(name = "pincode")
	private int pinCode;
	@Column(name = "shift")
	private String shift;
	@Column(name = "state")
	private String state;

	//bi-directional many-to-one association to Route
//	@OneToMany(mappedBy="guard")
//	private List<Route> routes;

	public Guard() {
	}

	public int getGuardId() {
		return this.guardId;
	}

	public void setGuardId(int guardId) {
		this.guardId = guardId;
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

	public String getGuardCode() {
		return this.guardCode;
	}

	public void setGuardCode(String guardCode) {
		this.guardCode = guardCode;
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

	public String getShift() {
		return this.shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


//	public List<Route> getRoutes() {
//		return this.routes;
//	}
//
//	public void setRoutes(List<Route> routes) {
//		this.routes = routes;
//	}
//
//	public Route addRoute(Route route) {
//		getRoutes().add(route);
//		route.setGuard(this);
//
//		return route;
//	}
//
//	public Route removeRoute(Route route) {
//		getRoutes().remove(route);
//		route.setGuard(null);
//
//		return route;
//	}
	

}