package com.billPayment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.billPayment.pojo.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public boolean doPayment(Payment payment) {
		// TODO Auto-generated method stub
		Session sess=sf.openSession();
		sess.save(payment);
		return true;
		
	}

}
