package com.manan.transaction.transactiondemo.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manan.transaction.transactiondemo.dto.FlightBookingAcknowledgement;
import com.manan.transaction.transactiondemo.dto.FlightBookingRequest;
import com.manan.transaction.transactiondemo.model.PassengerInfo;
import com.manan.transaction.transactiondemo.model.PaymentInfo;
import com.manan.transaction.transactiondemo.repository.PassengerInfoRepo;
import com.manan.transaction.transactiondemo.repository.PaymentInfoRepo;
import com.manan.transaction.transactiondemo.utils.PaymentUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepo passengerInfoRepo;

	@Autowired
	private PaymentInfoRepo paymentInfoRepo;

	private static final Logger log = LoggerFactory.getLogger(FlightBookingService.class);

	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

		log.info("\nbookFlightTicket method called...!!!\n" + request);
		FlightBookingAcknowledgement flightBookingAcknowledgement = null;
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfoRepo.save(passengerInfo);
		log.info("\npassengerInfo saved successfully...!!!\n" + passengerInfo.getId());
		PaymentInfo paymentInfo = request.getPaymentInfo();

		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		log.info("\nCredit Limit Validated successfully....!!!!\n " + passengerInfo.getFare());
		paymentInfo.setPassengerInfo(passengerInfo);
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepo.save(paymentInfo);
		log.info("\npaymentInfo saved successfully....!!!! \n" + paymentInfo.getPassengerInfo().getId());
		flightBookingAcknowledgement=  new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
				UUID.randomUUID().toString().split("-")[0], passengerInfo);
		return flightBookingAcknowledgement;

	}
}
