package com.billPayment.login.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billPayment.login.Login;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory sf;
	
	@Override
	public Login getUserByUserIdAndPassword(Login login) {
		// TODO Auto-generated method stub
		Session sess=sf.openSession();
		Login log=sess.get(Login.class, login.getUsername());
		return log;
		
	}

}
