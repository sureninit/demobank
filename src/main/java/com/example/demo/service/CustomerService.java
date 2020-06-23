package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.CustomerModel;
import com.example.demo.repository.CustomerRepository;

@Component
public class CustomerService {
	@Autowired
	private CustomerRepository CustomerRepo;
	
	@Autowired
	private CustomerModel CustomerModel;

	public CustomerModel getdetails(String accountNumber, String accountName, long balance, String regDate) {
		
		CustomerModel.setAccountNumber(accountNumber);
		CustomerModel.setAccountName(accountName);
		CustomerModel.setBalance(balance);
		CustomerModel.setRegDate(regDate);
	
		return CustomerModel;
		
	}
	

}
