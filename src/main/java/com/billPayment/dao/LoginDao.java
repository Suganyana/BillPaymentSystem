package com.billPayment.dao;

import org.springframework.stereotype.Repository;


import com.billPayment.pojo.Login;
@Repository
public interface LoginDao {

	public Login getUserByUserIdAndPassword(Login login);
	
}
