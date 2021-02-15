package com.gl.trans.service;
import java.io.FileInputStream;
import java.util.List;

import com.gl.trans.model.CabDriver;

public interface CabDriverService {

void storeCabDriverInDatabase(FileInputStream inputStream);

List<CabDriver> findAll();

}
