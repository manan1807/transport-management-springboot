package com.manan.transaction.transactiondemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manan.transaction.transactiondemo.dto.FlightBookingAcknowledgement;
import com.manan.transaction.transactiondemo.dto.FlightBookingRequest;
import com.manan.transaction.transactiondemo.model.PassengerInfo;
import com.manan.transaction.transactiondemo.repository.PassengerInfoRepo;
import com.manan.transaction.transactiondemo.repository.PaymentInfoRepo;
import com.manan.transaction.transactiondemo.service.FlightBookingService;

@RestController
public class TransactionController {

	@Autowired
	private FlightBookingService flightBookingService;

	@Autowired
	private PassengerInfoRepo passengerInfoRepo;

	private static final Logger log = LoggerFactory.getLogger(TransactionController.class);

	@PostMapping("/bookFlightTicket")
	public ResponseEntity<FlightBookingAcknowledgement> bookFlightTicket(@RequestBody FlightBookingRequest request) {

		log.info("\nController called....!!!!!!!!!!\n" + request.getPassengerInfo());
		FlightBookingAcknowledgement flightBookingAcknowledgement =  flightBookingService.bookFlightTicket(request);
		
			if(flightBookingAcknowledgement == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return new ResponseEntity<>(flightBookingAcknowledgement, HttpStatus.OK);
	}

	@GetMapping("/bookFlightTicket")
	public ResponseEntity<List<PassengerInfo>> getDetails() {
		List<PassengerInfo> listOfPass =  passengerInfoRepo.findAll();
		
		if(listOfPass.size()<=0) {
			//return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(listOfPass);
		}
		return new ResponseEntity<>(listOfPass, HttpStatus.OK);
		
	}

}
