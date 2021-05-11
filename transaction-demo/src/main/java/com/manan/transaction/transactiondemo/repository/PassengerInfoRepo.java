package com.manan.transaction.transactiondemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manan.transaction.transactiondemo.model.PassengerInfo;

public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {

}
