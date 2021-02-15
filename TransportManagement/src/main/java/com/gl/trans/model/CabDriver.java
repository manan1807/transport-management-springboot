package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import com.opencsv.bean.CsvBindByName;

import java.util.Date;


/**
 * The persistent class for the cabdriver database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="cabdriver")
public class CabDriver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cabdriverid")
	private int cabDriverId;

	@Temporal(TemporalType.DATE)
	@Column(name="cabdriverdate")
	private Date cabDriverDate;

	//bi-directional many-to-one association to Vehicle
	@ManyToOne
	@JoinColumn(name="vehicleid")
	private Vehicle vehicle;

	//bi-directional many-to-one association to Driver
	@ManyToOne
	@JoinColumn(name="driverid")
	private Driver driver;

	public CabDriver() {
	}

	public int getCabDriverId() {
		return this.cabDriverId;
	}

	public void setCabDriverId(int cabDriverId) {
		this.cabDriverId = cabDriverId;
	}

	
	public Date getCabDriverDate() {
		return cabDriverDate;
	}

	public void setCabDriverDate(Date cabDriverDate) {
		this.cabDriverDate = cabDriverDate;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}