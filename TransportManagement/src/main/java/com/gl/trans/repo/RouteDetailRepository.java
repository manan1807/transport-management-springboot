package com.gl.trans.repo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.gl.trans.model.Employee;
import com.gl.trans.model.RouteDetail;



@Repository
public interface RouteDetailRepository extends CrudRepository<RouteDetail, Integer> {
	List<RouteDetail> findAll();
	//Routedetail findByEmployeeId(int employeeId);

	

	

	

	
}
