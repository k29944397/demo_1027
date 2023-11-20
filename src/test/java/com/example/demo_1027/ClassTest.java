package com.example.demo_1027;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo_1027.entity.Dog;
import com.example.demo_1027.entity.TaipeiBank;

public class ClassTest {

	@Test
	public void classTest() {
		Dog yourDog = new Dog();
//		int age = dog.age;
//		dog.age = 5;
		System.out.println(yourDog.getName());
		yourDog.setName("cat");
		System.out.println("==========");
		Dog myDog = new Dog();
		System.out.println(myDog.getName());
		myDog.setName("Lily");
		System.out.println(yourDog.getName());
		System.out.println(myDog.getName());
		System.out.println("==========");
	}

	@Test
	public void classTest1() {
		Dog dog = new Dog();
//		dog.setAttributes("yellow", "Lily000", 2);
	}

	public void classTest2() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank.getBalance());
		Assert.isTrue(bank.getBalance() == 1000, "saving error!");
		bank.saving(-500);
		Assert.isTrue(bank.getBalance() == 1000, "saving error!");
//		System.out.println(bank.getBalance());
		bank.saving(500);
		Assert.isTrue(bank.getBalance() == 1500, "saving error!");
//		System.out.println(bank.getBalance());
	}

	@Test
	public void classTest3() {
		TaipeiBank bank = new TaipeiBank();
		System.out.println(bank);
		Dog dog = new Dog();
		// 給一個新的記憶體空間去裝資料
		System.out.println(dog);
		System.out.println("============");
		Dog dogg = new Dog();
		System.out.println(dogg);
		System.out.println("============");
		System.out.println(dog == dogg);
		// 記憶體位置
	}

	@Test
	public void classTest4() {
		int a = 5;
		int b = 5;
		System.out.println("a == b:" + (a == b));//True
		System.out.println("=============");
		boolean boo1 = false;
		boolean boo2 = false;
		System.out.println("boo1 == boo2:"+(boo1 == boo2));//True
		System.out.println("=============");
		Integer a1 = 10;
		Integer b1 = 10;
		System.out.println("a1 == b1:"+(a1 == b1));//True
		System.out.println("=============");
		Integer a2 = new Integer(10);
		Integer b2 = new Integer(10);
		System.out.println("a2 == b2:"+(a2 == b2));//False new=>資料位置
		System.out.println("=============");
	}
	
	@Test
	public void classTest5() {
		TaipeiBank bank = new TaipeiBank();
		int a = 10;
		for (int i = 0; i<10;i++) {
			System.out.println(i);
		}
//		System.out.println(i);//i只設在for迴圈內
		
		if (a > 20) {
			System.out.println("=========");
		}
		int b = 20;
		System.out.println(b);
		System.out.println(a);
	}
	
	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setName("Lily");
		dog.setColor("blue");
		dog.setAge(2);
		System.out.println(dog.getName());
		System.out.println(dog.getColor());
		System.out.println(dog.getAge());
		System.out.println("=========");
		Dog dogg = new Dog("QQQQ","GGGG",5);
		System.out.println(dogg.getName());
		System.out.println(dogg.getColor());
		System.out.println(dogg.getAge());
		System.out.println("=========");
	}
	@Test
	public void classTest7() {
		Dog dog = new Dog();
		dog.setAttributes();//一般方法的呼叫，必須把類別new出來
		dog.setAttributes2();//static方法的呼叫，直接用類別名稱.static方法
		System.out.println("=========");
		Math.random();
		Random ran = new Random();
		ran.nextInt();
		System.out.println("=========");
		int aaaa = 100;
		aaaa =200;
		final int bbbb = 100;
	}
	
	
}
