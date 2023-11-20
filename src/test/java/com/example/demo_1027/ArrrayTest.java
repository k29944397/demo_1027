package com.example.demo_1027;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrrayTest {

	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a);
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 5;
		System.out.println(a);
		System.out.println("==========");
		// �ŧi���P�ɵ�����l��
		int[] b = { 1, 3, 5, 7, 9 };
		System.out.println(b[4]);
	}
	@Test
	public void listTest() {
		List <String> strList = new ArrayList<>();
		//      ����ƫ��A
		strList.add("A");
		strList.add("C");
		strList.add("B");
		strList.add("D");
		System.out.println(strList);
		System.out.println("---------------");
		System.out.println(strList.size());
		System.out.println("---------------");
		for(int i = 0; i< strList.size();i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("---------------");
		List<String> strList1 = List.of("A","B","V","D");
		List<String> strList2 = Arrays.asList("A1","B1","V1","D1");
		System.out.println(strList1);
		System.out.println(strList2);
		//����U�@��{���|���� �]����List.of()���ͪ�List ��j�p�T�w�A�L�k�A�W�R
		//strList1.add("G");
		//����U�@��{���|���� �]����Arrays.asList()���ͪ�List ��j�p�T�w�A�L�k�A�W�R
		//strList2.add("G1");
		System.out.println("---------------");
		List<String> strList3 = new ArrayList<>(List.of("A","B","V","D"));
		List<String> strList4 = new ArrayList<>(Arrays.asList("A1","B1","V1","D1"));
		System.out.println(strList3);
		System.out.println(strList4);
		System.out.println("---------------");
	}
	
	@Test
	public void foreachTest() {
		List<String> strList = new ArrayList<>(List.of("A","B","V","D"));
		for(int i = 0; i< strList.size();i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("===========");
		//foreach:�M��,�N��O�NList�̪��C�Ӷ��رq�Y����@�Ӥ@�Ө��X
		for(String item : strList ) {
			System.out.println(item);
		}
		System.out.println("===========");
		strList.forEach(item ->{
			System.out.println(item);
		});
	}
	
	@Test
	public void test4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�@�ӼƦr");
		int target = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		//int count = 0;
		for (int i = 2 ; i < target; i++) {
			boolean isPrime = true;
			for (int j= 2; j <= Math.sqrt(i); j++) {
				if(i%j == 0 && i!=j) {
					isPrime = false;
//					count++;
					break;
				}
				if(isPrime) {
					list.add(i);
				}
			}
		}
	}
	
	@Test
	public void listTest1() {
		int[] a= new int[3];
		System.out.println(a.length);
		Integer[] b = new Integer[3];
		String[] c = new String[3];
		List<String> strList = new ArrayList<>();
		List<Boolean> intList = new ArrayList<>();
		
	}
	
}
