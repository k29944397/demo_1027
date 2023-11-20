package com.example.demo_1027;

import org.junit.jupiter.api.Test;

import com.example.demo_1027.entity.A1;
import com.example.demo_1027.entity.Animal;
import com.example.demo_1027.entity.Bird;
import com.example.demo_1027.entity.C;
import com.example.demo_1027.entity.Car;
import com.example.demo_1027.entity.Cat;
import com.example.demo_1027.entity.Dog;

public class ExtendsTest {

	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("父類別 Animal name: " + anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("小花");
		System.out.println("子類別 Bird name: " + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	
	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		//透過類別A1取的類別C中的私有屬性city
		a1.getC().getCity();
		// 執行上述程式會報 NullPointerException
		// 因為類別A1中的私有屬性C也是個類別，類別的預設是null
		//a1.getC() 得到的值是null，null在呼叫方法時就會報錯
	}
	
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		//透過類別A1取的類別C中的私有屬性city
		C c = a1.getC();
		c.setCity("QQQQ");
		String city = a1.getC().getCity();
		System.out.println(city);
		// 因為類別A1中的私有屬性C也是個類別，類別預設是null
		// 但類別C中
	}
	
	@Test
	public void extendsTest3() {
		C c = new C("AAA", "BBB", "CCC");
//		c.setCity("AAA");
//		c.setCountry("BBB");
//		c.setState("CCC");
		A1 a1 = new A1();
		a1.setC(c);
		a1.setAddress("DDD");
		System.out.println("============");
		System.out.println("City: " + a1.getC().getCity());
		System.out.println("Country: " + a1.getC().getCountry());
		System.out.println("state: " + a1.getC().getState());
		System.out.println("address: " + a1.getAddress());
	}
	
	@Test
	public void extendsTest4() {
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("============");
		Animal animm = new Animal();
		animm.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
	}
	
	@Test
	public void extendsTest5() {
		Factory fatory = new Factory();
		fatory. processing(new Meat());
		fatory. processing(new Pork());
		fatory. processing(new Chicken());
	}
	
	@Test
	public void interfaceTest() {
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.run();
	}
	
	
}
