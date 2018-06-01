package com.billPayment.loginController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billPayment.login.Login;
import com.billPayment.login.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	
	@RequestMapping("doLogin")
	public boolean doLogin(@RequestBody Login login) {
		
	return	loginservice.authenticateUser(login);

	}
	

}
