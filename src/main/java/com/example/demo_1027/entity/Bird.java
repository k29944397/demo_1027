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
//		System.out.println("Bird �غc��k");
	}

	// @Override: �мg�B���s�w�q
	// ���l���O���ۦP��k��(�W��)�A�l���O�惡��k���s�w�q�ۤv��{��@���e}
	@Override
	public void eat() {
		System.out.println(super.getName() + " ���b��Y�䪱");
	}

	@Override
	public void sleep() {
		System.out.println(super.getName() + " ���b��Y���");
	}

	public void flying() {
		System.out.println(super.getName() + " ���b��");
	}
	
	public void moving() {
		System.out.println(super.getName() + " ���b����");
	}

	@Override
	public void run() {
		System.out.println("Bird is running");
		for (int i = 1; i<=5; i++) {
			System.out.println(getName()+"�ثe���b�]��" + i + "��");
//			try{
//				Thread.sleep(500);
//			}catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
