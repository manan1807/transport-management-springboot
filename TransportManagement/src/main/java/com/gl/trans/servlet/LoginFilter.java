package com.gl.trans.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
, urlPatterns = { "/*" })
public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session= req.getSession(false);
		
         if(session != null || session.getAttribute("employee")==null) {
			
		    System.out.println("Not logged in hence redirected to Login Page");	
			req.getRequestDispatcher("login").forward(request, response);
			
		}
         chain.doFilter(request, response);
	

		
	}

}
