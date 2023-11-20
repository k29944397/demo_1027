package com.example.demo_1027.entity;

import com.example.demo_1027.service.ifs.RunService;

public class Dog implements RunService{
	
	private String name = "monkey";
	
	private String color;

	private int age;
//	public int age;
	//public被使用權限最大
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		//繼承
	}
	//建構方法 ↓↓set下列全部元素
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
	//return之於void 回傳
	}
	public void setColor(String color) {
		this.color = color;
	//return之於void 回傳
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
		System.out.println("狗兒在奔跑");
	}
}
