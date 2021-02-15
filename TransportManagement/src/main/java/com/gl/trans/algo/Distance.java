package com.gl.trans.algo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Employee;

public interface Distance {
	Employee findNearestEmployee( boolean[] picked, List<Employee> employeeList,Employee current);
	double getDistance(Employee p1, Employee p2);
	Employee findFarthestEmployee(double[] ds, boolean[] picked,List<Employee> list) ;
	double[][] getDistanceMatrix(List<Employee> list);
}
