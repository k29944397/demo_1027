package com.example.demo_1027.entity;

import com.example.demo_1027.service.ifs.RunService;

public class Dog implements RunService{
	
	private String name = "monkey";
	
	private String color;

	private int age;
//	public int age;
	//public�Q�ϥ��v���̤j
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		//�~��
	}
	//�غc��k ����set�U�C��������
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	//return����void �^��
	}
	public void setColor(String color) {
		this.color = color;
	//return����void �^��
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAttributes() {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void setAttributes2() {
		return;
	}
	@Override
	public void run() {
		System.out.println("����b�b�]");
	}
}
