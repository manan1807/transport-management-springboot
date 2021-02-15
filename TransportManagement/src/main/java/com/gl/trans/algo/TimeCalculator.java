package com.gl.trans.algo;

import java.sql.Time;
import java.util.List;

import com.gl.trans.model.Employee;

public interface TimeCalculator {
	 Time addTime(Time shiftStartTime, int time) ;
	 List<Time> allocateTime(double[][] distance, Time shiftTime, List<Employee> curRoute,
				boolean drop,int size) ;
	 Time getTimeEmployee(Employee emp, double[][] distance, Time shiftTime,boolean drop,int size);
	 Time getTimeEmployee(Employee employee, Employee employee2, double[][] distance, List<Time> timeList,boolean drop,int size);
}
