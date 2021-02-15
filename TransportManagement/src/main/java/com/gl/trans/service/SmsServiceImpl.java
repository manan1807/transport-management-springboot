package com.gl.trans.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl  implements SmsService{

	@Autowired
	MessageCreatorService messagecreatorService;
	
	
	@Override
	public String sendSms(String phone, String message1) {
		// TODO Auto-generated method stub
		final StringBuffer stringBuffer = new StringBuffer();
		try {
			// Construct data
			
			
		
			String apiKey = "apikey=" + "3/0ZI8X0fY8-kzazQToLuQuz5O2KEwaJWOH3GqEJzb" ;
			String message = "&message=" + "This is your message from GLTransport\n"  + message1 ; 
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + phone ;
			
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			
		}
		
		
		catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
		
		
		return stringBuffer.toString();
		
	}

	@Override
	public String sendSms(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	//	List <String> messages = new ArrayList<String>();
		
		final StringBuffer stringBuffer = new StringBuffer();
		try {
			// Construct data
			
			for(String i : map.keySet())
			{
		
			String apiKey = "apikey=" + "3/0ZI8X0fY8-kzazQToLuQuz5O2KEwaJWOH3GqEJzb" ;
			String message = "&message=" + "This is your message from GLTransport"  + map.get(i) ; 
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + i ;
			
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			}
			
		}
		catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
		
		return stringBuffer.toString();
	}
	
	
	
	
//	public static void main(String[] args) {
//		sendSms(null, null, null, null);
//	}
}