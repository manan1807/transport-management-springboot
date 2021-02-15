package com.gl.trans.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.sql.Time;
import java.sql.Date;
import java.util.List;


/**
 * The persistent class for the route database table.
 * 
 */
@Entity
@Table(name="route")
@XmlRootElement
//@NamedQuery(name="Route.findAll", query="SELECT r FROM Route r")
public class Route implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "routeid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int routeId;
	@Column(name = "actualendtime")
	private Time actualEndTime;
	@Column(name = "actualstarttime")
	private Time actualStartTime;
	@Column(name = "estimatedendtime")
	private Time estimatedEndTime;
	@Column(name = "estimatedstarttime")
	private Time estimatedStartTime;
	@Column(name="routedate")
	private Date routeDate;
	//bi-directional many-to-one association to Driver
	@ManyToOne
	@JoinColumn(name="cabdriverid")
	private CabDriver cabdriver;

	@OneToMany(mappedBy="route")
	private List<Request> requests;
	

	//bi-directional many-to-one association to Guard
	@ManyToOne
	@JoinColumn(name="guardid")
	private Guard guard;

	//bi-directional many-to-one association to Request
//	@ManyToOne
//	@JoinColumn(name="requestid")
//	private Request request;


	//bi-directional many-to-one association to Vendor
	@ManyToOne
	@JoinColumn(name="vendorid")
	private Vendor vendor;

	//bi-directional many-to-one association to RouteDetail
	//	@OneToMany(mappedBy="route")
	//	private List<RouteDetail> routedetails;

	public Route() {
	}

	public int getRouteId() {
		return this.routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public Time getActualEndTime() {
		return this.actualEndTime;
	}

	public void setActualEndTime(Time actualEndTime) {
		this.actualEndTime = actualEndTime;
	}


	public Date getRouteDate() {
		return routeDate;
	}

	public void setRouteDate(Date routeDate) {
		this.routeDate = routeDate;
	}

	public CabDriver getCabdriver() {
		return cabdriver;
	}

	public void setCabdriver(CabDriver cabdriver) {
		this.cabdriver = cabdriver;
	}

	public Time getEstimatedEndTime() {
		return this.estimatedEndTime;
	}

	public void setEstimatedEndTime(Time estimatedEndTime) {
		this.estimatedEndTime = estimatedEndTime;
	}


	public Time getEstimatedStartTime() {
		return estimatedStartTime;
	}

	public void setEstimatedStartTime(Time estimatedStartTime) {
		this.estimatedStartTime = estimatedStartTime;
	}


	public Guard getGuard() {
		return this.guard;
	}

	public void setGuard(Guard guard) {
		this.guard = guard;
	}

//	public Request getRequest() {
//		return this.request;
//	}
//
//	public void setRequest(Request request) {
//		this.request = request;
//	}

	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Time getActualStartTime() {
		return actualStartTime;
	}

	public void setActualStartTime(Time actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public List<Request> getRequests() {
		return requests;
	}

	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}

	public Request addRequest(Request request) {
		getRequests().add(request);
		request.setRoute(this);

		return request;
	}

	public Request removeRequest(Request request) {
		getRequests().remove(request);
		request.setRoute(null);

		return request;
	}

	//	public List<RouteDetail> getRoutedetails() {
	//		return this.routedetails;
	//	}
	//
	//	public void setRoutedetails(List<RouteDetail> routedetails) {
	//		this.routedetails = routedetails;
	//	}
	//
	//	public RouteDetail addRoutedetail(RouteDetail routedetail) {
	//		getRoutedetails().add(routedetail);
	//		routedetail.setRoute(this);
	//
	//		return routedetail;
	//	}
	//
	//	public RouteDetail removeRoutedetail(RouteDetail routedetail) {
	//		getRoutedetails().remove(routedetail);
	//		routedetail.setRoute(null);
	//
	//		return routedetail;
	//	}

}