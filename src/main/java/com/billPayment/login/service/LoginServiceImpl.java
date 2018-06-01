package com.billPayment.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billPayment.login.Login;
import com.billPayment.login.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao LoginDao;
	
	@Override
	public boolean authenticateUser(Login login) {
		// TODO Auto-generated method stub
		boolean status=false;
		Login currentUser=LoginDao.getUserByUserIdAndPassword(login);
		if(currentUser!=null) {
			status=true;
		}else {
			status=false;
		}
		return status;
	}

}
