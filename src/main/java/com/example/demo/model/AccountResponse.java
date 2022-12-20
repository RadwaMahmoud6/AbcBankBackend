package com.example.demo.model;
public class AccountResponse{
	
	private Integer accountNumber;

	private Integer customerNum;

	private String accountType;
	
	private Float currentBalance;
	
	private Integer hrLetter;
	
	private String currency;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(Integer customerNum) {
		this.customerNum = customerNum;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Integer getHrLetter() {
		return hrLetter;
	}

	public void setHrLetter(Integer hrLetter) {
		this.hrLetter = hrLetter;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

	
}
