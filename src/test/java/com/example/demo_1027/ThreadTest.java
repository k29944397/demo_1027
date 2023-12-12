package com.example.demo_1027;

import org.junit.jupiter.api.Test;

import com.example.demo_1027.entity.Bird;
import com.example.demo_1027.entity.HorseRacing;

public class ThreadTest {
	
	@Test
	public void multiThreadTest(){
		HorseRacing t1 = new HorseRacing("t1");
		HorseRacing t2 = new HorseRacing("t2");
		t1.start();
		t2.start();
		//多跑幾次會發現並不會先t1(1~5)之後才t2(1~5)
	}
	
	@Test
	public void runnalbeTest() {
		Bird bird = new Bird();
		Thread t = new Thread(bird);
		t.start();
	}
}
