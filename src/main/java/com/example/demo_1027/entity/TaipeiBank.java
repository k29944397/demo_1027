package com.example.demo_1027.entity;

public class TaipeiBank {
	private String branch;
	private String user;
	private int balance;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int saving(int amount) {
		if(amount > 0) {
			balance += amount;
		}
		return balance;
	}
	
	public int withdraw(int amount) {
		if(balance >= amount && amount > 0) {
			balance -= amount;
		}
		return balance;
	}
	
}
