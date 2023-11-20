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
		System.out.println("�п�J��r");
		String a = scan.next();
		String b = scan.next();
		System.out.println("��J����r:" + a + b);
	}

	@Test
	public void scannerTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r");
		String a = scan.nextLine();
		System.out.println("��J����r:" + a);
	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r");
		int a = scan.nextInt();
		System.out.println("��J����r:" + a);
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
		System.out.println("�п�J���Z:");
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
		System.out.println("�аݤ��ѬO�P���X: (�п�J�Ʀr 0=7=�g��=�P����)");
		int today = scan.nextInt();
		System.out.println("�п�J�Ѽ�: ");
		int days = scan.nextInt();
		switch ((today + days) % 7) {
		case 1:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P���@");
			break;
		case 2:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P���G");
			break;
		case 3:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P���T");
			break;
		case 4:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P���|");
			break;
		case 5:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P����");
			break;
		case 6:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P����");
			break;
		default:
			System.out.println("���ѬO�P��" + today % 7 + ", " + days + "�ѫ�O�P����");
			break;
		}
	}

	@Test
	public void switchTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ѬO�P���X: ");
		int inputInt = scan.nextInt();
		String weekday = switchDay(inputInt);
		//�����@�qswitchday�Q²��
		System.out.println("�п�J�X�ѫ᪺�Ѽ�: ");
		int days = scan.nextInt();
		String output = switchDay((inputInt + days) % 7);
//		switch ((inputInt + days) % 7) {
//		case 0:
//			output = "��";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P����", weekday, days);
//			break;
//		case 6:
//			output = "��";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P����", weekday, days);
//			break;
//		case 5:
//			output = "��";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P����", weekday, days);
//			break;
//		case 4:
//			output = "�|";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P���|", weekday, days);
//			break;
//		case 3:
//			output = "�T";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P���T", weekday, days);
//			break;
//		case 2:
//			output = "�G";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P���G", weekday, days);
//			break;
//		case 1:
//			output = "�@";
////			System.out.printf("���ѬO�P��%s, %d�ѫ�O�P���@", weekday, days);
//			break;
//		}
		System.out.printf("���ѬO�P��%s, %d�ѫ�O�P��%s", weekday, days, output);
	}

	public String switchDay( int inputInt) {
		String weekday = "";
		switch (inputInt) {
		case 0:
			weekday = "��";
			break;
		case 6:
			weekday = "��";
			break;
		case 5:
			weekday = "��";
			break;
		case 4:
			weekday = "�|";
			break;
		case 3:
			weekday = "�T";
			break;
		case 2:
			weekday = "�G";
			break;
		case 1:
			weekday = "�@";
			break;
		}
		return weekday;
	}

}
