package com.billPayment;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MainClass {
//created to start application1
	@Bean 
	public SessionFactory setSessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}

}
