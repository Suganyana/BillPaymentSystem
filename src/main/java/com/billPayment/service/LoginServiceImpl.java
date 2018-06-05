package com.billPayment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billPayment.*;
import com.billPayment.dao.LoginDao;
import com.billPayment.dao.LoginDaoImpl;

import com.billPayment.pojo.Login;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public Login authenticateUser(Login login) {
		// TODO Auto-generated method stub
		Login currentUser=loginDao.getUserByUserIdAndPassword(login);
		System.out.println("dbuser="+currentUser);
		if(currentUser==null||!currentUser.getPassword().equals(login.getPassword())) {
			currentUser.setLoginStatus(false);
		}else {
			currentUser.setLoginStatus(true);
		}
		return currentUser;
	}

}
