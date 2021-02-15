package com.gl.trans.algo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.trans.model.Employee;
import com.gl.trans.model.OfficeAddress;
@Service
public class DistanceCalculater implements Distance{
	
	private static Logger logger=Logger.getRootLogger();
	
	@Autowired
	DistanceCalculater distanceCalculater;
	public  double getDistance(Employee p1, Employee p2)
	{
		
		double x1 = p1.getLatitude()*(Math.PI/180);
		double y1 = p1.getLongitude()*(Math.PI/180);
		double x2 = p2.getLatitude()*(Math.PI/180);
		double y2 = p2.getLongitude()*(Math.PI/180);
		double x=x2-x1,y=y2-y1;
		double z = Math.sin(x/2)* Math.sin(x/2)+  Math.cos(x1) * Math.cos(x2) *  Math.sin(y/2) * Math.sin(y/2);
		double c= 2* Math.atan2(Math.sqrt(z),Math.sqrt(1-z));
		double distance= 6371*c;
		return distance;
	}
	
	
	public  Employee findNearestEmployee(  boolean[] picked, List<Employee> employeeList,Employee current) {
		OfficeAddress office= new OfficeAddress();
		Employee nearest=null;
		int i=0;
		double neighbourArea;
		double minArea = Double.MAX_VALUE;
		double xemployee=current.getLatitude();
		double yemployee=current.getLongitude();
		double xneighbour=0.0;
		double yneighbour=0.0;
		double xoffice=office.getLatitude();
		double yoffice=office.getLongitude();
		for(Employee e: employeeList) {
			if(picked[i]==false)
			{
				xneighbour=e.getLatitude();
				yneighbour=e.getLongitude();
				neighbourArea=Math.abs(0.5*(xemployee*(yneighbour-yoffice)+xneighbour*
						(yoffice-yemployee)+xoffice*(yemployee-yneighbour)));
				if(neighbourArea<minArea) {
					minArea=neighbourArea;
					nearest=e;
				}
			}
			i++;
		}
		return nearest;
	}
	


	public  Employee findFarthestEmployee(double[] ds, boolean[] picked,List<Employee> list) {
		double min = Double.MIN_VALUE;
		int pos = 0;
		for(int i = 1; i<ds.length; i++)
		{
			if(!picked[i ] && ds[i] > min)
			{
				min = ds[i] ;
				pos = i;
			}
		}
		
		return list.get(pos);
	}
	
	public  double[][] getDistanceMatrix(List<Employee> list)
	{
		
		int n = list.size();
		double[][] distance = new double[n][n];
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				distance[i][j] = distanceCalculater.getDistance(list.get(i),list.get(j));
				
			}
			
		}
		for(int i=0;i<n;i++) {
		}
		return distance;
	}




	
}
