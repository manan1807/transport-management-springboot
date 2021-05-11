package com.manan.transaction.transactiondemo.dto;

import com.manan.transaction.transactiondemo.model.PassengerInfo;
import com.manan.transaction.transactiondemo.model.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;

	private PaymentInfo paymentInfo;
}
