package com.gl.trans.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface CabListService
{
	public List<Object[]> getcabList();
	void saveStartTimeToDatabase();
}
