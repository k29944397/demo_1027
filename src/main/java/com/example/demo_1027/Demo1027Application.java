package com.example.demo_1027;

import org.springframework.boot.SpringApplication;

//import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Demo1027Application {

	public static void main(String[] args) {
		
		//10/27
		SpringApplication.run(Demo1027Application.class, args);
		
//		int x = 5;
//		System.out.print(x);
//		System.out.print("\n"); // "\n" ����
//		System.out.print("x+50=" + x+5 + "\n");
//		System.out.printf("x = %d",x);

//		char a = 'p';
//		char aa = 97;
//		System.out.print("\n" + "a =" + a + "\t aa =" + aa + "\n");
//		int y = 6;
//		System.out.println( x < y);
//		String Str = "abc";
//		System.out.print(Str + a);
//		Integer xx = 8;

//		int hourly_salary = 120;
//		int monthly_free = 9000;
//		int annual_salary, annual_free, annual_savings;	
//		annual_salary = hourly_salary *8 * 300;
//		annual_free = monthly_free *12;
//		annual_savings = annual_salary - annual_free;
//		System.out.println("�@�~�i�H�x�s �G " + annual_savings);

//      �T��
//		String x ="x";
//		String y ="y";
//		System.out.println(5>4 ? x:y);

//		�e�Ỽ�W
//		int x, y, value;
//		x = y = 10;
//		value = ++x * 10;
//		System.out.println("���W��e��\t" + value);
//		value = y++ * 10;
//		System.out.println("���W��᭱\t" + value);
//
//		System.out.println("x= " + x + "\ty= " + y);

//		Scanner�x�s �i��J���x�s
//		Scanner scan = new Scanner(System.in);
//		int x, y;
//		String str;
//		x = scan.nextInt();
//		y = scan.nextInt();
//		str = scan.next();
//		System.out.println(x + "\t" + y + "\t" + str);
	}
}
