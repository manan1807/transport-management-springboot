package com.gl.trans.controller;

import java.sql.Date;

import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gl.trans.model.Employee;
import com.gl.trans.model.OfficeAddress;
import com.gl.trans.model.Request;
import com.gl.trans.repo.EmployeeRepository;
import com.gl.trans.repo.OfficeRespository;
import com.gl.trans.repo.RequestRepository;


@Controller
public class RequestController {

       @Autowired 
       RequestRepository  requestrepository;
       @Autowired
       OfficeRespository officeRespository;
       @Autowired
       EmployeeRepository employeeRepository;

       private static Logger logger = Logger.getRootLogger();


       @RequestMapping(value="/html/selfrequest" ,method=RequestMethod.GET, produces="application/json")
       public @ResponseBody Employee getSelfRequest()
       {

              logger.debug("Home Address One===>");
              Employee  employee = employeeRepository.findFirstByEmailId("anand_yadav@guardianindia.com");

              //       Employee employee1 = employee.get();

              logger.debug("Home Address One===>"+employee);



              return employee;

       }

       @RequestMapping(value="/html/homeAddress1" ,method=RequestMethod.GET, produces="application/json")
       public @ResponseBody Employee getpHomeRequest()
       {

              logger.debug("Home Address One===>");
              Employee  employee = employeeRepository.findFirstByEmailId("anand_yadav@guardianindia.com");

              //             Employee employee1 = employee.get();

              logger.debug("Home Address One===>"+employee);


              //              TestDemo testDemo = new TestDemo("H.no-266","Sector-1, Tyep-3", "New Delhi", 110049,"Delhi","New Delhi");
              //                         
              //              logger.debug("home Address2");

              return employee;
       }

       @RequestMapping(value="/html/officeAddress1" ,method=RequestMethod.GET, produces="application/json")
       public @ResponseBody OfficeAddress getpOfficeRequest()
       {

              Optional<OfficeAddress> officeAddress1 = officeRespository.findById(2001);

              OfficeAddress office1 = officeAddress1.get();


              //TestDemo testDemo = new TestDemo("Tikri Gaog","Guardian in", "New Delhi", 110046,"Delhi","New Delhi");

              logger.debug("office Address");

              return office1;
       }

       @RequestMapping(value="/html/homeAddress2" ,method=RequestMethod.GET, produces="application/json")
       public @ResponseBody Employee getdHomeRequest()
       {
              logger.debug("Home Address One===>");
              Employee  employee = employeeRepository.findFirstByEmailId("anand_yadav@guardianindia.com");

              //         Employee employee1 = employee.get();

              logger.debug("Home Address One===>"+employee);


              //          TestDemo testDemo = new TestDemo("H.no-266","Sector-1, Tyep-3", "New Delhi", 110049,"Delhi","New Delhi");
              //                     
              //          logger.debug("home Address2");

              return employee;
       }

       @RequestMapping(value="/html/officeAddress2" ,method=RequestMethod.GET, produces="application/json")
       public @ResponseBody OfficeAddress getdOfficeRequest()
       {

              Optional<OfficeAddress> officeAddress1 = officeRespository.findById(2002);

              OfficeAddress office1 = officeAddress1.get();

              logger.debug("office Address");

              return office1;
       }


         
            @RequestMapping(value="/html/getEmployeeById" ,method=RequestMethod.GET, produces="application/json")
            public @ResponseBody Employee getEmployeeByIdRequest(@RequestParam("id") String id)
            {
            
               logger.debug("Get Employee ID By Ajax===>");
             Employee  employee = employeeRepository.findFirstByEmailId("anand_yadav@guardianindia.com");
                
//             Employee employee1 = employee.get();
                
             logger.debug("Home Address One===>"+employee);
                
           
//              TestDemo testDemo = new TestDemo("H.no-266","Sector-1, Tyep-3", "New Delhi", 110049,"Delhi","New Delhi");
//                         
//              logger.debug("home Address2");
                
                return employee;
            }

