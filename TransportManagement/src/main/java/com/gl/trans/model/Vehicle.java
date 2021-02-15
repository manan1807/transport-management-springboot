package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vehicle database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "vehicleid")
	private int vehicleId;
	@Column(name = "chasisnumber")
	private String chasisNumber;
	@Column(name = "vehiclecapacity")
	private int vehicleCapacity;
	@Column(name = "vehicleinsurance")
	private String vehicleInsurance;
	@Column(name = "vehiclename")
	private String vehicleName;
	@Column(name = "vehiclenumber")
	private String vehicleNumber;

	//bi-directional many-to-one association to Route
//	@OneToMany(mappedBy="vehicle")
//	private List<Route> routes;

	//bi-directional many-to-one association to Vendor
	@ManyToOne
	@JoinColumn(name="vendorid")
	private Vendor vendor;

	public Vehicle() {
	}

	public int getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getChasisNumber() {
		return this.chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public int getVehicleCapacity() {
		return this.vehicleCapacity;
	}

	public void setVehicleCapacity(int vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}

	public String getVehicleInsurance() {
		return this.vehicleInsurance;
	}

	public void setVehicleInsurance(String vehicleInsurance) {
		this.vehicleInsurance = vehicleInsurance;
	}

	public String getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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
//		route.setVehicle(this);
//
//		return route;
//	}
//
//	public Route removeRoute(Route route) {
//		getRoutes().remove(route);
//		route.setVehicle(null);
//
//		return route;
//	}

	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

}