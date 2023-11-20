package com.example.demo_1027;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {

	@Test
	public void regexpTest() {
		String str = "0978-456-230";
		// d純數字 w(a~z+A~Z+0~9+_)
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// 用大括號{}取代重複出現的部分↓
//		String pattern = "\\d{4}-\\d{3}-\\d{3}"; 
		// 可以用小括號()再縮減↓
		String pattern = "\\d{4}(-\\d{3}){2}";
		System.out.println(str.matches(pattern));
	}

	@Test
	public void regexpTest2() {
//		String pattern = "\\(\\d{2}\\)\\d{8}";//(02)12345678
//		String pattern1 = "\\(\\d{2}\\)\\d{7}";//(02)1234567
//		//ABC是將上面的0和1整合 ABC效果一樣
//		String patternA = "\\(\\d{2}\\)\\d{8}||\\(\\d\\)\\d{7}";//(92)12345678 or(02)1234567
//		String patternB = "\\(\\d{2}\\)\\d{8}||\\d{7}";
//		String patternC = "\\(\\d{2}\\)\\d{7,8}";//
//
//		
//		String pattern2 = "\\d{2}-\\d{7}";//02-1234567
//		String pattern3 = "\\d{2}-\\d{8}";//02-12345678
//		String patternD = "\\d{2}-\\d{7,8}";//2和3的整合 02-12345678 or 02-1234567
		String patternE = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";// C和D的整合

		System.out.println("請輸入電話號碼:");
		System.out.println("電話格式為:(區碼2碼)電話號碼7碼or8碼");
		System.out.println("電話格式為:區碼2碼-電話號碼7碼or8碼");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if (str.matches(patternE)) {
			System.out.println(str + "符合格式");
		} else {
			System.out.println(str + "不符合格式");
		}
	}

	@Test
	public void regexpTest3() {
//		String pattern0 = "0\\d{1,3}-\\d{7,8}";// 市話練習
//		String pattern1 = "0[1-9]{1,3}-\\d{7,8}";
		String pattern2 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";//身分證字號
//		String pattern2 = "([\\w&&[^\\D_abdefhABDEFH]][1,2]\\d{8})"; //排除再排除蠻有趣的寫法
		String pattern3 = "[CGI-Zcgi-z][1-2]\\d{8}";//暴力解
		Scanner scan = new Scanner (System.in);
		String str = scan.next();
		System.out.println(str.matches(pattern2));
	}
	
	@Test
	public void regexpTest4() {
		String str = "a";
		String str1 = "Ab";
		String pattern = "\\w";    // \\w為一個字元,範圍[A-Za-z0-9_]
		String pattern1 = "\\w.";  // .表示任意1個字元
		String pattern2 = "\\w.*"; // .*表示0~多個字元,所以後面可有可無
		System.out.println(str.matches(pattern));//T w為一個字元,範圍[A-Za-z0-9_]
		System.out.println(str1.matches(pattern));//F 多了
		System.out.println("===================");
		System.out.println(str.matches(pattern1));//F 少了.
		System.out.println(str1.matches(pattern1));//T
		System.out.println("===================");
		System.out.println(str.matches(pattern2));//T 
		System.out.println(str1.matches(pattern2));//T 
	}

}
