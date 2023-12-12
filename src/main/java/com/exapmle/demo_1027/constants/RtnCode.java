package com.exapmle.demo_1027.constants;

public enum RtnCode {

	SUCCESSFULL(200, "OK!"),
	PARAM_ERROR(400,"PARAM_ERROR"),
	ACCOUNT_EXISTED(400,"Account existed"),
	INSUFFICIENT_BALANCE(400,"The balance is insufficient"),
	PLEASE_LOGIN_FIRST(400,"Please login first"),
	LOGIN_ERROR(400,"Login error!"),
	ACCOUNT_NOT_FOUND(404,"Account not found"),
	;

	private int code;
	private String message;
	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
