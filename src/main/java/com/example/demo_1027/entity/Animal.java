package com.example.demo_1027.entity;

public class Animal {

	
	
	private String name = "Fa";
	
	public Animal() {
		super();
		System.out.println("Animal �غc��k");
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("animal ���b�Y");
	}
	
	public void sleep() {
		System.out.println("animal ���b��");
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
