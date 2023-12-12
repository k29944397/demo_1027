package com.example.demo_1027.entity;

public class Bird extends Animal implements Runnable{

	private TaipeiBank bank;
	
//	private String branch;
//	
//	private String user;
//	
//	private int balance = 1000;
	
	public Bird() {
		super();
//		System.out.println("Bird 建構方法");
	}

	// @Override: 覆寫、重新定義
	// 父子類別有相同方法時(名稱)，子類別對此方法重新定義自己的{實作內容}
	@Override
	public void eat() {
		System.out.println(super.getName() + " 正在邊吃邊玩");
	}

	@Override
	public void sleep() {
		System.out.println(super.getName() + " 正在邊吃邊睡");
	}

	public void flying() {
		System.out.println(super.getName() + " 正在飛");
	}
	
	public void moving() {
		System.out.println(super.getName() + " 正在移動");
	}

	@Override
	public void run() {
		System.out.println("Bird is running");
		for (int i = 1; i<=5; i++) {
			System.out.println(getName()+"目前正在跑第" + i + "圈");
//			try{
//				Thread.sleep(500);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
