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
		System.out.println(str.equalsIgnoreCase(str3));// IgnoreCase���b�G�j�p�g
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
		// isEmpty() �O�ݦr����׬O�_��0
		System.out.println("str1 isEmpty:" + str1.isEmpty());// True
		System.out.println("str2 isEmpty:" + str2.isEmpty());// False
		System.out.println("===========");
		// isBlank(): 1.���׬�0; 2.�r�ꤺ�e���Ѫťղզ�:�������� 1.or 2.�h�^��true
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
			System.out.println("color �O�Ŧr��");// �O�Ŧr��
		} else {
			System.out.println("color ���O�Ŧr��");
		}
		System.out.println("===========");
		System.out.println(StringUtils.hasLength("  "));// True ������
		System.out.println(StringUtils.hasText("  "));// False ���space�S�����e
		System.out.println("===========");
		// color == null ��U��令���T��
		// color = "ABC"; 1.������Ѽ�
		if (!StringUtils.hasText(color)) {// 2.�["!"
			System.out.println("color �S�����e");// 3.��ԭz""���e
		} else {
			System.out.println("color �����e");
		}
	}

	@Test
	public void stringTest3() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String key = "�p�s�k";
		System.out.println("�r�����:" + str.length());// ����length : 41
		String str1 = str.replace(key, "");// �N���r�ꤤ������r�c����ͦ��s�r��
		int times = ((str.length() - str1.length()) / key.length());
		// �N��r��length()��s�r��length()���H����rlength()
		System.out.println("�p�s�k�X�{����" + times);// ��"(41-32)/3 = 3"��
		System.out.println("�Ĥ@���X�{�p�s�k:" + str.indexOf(key));// 8
	}

	// �D"�p�s�k"�b�r�ꤤ�X�{������
	@Test
	public void stringTest3ex() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		String key = "�p�s�k";
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
//		System.out.println("=====�H�W�Ĥ@��=====");
//		while(str.indexOf(key, index) != -1) {
//			times++;
//			index = str.indexOf(key, index) + key.length();
//		}
//		System.out.println(times);
//		System.out.println("=====�H�W�ĤG��=====");
		for (; str.indexOf(key, index) != -1;) {
			times++;
			index = str.indexOf(key, index) + key.length();
		}
		System.out.println(times);
	}

	@Test
	public void replaceTest() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
		str = str.replace("�p�s�k", "�pī�G");
		System.out.println(str);
	}

	@Test
	public void splitTest() {
		String str = "����L�Q�O���L�P�p�s�k���G��,�ڤ����w�p�s�k���ҥP,���M�p�s�k�b���L�����O�M�s��U";
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
		str = str.replace(" ", "");// �h���Ů�
		System.out.println(str);
	}

	@Test
	public void substringTest() {
		String str = "����L�Q�O���L�P�p�s�k���G��";
		String subStr = str.substring(5);// 5�H��
		String subStr1 = str.substring(5, 11);// 5��11
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

	@Test // �D��:��̫�@��"A"����"W"
	public void replaceTest1() {
		String str = "ABACADEF";
//		String str1 = str.replace("AD", "WD");  //���Y�B
		int index = str.lastIndexOf("A");// <<"str.lastIndexOf">> imdex = 4
		String str1 = str.substring(index);// ADEF
		str1 = str1.replace("A", "W");// WDEF
		str = str.substring(0, index) + str1;
		System.out.println(str);
	}

	@Test
	public void stringBufferTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��r:");
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		if (str.equals(sb.reverse().toString())) {
			System.out.println(str + "�O�j��");
		} else {
			System.out.println(str + "���O�j��");
		}
	}

	@Test
	public void stringBufferTest3() {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("�п�J2�Ӧr�H�W");
			String str = scan.next();
			if (str.length() <= 3) {
				continue;
			}
			StringBuffer sb = new StringBuffer(str);
			if (str.equals(sb.reverse().toString())) {
				System.out.println(str + "�O�j��");
			} else {
				System.out.println(str + "���O�j��");
			}
			break;
		}
	}
	
	@Test
	public void listTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr");
		int inputInt = scan.nextInt();
		inputInt++;
		String str = String.valueOf(inputInt);
		String[] strArray = str.split("");
		System.out.println(new ArrayList<>(Arrays.asList(strArray)));
//		List<Integer> intList = new ArrayList<>();
	}
}
