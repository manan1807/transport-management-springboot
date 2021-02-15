package com.gl.trans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
  
	public Vehicle findFirstByVehicleNumber(String vehicleNumber);
}
