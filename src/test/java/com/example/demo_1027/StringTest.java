package com.example.demo_1027;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo_1027.entity.Dog;

public class StringTest {

	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = new String("ABC");
		String str2 = "ABC";
		System.out.println(str == str1);// False
		System.out.println(str == str2);// True
		System.out.println("===========");
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println("===========");
		String str3 = "aBC";
		System.out.println(str.equals(str3));// False
		System.out.println(str.equalsIgnoreCase(str3));// IgnoreCase不在乎大小寫
	}

	@Test
	public void stringTest1() {
		String str = "ABC";
		String str1 = "";
		String str2 = "  ";
		System.out.println(str.length());
		System.out.println("str1 length:" + str1.length());// 0
		System.out.println("str2 length:" + str2.length());// 2
		System.out.println("===========");
		// isEmpty() 是看字串長度是否為0
		System.out.println("str1 isEmpty:" + str1.isEmpty());// True
		System.out.println("str2 isEmpty:" + str2.isEmpty());// False
		System.out.println("===========");
		// isBlank(): 1.長度為0; 2.字串內容全由空白組成:滿足條件 1.or 2.則回傳true
		System.out.println("str1 isBlank:" + str1.isBlank());// True
		System.out.println("str2 isBlank:" + str1.isBlank());// True
	}

	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String name = dog.getName();
		String color = dog.getColor();
		System.out.println(name);// Apple
		System.out.println(color);// null
		System.out.println("===========");
		System.out.println(name.length());// 5
//		System.out.println(color.length());//null error
		System.out.println(color == null);
		System.out.println("===========");
//		if(color.isBlank()) {} //null error
		if (color == null || color.isBlank() == true || color.isBlank()) {
			System.out.println("color 是空字串");// 是空字串
		} else {
			System.out.println("color 不是空字串");
		}
		System.out.println("===========");
		System.out.println(StringUtils.hasLength("  "));// True 有長度
		System.out.println(StringUtils.hasText("  "));// False 兩個space沒有內容
		System.out.println("===========");
		// color == null 把下方改成正確的
		// color = "ABC"; 1.直接改參數
		if (!StringUtils.hasText(color)) {// 2.加"!"
			System.out.println("color 沒有內容");// 3.改敘述""內容
		} else {
			System.out.println("color 有內容");
		}
	}

	@Test
	public void stringTest3() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String key = "小龍女";
		System.out.println("字串長度:" + str.length());// 直接length : 41
		String str1 = str.replace(key, "");// 將源字串中的關鍵字剃除後生成新字串
		int times = ((str.length() - str1.length()) / key.length());
		// 將原字串length()減掉新字串length()除以關鍵字length()
		System.out.println("小龍女出現次數" + times);// ↑"(41-32)/3 = 3"↑
		System.out.println("第一次出現小龍女:" + str.indexOf(key));// 8
	}

	// 求"小龍女"在字串中出現的次數
	@Test
	public void stringTest3ex() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String key = "小龍女";
		int times = 0;
		int index = 0;
//		for (; ;) {
//			if(str.indexOf(key, index) == -1) {
//				break;
//			}
//			times++;
//			index = str.indexOf(key, index) + key.length();
//		}
//		System.out.println(times);
//		System.out.println("=====以上第一種=====");
//		while(str.indexOf(key, index) != -1) {
//			times++;
//			index = str.indexOf(key, index) + key.length();
//		}
//		System.out.println(times);
//		System.out.println("=====以上第二種=====");
		for (; str.indexOf(key, index) != -1;) {
			times++;
			index = str.indexOf(key, index) + key.length();
		}
		System.out.println(times);
	}

	@Test
	public void replaceTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		str = str.replace("小龍女", "小蘋果");
		System.out.println(str);
	}

	@Test
	public void splitTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事,我不喜歡小龍女的甲仙,雖然小龍女在楊過眼中是清新脫俗";
		String[] array = str.split(",");
		for (String item : array) {
			System.out.println(item);
		}
		System.out.println("===========");
		String str1 = "ABCD";
		String[] array1 = str1.split("");
		for (String item : array1) {
			System.out.println(item);
		}
	}

	@Test
	public void trimTest() {
		String str = "ABC DEF ";
		String str1 = " ABC DEF ";
		System.out.println(str == str1);// f
		System.out.println(str.equals(str1));// f
		System.out.println("===========");
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);// ABC DEF
		System.out.println(str1);// ABC DEF
		System.out.println(str == str1);// f
		System.out.println(str.equals(str1));// t
		System.out.println("===========");
		str = str.replace(" ", "");// 去掉空格
		System.out.println(str);
	}

	@Test
	public void substringTest() {
		String str = "神鵰俠侶是楊過與小龍女的故事";
		String subStr = str.substring(5);// 5以後
		String subStr1 = str.substring(5, 11);// 5到11
		System.out.println(subStr);
		System.out.println(subStr1);
	}

	@Test
	public void stringBufferTest() {
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		sb.append("GGG");
		sb.append("AAA").append("BBB");
		System.out.println("===========");
		String str = "ABC" + "DEF" + "GGG" + "AAA" + "BBB";
	}

	@Test
	public void stringBufferTest1() {
		StringBuffer sb = new StringBuffer("ABC");
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb.equals(sb1));
		System.out.println("===========");
		System.out.println(sb.toString().equals(sb1.toString()));
	}

	@Test // 題目:把最後一個"A"換成"W"
	public void replaceTest1() {
		String str = "ABACADEF";
//		String str1 = str.replace("AD", "WD");  //偷吃步
		int index = str.lastIndexOf("A");// <<"str.lastIndexOf">> imdex = 4
		String str1 = str.substring(index);// ADEF
		str1 = str1.replace("A", "W");// WDEF
		str = str.substring(0, index) + str1;
		System.out.println(str);
	}

	@Test
	public void stringBufferTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString())) {
			System.out.println(str + "是迴文");
		} else {
			System.out.println(str + "不是迴文");
		}
	}

	@Test
	public void stringBufferTest3() {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("請輸入2個字以上");
			String str = scan.next();
			if (str.length() <= 3) {
				continue;
			}
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(sb.reverse().toString())) {
				System.out.println(str + "是迴文");
			} else {
				System.out.println(str + "不是迴文");
			}
			break;
		}
	}
	
	@Test
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int inputInt = scan.nextInt();
		inputInt++;
		String str = String.valueOf(inputInt);
		String[] strArray = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
//		List<Integer> intList = new ArrayList<>();
	}
}
