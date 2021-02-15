package com.gl.trans.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.sql.Time;
import java.sql.Date;
import java.util.List;


/**
 * The persistent class for the request database table.
 * 
 */
@Entity
@XmlRootElement	
@Table(name="request")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="requestid")
	private int requestId;
    @Column(name="requestdate")
	private Date requestDate;
	@Column(name="dropaddressline1")
	private String dropAddressLine1;
	@Column(name="dropaddressline2")
	private String dropAddressLine2;
	@Column(name="dropaddressline3")
	private String dropAddressLine3;
	@Column(name="dropcity")
	private String dropCity;
	@Column(name="droppincode")
	private int dropPinCode;
	@Column(name="dropstate")
	private String dropState;
	@Column(name="pickupaddressline1")
	private String pickUpAddressLine1;
	@Column(name="pickupaddressline2")
	private String pickUpAddressLine2;
	@Column(name="pickupaddressline3")
	private String pickUpAddressLine3;
	@Column(name="pickupcity")
	private String pickUpCity;
	@Column(name="pickuppincode")
	private int pickUpPinCode;
	@Column(name="pickupstate")
	private String pickUpState;
	@Column(name="remarks")
	private String remarks;
	@Column(name="requesttype")
	private String requestType;
	@Column(name="requesttime")
	private Time requestTime;
	@Column(name="travelerid")
	private int travelerId;
	@Column(name="travelername")
	private String travelerName;
	@Column(name="travellercontact")
	private String travellerContact;
	@Column(name="requeststatus")
	private String requestStatus;
	@Column(name="pickupordrop")
     private String pickUpOrDrop;
	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="requesterid")
	private Employee employee;
	

	@ManyToOne
	@JoinColumn(name="routeid")
	private Route route;
	//bi-directional many-to-one association to Route
//	@OneToMany(mappedBy="request")
//	private List<Route> routes;

	public Request() {
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	

	public String getDropAddressLine1() {
		return this.dropAddressLine1;
	}

	public void setDropAddressLine1(String dropAddressLine1) {
		this.dropAddressLine1 = dropAddressLine1;
	}

	public String getDropAddressLine2() {
		return this.dropAddressLine2;
	}

	public void setDropAddressLine2(String dropAddressLine2) {
		this.dropAddressLine2 = dropAddressLine2;
	}

	public String getDropAddressLine3() {
		return this.dropAddressLine3;
	}

	public void setDropAddressLine3(String dropAddressLine3) {
		this.dropAddressLine3 = dropAddressLine3;
	}

	public String getDropCity() {
		return this.dropCity;
	}

	public void setDropCity(String dropCity) {
		this.dropCity = dropCity;
	}

	public int getDropPinCode() {
		return this.dropPinCode;
	}

	public void setDropPinCode(int dropPinCode) {
		this.dropPinCode = dropPinCode;
	}

	public String getDropState() {
		return this.dropState;
	}

	public void setDropState(String dropState) {
		this.dropState = dropState;
	}

	public String getPickUpAddressLine1() {
		return this.pickUpAddressLine1;
	}

	public void setPickUpAddressLine1(String pickUpAddressLine1) {
		this.pickUpAddressLine1 = pickUpAddressLine1;
	}

	public String getPickUpAddressLine2() {
		return this.pickUpAddressLine2;
	}

	public void setPickUpAddressLine2(String pickUpAddressLine2) {
		this.pickUpAddressLine2 = pickUpAddressLine2;
	}

	public String getPickUpAddressLine3() {
		return this.pickUpAddressLine3;
	}

	public void setPickUpAddressLine3(String pickUpAddressLine3) {
		this.pickUpAddressLine3 = pickUpAddressLine3;
	}

	public String getPickUpCity() {
		return this.pickUpCity;
	}

	public void setPickUpCity(String pickUpCity) {
		this.pickUpCity = pickUpCity;
	}

	public int getPickUpPinCode() {
		return this.pickUpPinCode;
	}

	public void setPickUpPinCode(int pickUpPinCode) {
		this.pickUpPinCode = pickUpPinCode;
	}

	public String getPickUpState() {
		return this.pickUpState;
	}

	public void setPickUpState(String pickUpState) {
		this.pickUpState = pickUpState;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}


	public int getTravelerId() {
		return this.travelerId;
	}

	public void setTravelerId(int travelerId) {
		this.travelerId = travelerId;
	}

	public String getTravelerName() {
		return this.travelerName;
	}

	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	public String getTravellerContact() {
		return travellerContact;
	}

	public void setTravellerContact(String travellerContact) {
		this.travellerContact = travellerContact;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Time getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Time requestTime) {
		this.requestTime = requestTime;
	}

	public String getPickUpOrDrop() {
		return pickUpOrDrop;
	}

	public void setPickUpOrDrop(String pickUpOrDrop) {
		this.pickUpOrDrop = pickUpOrDrop;
	}
	 

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
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
//		route.setRequest(this);
//
//		return route;
//	}
//
//	public Route removeRoute(Route route) {
//		getRoutes().remove(route);
//		route.setRequest(null);
//
//		return route;
//	}

	
}