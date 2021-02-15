package com.gl.trans.service;
import java.io.FileInputStream;
import java.util.List;

import com.gl.trans.model.Driver;

public interface DriverService {
	

	List<Driver> storeFileInDatabase(FileInputStream inputStream, String vendor);

	
	
}
