package com.gl.trans.service;

import java.sql.Time;

import java.util.Map;




public interface SmsService {
	public String sendSms(String phone, String message);
	public String sendSms(Map<String,String> map);

	
	
	
}
