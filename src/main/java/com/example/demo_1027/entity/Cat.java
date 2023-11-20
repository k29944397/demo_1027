package com.example.demo_1027.entity;

public class Cat extends Animal {

//	public Cat() {
//		super();
//		System.out.println("Cat 建構方法");
//	}
	
	@Override
	public void eat() {
		System.out.println(super.getName() + " 正在邊吃邊玩");
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getName() + " 正在邊吃邊睡");
	}

	public void barking() {
		System.out.println(super.getName() + " 正在叫");

	}
	
	public void moving() {
		System.out.println(super.getName() + " 正在移動");
	}

}
