package com.example.demo_1027;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		int a = 5;
		if (a > 5) {
			System.out.println("=======");
		} else {
			System.out.println("+++++++");
		}
	}

	@Test
	public void ifTest2() {
		int a = 5;
		if (a > 6) {
			System.out.println("=======");
		} else if (a >= 6) {
			System.out.println("+++++++");
		} else {
			System.out.println("#######");
		}
	}

	@Test
	public void scannerTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String a = scan.next();
		String b = scan.next();
		System.out.println("輸入的文字:" + a + b);
	}

	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String a = scan.nextLine();
		System.out.println("輸入的文字:" + a);
	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		int a = scan.nextInt();
		System.out.println("輸入的文字:" + a);
	}

	@Test
	public void swithTest() {
		int a = 95;
		double b = 95 / 10;
		double c = 95 / 10.0;
		System.out.println(b);
		System.out.println(c);
	}

	@Test
	public void swithTest1() {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = scan.nextInt();
//		String c = scan.nextLine();
	}

	@Test
	public void swithTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績:");
		int input = scan.nextInt();
		switch (input / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
	}

	@Test
	public void swithTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請問今天是星期幾: (請輸入數字 0=7=週日=星期天)");
		int today = scan.nextInt();
		System.out.println("請輸入天數: ");
		int days = scan.nextInt();
		switch ((today + days) % 7) {
		case 1:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期一");
			break;
		case 2:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期二");
			break;
		case 3:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期三");
			break;
		case 4:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期四");
			break;
		case 5:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期五");
			break;
		case 6:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期六");
			break;
		default:
			System.out.println("今天是星期" + today % 7 + ", " + days + "天後是星期天");
			break;
		}
	}

	@Test
	public void switchTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是星期幾: ");
		int inputInt = scan.nextInt();
		String weekday = switchDay(inputInt);
		//中間一段switchday被簡化
		System.out.println("請輸入幾天後的天數: ");
		int days = scan.nextInt();
		String output = switchDay((inputInt + days) % 7);
//		switch ((inputInt + days) % 7) {
//		case 0:
//			output = "日";
////			System.out.printf("今天是星期%s, %d天後是星期日", weekday, days);
//			break;
//		case 6:
//			output = "六";
////			System.out.printf("今天是星期%s, %d天後是星期六", weekday, days);
//			break;
//		case 5:
//			output = "五";
////			System.out.printf("今天是星期%s, %d天後是星期五", weekday, days);
//			break;
//		case 4:
//			output = "四";
////			System.out.printf("今天是星期%s, %d天後是星期四", weekday, days);
//			break;
//		case 3:
//			output = "三";
////			System.out.printf("今天是星期%s, %d天後是星期三", weekday, days);
//			break;
//		case 2:
//			output = "二";
////			System.out.printf("今天是星期%s, %d天後是星期二", weekday, days);
//			break;
//		case 1:
//			output = "一";
////			System.out.printf("今天是星期%s, %d天後是星期一", weekday, days);
//			break;
//		}
		System.out.printf("今天是星期%s, %d天後是星期%s", weekday, days, output);
	}

	public String switchDay( int inputInt) {
		String weekday = "";
		switch (inputInt) {
		case 0:
			weekday = "日";
			break;
		case 6:
			weekday = "六";
			break;
		case 5:
			weekday = "五";
			break;
		case 4:
			weekday = "四";
			break;
		case 3:
			weekday = "三";
			break;
		case 2:
			weekday = "二";
			break;
		case 1:
			weekday = "一";
			break;
		}
		return weekday;
	}

}
