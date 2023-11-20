package com.example.demo_1027.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_info")//��ƪ��W��
public class PersonInfo {
	
	@Id //�D��
	@Column(name = "id")//��ƪ�̭����W��
	private String id;
		
	@Column(name = "name")//��ƪ�̭����W��
	private String name;
	
	@Column(name = "age")//��ƪ�̭����W��
	private int age;
	
	@Column(name = "city")//��ƪ�̭����W��
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
