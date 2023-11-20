package com.example.demo_1027.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")//資料表的名稱
//@IdClass
public class Menu {
	
	@Id //主鍵
	@Column(name = "name")//資料表裡面的名稱
	private String name;
	
	@Column(name = "price")//資料表裡面的名稱
	private int price;
	
	public Menu() {
		super();
	}
	
	public Menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
