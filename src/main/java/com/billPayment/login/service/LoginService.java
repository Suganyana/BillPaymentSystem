package com.billPayment.login.service;

import org.springframework.stereotype.Service;

import com.billPayment.login.Login;

@Service
public interface LoginService {

	
	public boolean authenticateUser(Login login);
}
