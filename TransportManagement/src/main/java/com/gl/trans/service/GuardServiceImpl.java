package com.gl.trans.service;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Driver;
import com.gl.trans.model.Guard;
import com.gl.trans.repo.DriverRepository;
import com.gl.trans.repo.GuardRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class GuardServiceImpl implements GuardService
{
	private static Logger log=Logger.getRootLogger();

	@Autowired
	GuardRepository guardRepo;
	
	@Override
	public List<Guard> setValueInStringArray(FileInputStream inputStream)
	{
		InputStreamReader inputStreamreader=new InputStreamReader(inputStream);
		CsvToBean<Guard> csvToBean = new CsvToBeanBuilder<Guard>(inputStreamreader).withType(Guard.class).withIgnoreLeadingWhiteSpace(true).build();
		List<Guard> guardObject = csvToBean.parse();
		log.debug("guard list receiveing");
		for(Guard guard: guardObject)
		{
            guard=guardRepo.save(guard);

		}
		return guardObject;
	}

}
