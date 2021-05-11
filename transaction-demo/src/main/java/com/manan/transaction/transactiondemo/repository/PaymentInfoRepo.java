package com.manan.transaction.transactiondemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo extends JpaRepository<com.manan.transaction.transactiondemo.model.PaymentInfo, String> {

}
