package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class AccountsEntity {
	
	@Id
	@Column(name="ACCOUNT_NUMBER")
	 private Integer accountNumber;
	
	@Column(name = "CUSTOMER_NUM")
	private Integer customerNum;
	
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="CURRENT_BALANCE")
	private Float currentBalance;
	
	@Column(name="HR_LETTER")
	private Integer hrLetter;
	
	@Column(name="CURRENCY")
	private String currency;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_NUM" , referencedColumnName = "CUSTOMER_SERIAL_NUM" , insertable = false , updatable = false)
	private CustomerEntity entity;

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

	public CustomerEntity getEntity() {
		return entity;
	}

	public void setEntity(CustomerEntity entity) {
		this.entity = entity;
	}

	
	

}
