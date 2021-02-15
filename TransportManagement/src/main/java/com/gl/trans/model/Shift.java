package com.gl.trans.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the shift database table.
 * 
 */
@Entity
@NamedQuery(name="Shift.findAll", query="SELECT s FROM Shift s")
public class Shift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="shiftid")
	private int shiftId;
    @Column(name="shiftendtime")
	private Time shiftEndTime;
    @Column(name="shiftname")
	private String shiftName;
    @Column(name="shiftstarttime")
	private Time shiftStartTime;

	//bi-directional many-to-one association to Employee
//	@OneToMany(mappedBy="shift")
//	private List<Employee> employees;

	public Shift() {
	}

	public int getShiftId() {
		return this.shiftId;
	}

	public void setShiftId(int shiftId) {
		this.shiftId = shiftId;
	}

	public Time getShiftEndTime() {
		return this.shiftEndTime;
	}

	public void setShiftEndTime(Time shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}

	public String getShiftName() {
		return this.shiftName;
	}

	public void setShiftName(String shiftName) {
		this.shiftName = shiftName;
	}

	public Time getShiftStartTime() {
		return this.shiftStartTime;
	}

	public void setShiftStartTime(Time shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}

//	public List<Employee> getEmployees() {
//		return this.employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		getEmployees().add(employee);
//		employee.setShift(this);
//
//		return employee;
//	}
//
//	public Employee removeEmployee(Employee employee) {
//		getEmployees().remove(employee);
//		employee.setShift(null);
//
//		return employee;
//	}

}