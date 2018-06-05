package com.billPayment.pojo;

public class Payment {

	private int pymntId;
	private int customerID ;
	private int vendorRegId ;
	private double amount;
	private int payment;
	public int getPymntId() {
		return pymntId;
	}
	public void setPymntId(int pymntId) {
		this.pymntId = pymntId;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getVendorRegId() {
		return vendorRegId;
	}
	public void setVendorRegId(int vendorRegId) {
		this.vendorRegId = vendorRegId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Payment [pymntId=" + pymntId + ", customerID=" + customerID + ", vendorRegId=" + vendorRegId
				+ ", amount=" + amount + ", payment=" + payment + "]";
	}    

	
}
