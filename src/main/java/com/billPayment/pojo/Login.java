package com.billPayment.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="adminLogin")
public class Login {
     
	@Id
	private String userName;
	private String password;
	
	@Transient
	private boolean loginStatus;
	
	
	
	
	
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [ username=" + userName + ", password=" + password + ", loginStatus=" + loginStatus
				+ "]";
	}
	
	
	
	
	
	
}
