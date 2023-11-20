package com.example.demo_1027.entity;

public class Animal {

	
	
	private String name = "Fa";
	
	public Animal() {
		super();
		System.out.println("Animal 建構方法");
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("animal 正在吃");
	}
	
	public void sleep() {
		System.out.println("animal 正在睡");
	}

	
	
//	@SpringBootApplication
//	public class DemoApplication{
//		
//		public static void main(String[] args) {
//			Animal animal = new Animal(name:"Lily");
//			animal.eat();
//			animal.sleep();
//		}
//	}
}
