package com.billPayment.dao;


import com.billPayment.pojo.Payment;

public interface PaymentDao {

	public boolean doPayment(Payment payment);

}
