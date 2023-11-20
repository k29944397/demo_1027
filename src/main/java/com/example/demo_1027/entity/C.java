package com.example.demo_1027.entity;

public class C {
	
	private String city;
	
	private String state;
	
	private String country;
	
	public C() {
		super();
	}
	
	public C(String city, String state, String country) {
		// TODO Auto-generated constructor stub
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
	
	private void setState(String state) {
		this.state = state;
	}
	
	public String getCountry() {
		return country;
	}
	
	private void setCountry(String country) {
		this.country = country;
	}
}
