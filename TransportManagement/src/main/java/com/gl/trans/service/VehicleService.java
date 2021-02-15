package com.gl.trans.service;

import java.io.FileInputStream;
import java.util.List;

import com.gl.trans.model.CabDriver;
import com.gl.trans.model.Driver;
import com.gl.trans.model.Vehicle;

public interface VehicleService {

	List<Vehicle> storeFileInDatabase(FileInputStream inputStream, String vendor);
}
