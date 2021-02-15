package com.gl.trans.model;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;

public class CabDriverCsv {
	@CsvBindByName(column = "cabDriverId", required = true)
	private int cabDriverId;
	@CsvBindByName(column = "vehicleNumber", required = true)
	private String vehicleNumber;
	@CsvBindByName(column="driverLicenseNumber", required=true)
	private String driverLicenseNumber;
	@CsvBindByName(column="cabDriverDate", required=true)
	private String cabDriverDate;
	public int getCabDriverId() {
		return cabDriverId;
	}
	public void setCabDriverId(int cabDriverId) {
		this.cabDriverId = cabDriverId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	public String getCabDriverDate() {
		return cabDriverDate;
	}
	public void setCabDriverDate(String cabDriverDate) {
		this.cabDriverDate = cabDriverDate;
	}
	public CabDriverCsv() {
		super();
	}
	@Override
	public String toString() {
		return "CabDriverCsv [cabDriverId=" + cabDriverId + ", vehicleNumber=" + vehicleNumber
				+ ", driverLicenseNumber=" + driverLicenseNumber + ", cabDriverDate=" + cabDriverDate + "]";
	}

	
}
