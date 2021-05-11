package com.manan.transaction.transactiondemo.utils;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manan.transaction.transactiondemo.exception.InsufficieAmountException;

public class PaymentUtils {

	private static final Logger log = LoggerFactory.getLogger(PaymentUtils.class);

	private static Map<String, Double> paymentMap = new HashMap<String, Double>();

	static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 1000.0);
		paymentMap.put("acc3", 9000.0);
	}

	public static boolean validateCreditLimit(String accNo, Double paidAmt) {
		log.info("\nvalidateCreditLimit method called.....!!!!!!\n" + accNo + "/t" + paidAmt);
		if (paidAmt > paymentMap.get(accNo)) {
			throw new InsufficieAmountException("Insufficient Funds ...!!!!!");
		} else
			return true;
	}
}
