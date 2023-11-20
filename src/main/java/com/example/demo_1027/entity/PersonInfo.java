package com.example.demo_1027.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_info")//資料表的名稱
public class PersonInfo {
	
	@Id //主鍵
	@Column(name = "id")//資料表裡面的名稱
	private String id;
		
	@Column(name = "name")//資料表裡面的名稱
	private String name;
	
	@Column(name = "age")//資料表裡面的名稱
	private int age;
	
	@Column(name = "city")//資料表裡面的名稱
	private String city;
	
	public PersonInfo() {
		super();
	}
	public PersonInfo(String id,String name, int age,String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