       @RequestMapping(value="/addARequest" ,method=RequestMethod.POST)
       @ResponseBody
       public String addRequest(@RequestParam Map<String, String> model)
       {
              logger.debug(model);

              String requestType = model.get("requestType");
              String employeeId = model.get("employeeId");
              String employeeName = model.get("employeeName");
              String employeeContact = model.get("employeeContact");
              String remarks = model.get("remarks");
              String pickOrDrop = model.get("pickOrDrop");
              String requestDate = model.get("requestDate");
              String requestTime = model.get("requestTime");
              //String homeAddress1 = model.get("homeAddress1");
              //String officeAddress1= model.get("officeAddress1");
              String paddressLine1 = model.get("paddressLine1");
              String paddressLine2 = model.get("paddressLine2");
              String paddressLine3 = model.get("paddressLine3");
              String pstate = model.get("pstate");
              String pcity = model.get("pcity");
              String ppincode = model.get("ppincode");
              //         String homeAddress2= model.get("homeAddress2");
              //         String officeAddress2= model.get("officeAddress2");
              String daddressLine1= model.get("daddressLine1");
              String daddressLine2 = model.get("daddressLine2");
              String daddressLine3 = model.get("daddressLine3");
              String dpincode = model.get("dpincode");
              String dstate = model.get("dstate");
              String dcity = model.get("dcity");



              //         logger.debug(requestType);
              //         logger.debug(employeeId);
              logger.debug("Employee Name ====> "+employeeName);
              //         logger.debug(employeeContact);
              //         logger.debug(remarks);
              //         logger.debug(pickOrDrop);
              //logger.debug("Date ="+requestDate);
              logger.debug("Time=="+requestTime);
              //         //logger.debug(homeAddress1);
              //         //logger.debug(officeAddress1);
              //         logger.debug(paddressLine1);
              //         logger.debug(paddressLine2);
              //         logger.debug(paddressLine3);
              //         logger.debug(pstate);
              //         logger.debug(pcity);
              //         logger.debug(ppincode);
              //   //   logger.debug(homeAddress2);
              //         //logger.debug(officeAddress2);
              //         logger.debug(daddressLine1);
              //         logger.debug(daddressLine2);
              //         logger.debug(daddressLine3);
              //         logger.debug(dstate);
              //         logger.debug(dcity);
              //         logger.debug(dpincode);

              Request request = new Request();
              request.setRequestType(requestType);
              if(employeeId != "")
              {
                     request.setTravelerId(Integer.parseInt(employeeId));
              }
              // request.setRequestId(Integer.parseInt(employeeId));
              request.setTravelerName(employeeName);
              request.setTravellerContact(employeeContact);
              request.setRemarks(remarks);
              request.setPickUpOrDrop(pickOrDrop);
              request.setRequestType("Pending");

              //         try {
              //              Date date1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(requestDate);
              //              request.setReqDate(date1);
              //              logger.debug(date1);
              //         } catch (ParseException e) {
              //              // TODO Auto-generated catch block
              //              e.printStackTrace();
              //         }  

              //String string = "2011-03-22";

              Date date1 = Date.valueOf(requestDate);
              request.setRequestDate(date1);

              // Time time1 = Time.parse(requestTime);

              //   To convert java.util.Date to java.sql.Date, just use its constructor.

              //preparedStatement.setDate(index, new java.sql.Date(date.getTime()));

              request.setPickUpAddressLine1(paddressLine1);
              request.setPickUpAddressLine2(paddressLine2);
              request.setPickUpAddressLine3(paddressLine3);
              request.setPickUpState(pstate);
              request.setPickUpCity(pcity);
              request.setPickUpPinCode(Integer.parseInt(ppincode));


              request.setDropAddressLine1(daddressLine1);
              request.setDropAddressLine2(daddressLine2);
              request.setDropAddressLine3(daddressLine3);
              request.setDropState(dstate);
              request.setDropCity(dcity);
              request.setDropPinCode(Integer.parseInt(dpincode));

              requestrepository.save(request);



              return "Your Request Has Been Submitted";



       }


}
