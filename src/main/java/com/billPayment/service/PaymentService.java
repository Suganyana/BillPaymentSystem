package com.billPayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billPayment.pojo.Login;
import com.billPayment.pojo.Payment;

@Service
public interface PaymentService {

	
	public boolean doPayment(Payment payment);

}
