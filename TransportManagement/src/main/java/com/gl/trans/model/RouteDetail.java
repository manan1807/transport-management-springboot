package com.gl.trans.model;

import java.io.Serializable;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.sql.Time;
import java.sql.Date;


/**
 * The persistent class for the routedetail database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name = "routedetail")
@NamedQuery(name="RouteDetail.findAll", query="SELECT r FROM RouteDetail r")
public class RouteDetail implements Serializable {
	private static final long serialVersionUID = 1L;
   @Column(name="acknowledgement")
	private String acknowledgement;
   @Column(name="acknowledgementtime")
	private Time acknowledgementTime;

   @Column(name="routedetaildate")
//	@Temporal(TemporalType.DATE)
	private Date routeDetailDate;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="routedetailid")
	private int routeDetailId;
    @Column(name="routedetailtime")
	private Time routeDetailTime;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;

	//bi-directional many-to-one association to Route
	@ManyToOne
	@JoinColumn(name="routeid")
	private Route route;

	public RouteDetail() {
	}

	public String getAcknowledgement() {
		return this.acknowledgement;
	}

	public void setAcknowledgement(String acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	public Time getAcknowledgementTime() {
		return this.acknowledgementTime;
	}

	public void setAcknowledgementTime(Time acknowledgementTime) {
		this.acknowledgementTime = acknowledgementTime;
	}



	public Date getRouteDetailDate() {
		return routeDetailDate;
	}

	public void setRouteDetailDate(Date routeDetailDate) {
		this.routeDetailDate = routeDetailDate;
	}

	public Time getRouteDetailTime() {
		return routeDetailTime;
	}

	public void setRouteDetailTime(Time routeDetailTime) {
		this.routeDetailTime = routeDetailTime;
	}

	public int getRouteDetailId() {
		return this.routeDetailId;
	}

	public void setRouteDetailId(int routeDetailId) {
		this.routeDetailId = routeDetailId;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

}