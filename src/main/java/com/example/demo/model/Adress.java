package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Adress {
	private int zipcode;
	private String city;
	private String state;
	private int appartNo;
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAppartNo() {
		return appartNo;
	}
	public void setAppartNo(int appartNo) {
		this.appartNo = appartNo;
	}

}
