package com.gl.trans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.Driver;
@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {
	public Driver findFirstByDriverLicenseNumber(String driverLicenseNumber);
}
