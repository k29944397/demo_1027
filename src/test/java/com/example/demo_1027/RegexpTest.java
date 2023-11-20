package com.example.demo_1027;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {

	@Test
	public void regexpTest() {
		String str = "0978-456-230";
		// d�¼Ʀr w(a~z+A~Z+0~9+_)
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �Τj�A��{}���N���ƥX�{��������
//		String pattern = "\\d{4}-\\d{3}-\\d{3}"; 
		// �i�H�Τp�A��()�A�Y���
		String pattern = "\\d{4}(-\\d{3}){2}";
		System.out.println(str.matches(pattern));
	}

	@Test
	public void regexpTest2() {
//		String pattern = "\\(\\d{2}\\)\\d{8}";//(02)12345678
//		String pattern1 = "\\(\\d{2}\\)\\d{7}";//(02)1234567
//		//ABC�O�N�W����0�M1��X ABC�ĪG�@��
//		String patternA = "\\(\\d{2}\\)\\d{8}||\\(\\d\\)\\d{7}";//(92)12345678 or(02)1234567
//		String patternB = "\\(\\d{2}\\)\\d{8}||\\d{7}";
//		String patternC = "\\(\\d{2}\\)\\d{7,8}";//
//
//		
//		String pattern2 = "\\d{2}-\\d{7}";//02-1234567
//		String pattern3 = "\\d{2}-\\d{8}";//02-12345678
//		String patternD = "\\d{2}-\\d{7,8}";//2�M3����X 02-12345678 or 02-1234567
		String patternE = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";// C�MD����X

		System.out.println("�п�J�q�ܸ��X:");
		System.out.println("�q�ܮ榡��:(�ϽX2�X)�q�ܸ��X7�Xor8�X");
		System.out.println("�q�ܮ榡��:�ϽX2�X-�q�ܸ��X7�Xor8�X");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if (str.matches(patternE)) {
			System.out.println(str + "�ŦX�榡");
		} else {
			System.out.println(str + "���ŦX�榡");
		}
	}

	@Test
	public void regexpTest3() {
//		String pattern0 = "0\\d{1,3}-\\d{7,8}";// ���ܽm��
//		String pattern1 = "0[1-9]{1,3}-\\d{7,8}";
		String pattern2 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";//�����Ҧr��
//		String pattern2 = "([\\w&&[^\\D_abdefhABDEFH]][1,2]\\d{8})"; //�ư��A�ư��Z���쪺�g�k
		String pattern3 = "[CGI-Zcgi-z][1-2]\\d{8}";//�ɤO��
		Scanner scan = new Scanner (System.in);
		String str = scan.next();
		System.out.println(str.matches(pattern2));
	}
	
	@Test
	public void regexpTest4() {
		String str = "a";
		String str1 = "Ab";
		String pattern = "\\w";    // \\w���@�Ӧr��,�d��[A-Za-z0-9_]
		String pattern1 = "\\w.";  // .��ܥ��N1�Ӧr��
		String pattern2 = "\\w.*"; // .*���0~�h�Ӧr��,�ҥH�᭱�i���i�L
		System.out.println(str.matches(pattern));//T w���@�Ӧr��,�d��[A-Za-z0-9_]
		System.out.println(str1.matches(pattern));//F �h�F
		System.out.println("===================");
		System.out.println(str.matches(pattern1));//F �֤F.
		System.out.println(str1.matches(pattern1));//T
		System.out.println("===================");
		System.out.println(str.matches(pattern2));//T 
		System.out.println(str1.matches(pattern2));//T 
	}

}
