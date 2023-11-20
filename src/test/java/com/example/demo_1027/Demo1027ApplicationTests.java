package com.example.demo_1027;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Demo1027ApplicationTests {

	@Test
	//public權限 //void不回傳任何值
	public void firstTest() {
		int a = 123456789;
		long b =123456789023456L;
		//宣告完卻沒使用出現黃蚯蚓
		//宣long時有輸入超過int的直要加"L"
		System.out.println(a);
		System.out.println(b);
		//Ctrl+Shift+O = 把沒用到的import刪除
		//String str = "ABC";
		String str = new String("ABC");
		System.out.println("str: "+str);
	}

}
