package com.gl.trans.service;
import java.io.FileInputStream;
import java.util.List;

import com.gl.trans.model.Driver;
import com.gl.trans.model.Guard;

public interface GuardService
{
	public List<Guard> setValueInStringArray(FileInputStream inputStream);
}
