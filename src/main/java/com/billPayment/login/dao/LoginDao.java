package com.billPayment.login.dao;

import org.springframework.stereotype.Repository;

import com.billPayment.login.Login;
@Repository
public interface LoginDao {

	public Login getUserByUserIdAndPassword(Login login);
	
}
