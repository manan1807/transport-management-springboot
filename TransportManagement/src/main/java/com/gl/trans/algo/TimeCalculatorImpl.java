package com.gl.trans.algo;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.Employee;
import com.gl.trans.model.Route;
@Component
public class TimeCalculatorImpl implements TimeCalculator{
	@Autowired
	TimeCalculatorImpl tc;
	int avgCarSpeed=25;
	List<Time> timeList=new ArrayList<>();


	//////////////////////////////////
	public Time addTime(Time shiftStartTime, int time) {
		time=time-15;
		LocalTime localTime = shiftStartTime.toLocalTime();
		LocalTime plusMinutes = localTime.plusMinutes(time);
		String text=plusMinutes.toString();
		text=text.substring(0, 5);
		plusMinutes=LocalTime.parse(text, DateTimeFormatter.ofPattern("HH:mm"));
		Time newTime =	Time.valueOf(plusMinutes);		
		return newTime;
	}

	public List<Time> allocateTime(double[][] distance, Time shiftTime, List<Employee> curRoute,
			boolean drop, int size) {


		if(curRoute.size()>1) {

			if(curRoute.get(0).equals(curRoute.get(1))) {
				curRoute.remove(0);
			}}

		int n= curRoute.size();
		Time t1;
		//		
		t1=tc.getTimeEmployee(curRoute.get(n-1),distance,shiftTime,drop,size);
		timeList.add(t1);
		for(int i=n-1;i>0;i--) {
			Time ti=tc.getTimeEmployee(curRoute.get(i),curRoute.get(i-1),distance,timeList,drop,size);
			timeList.add(ti);
		}
		return timeList;
	}

	public Time getTimeEmployee(Employee emp, double[][] distance, Time shiftTime,boolean drop, int size) {

		double dist=distance[0][emp.getEmployeeId()%size];
		int timetaken=(int) ((dist)/avgCarSpeed);
		Time newTime;

		if (drop) { newTime=tc.addTime(shiftTime, timetaken);}
		else {  newTime=tc.addTime(shiftTime, -timetaken-10);}
		return newTime;
	}

	public Time getTimeEmployee(Employee employee, Employee employee2, double[][] distance, List<Time> timeList,boolean drop,int size) {
		int timetaken;
		timetaken=(int) ((distance[employee.getEmployeeId()%size][employee2.getEmployeeId()%size])/avgCarSpeed);
		Time t1=timeList.get(timeList.size()-1);
		Time newTime;


		if (drop) newTime=tc.addTime(t1, timetaken+10);
		else  {newTime=tc.addTime(t1, -timetaken-10);}
		return newTime;
	}




}
