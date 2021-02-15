package com.gl.trans.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LogoutController {
 private static final Logger logger=Logger.getRootLogger();
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logOutFunction(HttpSession session)
	{

        try {
        	session.invalidate();
        	return "login";
		}
        catch (Exception e) {
			logger.debug("use is not logged In ");
		}
        return "";
		
	}
	
}
