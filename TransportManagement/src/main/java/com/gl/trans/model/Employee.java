package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@XmlRootElement
@Entity
@Table(name="employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employeeid")
	private int employeeId;
	@Column(name = "addressline1")
	private String addressLine1;
	@Column(name = "addressline2")
	private String addressLine2;
	@Column(name = "addressline3")
	private String addressLine3;
	@Column(name = "city")
	private String city;
	@Column(name = "contactnumber")
	private String contactNumber;
	@Column(name = "department")
	private String department;
	@Column(name = "emailid")
	private String emailId;
	@Column(name = "gender")
	private String gender;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "leavestatus")
	private String leaveStatus;
	@Column(name = "longitude")
	private double longitude;
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "pincode")
	private String pinCode;
	@Column(name = "state")
	private String state;
	@Column(name = "usertype")
	private String userType;
	@Column(name = "worklocation")
	private String workLocation;
//
	//bi-directional many-to-one association to Request
	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<Request> requests;
//
	//bi-directional many-to-one association to Routedetail
	@JsonIgnore
	@OneToMany(mappedBy="employee")
	private List<RouteDetail> routedetails;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="linemanagerid")
	private Employee lineManager;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="shiftid")
	private Shift shift;
	
	public Employee() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getLeaveStatus() {
		return this.leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public Employee getLineManager() {
		return lineManager;
	}

	public void setLineManager(Employee lineManager) {
		this.lineManager = lineManager;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getWorkLocation() {
		return this.workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	public Shift getShift() {
		return this.shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}
	
	
	public List<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public Request addRequest(Request request) {
		getRequests().add(request);
		request.setEmployee(this);

		return request;
	}

	public Request removeRequest(Request request) {
		getRequests().remove(request);
		request.setEmployee(null);

		return request;
	}

	public List<RouteDetail> getRoutedetails() {
		return this.routedetails;
	}

	public void setRoutedetails(List<RouteDetail> routedetails) {
		this.routedetails = routedetails;
	}

	public RouteDetail addRoutedetail(RouteDetail routedetail) {
		getRoutedetails().add(routedetail);
		routedetail.setEmployee(this);

		return routedetail;
	}

	public RouteDetail removeRoutedetail(RouteDetail routedetail) {
		getRoutedetails().remove(routedetail);
		routedetail.setEmployee(null);

		return routedetail;
	}

}