package com.example.demo_1027.entity;

public class Cat extends Animal {

//	public Cat() {
//		super();
//		System.out.println("Cat �غc��k");
//	}
	
	@Override
	public void eat() {
		System.out.println(super.getName() + " ���b��Y�䪱");
	}
	
	@Override
	public void sleep() {
		System.out.println(super.getName() + " ���b��Y���");
	}

	public void barking() {
		System.out.println(super.getName() + " ���b�s");

	}
	
	public void moving() {
		System.out.println(super.getName() + " ���b����");
	}

}
