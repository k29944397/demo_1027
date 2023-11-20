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
		System.out.println("�����O Animal name: " + anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("�p��");
		System.out.println("�l���O Bird name: " + bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
	}
	
	@Test
	public void extendsTest1() {
		A1 a1 = new A1();
		//�z�L���OA1�������OC�����p���ݩ�city
		a1.getC().getCity();
		// ����W�z�{���|�� NullPointerException
		// �]�����OA1�����p���ݩ�C�]�O�����O�A���O���w�]�Onull
		//a1.getC() �o�쪺�ȬOnull�Anull�b�I�s��k�ɴN�|����
	}
	
	@Test
	public void extendsTest2() {
		A1 a1 = new A1();
		//�z�L���OA1�������OC�����p���ݩ�city
		C c = a1.getC();
		c.setCity("QQQQ");
		String city = a1.getC().getCity();
		System.out.println(city);
		// �]�����OA1�����p���ݩ�C�]�O�����O�A���O�w�]�Onull
		// �����OC��
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
