package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component

public class CustomerModel {
	@Id
	private Long id;
	private String accountNumber;
	private String accountName;
	private long balance;
	private String regDate;
	public Long getId() {
		return id;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
