package com.gl.trans.service;



import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.gl.trans.model.Employee;
import com.gl.trans.model.Route;
import com.gl.trans.model.RouteDetail;
import com.gl.trans.repo.RouteDetailRepository;

@Service
@Transactional
public class RouteDetailServiceImpl  implements RouteDetailService 
{
	public static Logger logger = Logger.getRootLogger();
	

	RouteDetail routeDetail ;
	
	@Autowired
	MessageCreatorService messageCreatorService;
	
	@Autowired
	SmsService smsService;
	
	@Autowired
	RouteDetailRepository RouteDetailRepository;
	
	
	
//	@PostConstruct
//	
//	public void callMessageService()
//	{
//	
//		//here messgae service is called with starting and ending RouteDetailsId
//		Map<String,String> hmap = messageCreatorService.createMessage(routeDetail.getRouteDetailId(),routeDetail.getRouteDetailId());
//		
//		//here smsService is called by passing object of map 
//		String s1 = smsService.sendSms(hmap);	
//	 
//	}



	@Override
	public Map<Integer,Route> getEmployeeCabDetails(Employee employee) {
		// TODO Auto-generated method stub
		
		Map<Integer,Route> map = new HashMap<Integer,Route>();
	
	LocalDate localDate = LocalDate.now();
	
	LocalTime now = LocalTime.now();
	 
	 Time time = Time.valueOf( now );
	List<RouteDetail> list= employee.getRoutedetails();
	
	List<RouteDetail> list1 = list.stream().filter(x ->  x.getRouteDetailDate().toLocalDate().isAfter(localDate) && x.getRouteDetailTime().toLocalTime().isAfter(now)).collect(Collectors.toList());
	
	for(int i = 0; i<list1.size();i++)
	{
		 routeDetail = list1.get(i);
		 int RouteDetailId  = routeDetail.getRouteDetailId();
			Route route = routeDetail.getRoute();
			logger.debug(route.getRouteId());
			
			map.put(RouteDetailId,route);
	}
		
		return map;
	}

	@Override
	public Map<Route,List<RouteDetail>> getEmployeeRouteStatus(Employee employee) {
//		// TODO Auto-generated method stub
		
	Map<Route,List<RouteDetail>> map = new HashMap<Route,List<RouteDetail>>();
//	Map<Employee, String> map1 = new HashMap<Employee, String>();
	LocalDate localDate = LocalDate.now();

	LocalTime now = LocalTime.now();
	List<RouteDetail> list= employee.getRoutedetails();
	
	List<RouteDetail> list1 = list.stream().filter(x ->  x.getRouteDetailDate().toLocalDate().isAfter(localDate) || x.getRouteDetailTime().toLocalTime().isAfter(now)).collect(Collectors.toList());
	
	for(int i = 0; i<list1.size();i++)
	{
	
		 routeDetail = list1.get(i);
		
//		 int RouteDetailId  = routeDetail.getRouteDetailId();
			Route route = routeDetail.getRoute();
			
			
			//here list of RouteDetails with respect to route is stored 
			List<RouteDetail> list3= findRouteDetailListByRoute(route);	
			
		
//			for(RouteDetail rd : list3)
//			{
//				
//				map1.put(rd.getEmployee(), rd.getAcknowledgement());
//			}
			
			map.put(route, list3);
			
		}

	return map;
	
	
	}
	private List<RouteDetail> findRouteDetailListByRoute(Route route) {
		// TODO Auto-generated method stub
			
			List<RouteDetail> RouteDetaillist =new ArrayList<RouteDetail>();
			List<RouteDetail> allRouteDetail=RouteDetailRepository.findAll().stream().collect(Collectors.toList());		
			
			
			
			for(RouteDetail rd:allRouteDetail) {
				if(rd.getRoute().getRouteId()==route.getRouteId()) {
					
					RouteDetaillist.add(rd);
				}
			}
				return RouteDetaillist;
	}
			
	

	
	@Override
	public void saveAcknowledgement(int RouteDetailId, String acknowledgement) {
		// TODO Auto-generated method stub
	
		//LocalDate localDate = LocalDate.now();
		// java.sql.Date date = java.sql.Date.valueOf( localDate );
		
		LocalTime now = LocalTime.now();
		 
		 Time time = Time.valueOf( now );
		
		 Optional<RouteDetail> optionalrdid= RouteDetailRepository.findById(RouteDetailId);
		 RouteDetail RouteDetail = optionalrdid.get();
		 
		 RouteDetail.setAcknowledgement(acknowledgement);
		 
		 RouteDetail.setAcknowledgementTime(time);
		
		 RouteDetailRepository.save(RouteDetail);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
		//list.forEach(r-> logger.debug("-------------------------->"+r.getDate().toLocalDate().isAfter(localDate)));
		
		//List<RouteDetail> list1 = list.stream().filter(x ->  x.getRouteDetailDate().toLocalDate().isAfter(localDate) && x.getRouteDetailTime().toLocalTime().isAfter(now)).collect(Collectors.toList());
		
		//list1.forEach(r-> logger.debug("-------------------------->"+r.getRouteDetailId()));
		
		//list = list.stream().sorted(Comparator.comparing(RouteDetail::getRouteDetailId)).collect(Collectors.toList());
		
	//	List<RouteDetail> list1	= list.stream().sorted(Comparator.comparing(RouteDetail::getRouteDetailId).reversed()).collect(Collectors.toList());
		
		//logger.debug("berry the boyyyyyyy   "+list1.size());
//		list1.forEach(r-> logger.debug("-------------------------->"+r.getRouteDetailId()));
		
		
	
		
//		for(int i = 0; i<list1.size();i++)
//		{
//			 RouteDetail = list1.get(i);
//			break;
//		}
//	
//		logger.debug(RouteDetail.getRouteDetailId());

		
//	RouteDetail.setAcknowledgement(acknowledgement);
		
		
		//RouteDetail.setAcknowledgementTime(time);
		
		// RouteDetailRepository.save(RouteDetail);
		
	}





}

