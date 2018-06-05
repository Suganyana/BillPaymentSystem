package com.billPayment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billPayment.dao.PaymentDao;
import com.billPayment.pojo.Login;
import com.billPayment.pojo.Payment;


@Service
public class PaymentServiceImpl implements PaymentService {


	@Autowired
	PaymentDao paymentdao;
	
	@Override
	public boolean doPayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentdao.doPayment(payment);
	}

}
