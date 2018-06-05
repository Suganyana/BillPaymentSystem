package com.billPayment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.billPayment.pojo.Payment;
import com.billPayment.service.PaymentService;

@RestController
@CrossOrigin
public class PaymentController {

	@Autowired
	PaymentService paymentservice;
	
	
	@RequestMapping("doPayment")
	public boolean doPayment(@RequestBody Payment payment) {
		
	return	paymentservice.doPayment(payment);

	}
	
	
}
