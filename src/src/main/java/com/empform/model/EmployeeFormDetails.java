package com.empform.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dispute_customer_details")
public class EmployeeFormDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int disputeId;
	
	private String customerName;
	private String cardNumber;
	private String accountNumber;
	public EmployeeFormDetails()
	{
		
	}
	
	public EmployeeFormDetails(int disputeId, String customerName, String cardNumber, String accountNumber) 
	{
		super();
		this.disputeId = disputeId;
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
	}
	
	public  int getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(int disputeId) {
		this.disputeId = disputeId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
