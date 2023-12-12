package com.example.demo_1027.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtmRequest {
	
	private String account;
	@JsonProperty("password")
	private String pwd;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
