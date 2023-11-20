package com.example.demo_1027.vo;

import com.example.demo_1027.entity.Atm;
import com.exapmle.demo_1027.constants.RtnCode;

public class AtmResponse {
//	private int code;
//	private String message;
	private Atm atm;
	private RtnCode rtnCode;
	public AtmResponse() {
		super();
	}
//	public AtmResponse(int code, String message, Atm atm) {
//		super();
//		this.code = code;
//		this.message = message;
//		this.atm = atm;
//	}
//	public AtmResponse(int code, String message) {
//		super();
//		this.code = code;
//		this.message = message;
//	}
	public AtmResponse(Atm atm, RtnCode rtnCode) {
		super();
		this.atm =atm;
		this.rtnCode = rtnCode;
	}
	public RtnCode getRtnCode() {
		return rtnCode;
	}
	public void setRtnCode(RtnCode rtnCode) {
		this.rtnCode = rtnCode;
	}
//	public int getCode() {
//		return code;
//	}
//	public void setCode(int code) {
//		this.code = code;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	public Atm getAtm() {
		return atm;
	}
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
}
