package com.billPayment.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.billPayment.pojo.Login;
import com.billPayment.service.LoginService;


@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	
	@RequestMapping("doLogin")
	public Login doLogin(@RequestBody Login login) {
		System.out.println(login);
	return	loginservice.authenticateUser(login);

	}
	

}
