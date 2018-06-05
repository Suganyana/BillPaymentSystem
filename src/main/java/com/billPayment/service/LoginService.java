package com.billPayment.service;

import org.springframework.stereotype.Service;

import com.billPayment.*;
import com.billPayment.pojo.Login;

@Service
public interface LoginService {

	public Login authenticateUser(Login login);
}
