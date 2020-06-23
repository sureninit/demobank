package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CustomerModel;
import com.example.demo.service.CustomerService;

@RestController
public class BankController {
	@Autowired
	private CustomerService CustomerService;
	
@RequestMapping(value="/check")
	public String check() {
		return "ok";
	}

@RequestMapping(value="/customer", method=RequestMethod.GET, produces="application/json")
public CustomerModel getCustomer(
		@RequestParam("accountNumber") String accountNumber, 
		@RequestParam("accountName") String accountName, 
		@RequestParam("balance") long balance, 
		@RequestParam("regDate") String regDate) {
	return CustomerService.getdetails(accountNumber,accountName,balance,regDate);
}

}
