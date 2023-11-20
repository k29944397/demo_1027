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
//		System.out.print("\n"); // "\n" 換行
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
//		System.out.println("一年可以儲存 ： " + annual_savings);

//      三元
//		String x ="x";
//		String y ="y";
//		System.out.println(5>4 ? x:y);

//		前後遞增
//		int x, y, value;
//		x = y = 10;
//		value = ++x * 10;
//		System.out.println("遞增放前面\t" + value);
//		value = y++ * 10;
//		System.out.println("遞增放後面\t" + value);
//
//		System.out.println("x= " + x + "\ty= " + y);

//		Scanner儲存 可輸入並儲存
//		Scanner scan = new Scanner(System.in);
//		int x, y;
//		String str;
//		x = scan.nextInt();
//		y = scan.nextInt();
//		str = scan.next();
//		System.out.println(x + "\t" + y + "\t" + str);
	}
}
