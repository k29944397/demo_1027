package com.example.demo_1027;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_1027.service.ifs.AtmService;
import com.example.demo_1027.vo.AtmResponse;

@SpringBootTest
public class AtmServiceTest {

	@Autowired
	private AtmService atmService;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("A01","AA123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}
	
	@Test
	public void getBalanceTest() {
		AtmResponse res = atmService.getBalanceByAccount("A01", "A123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getBalance());
	}
	@Test
	public void updatTest(){
		AtmResponse res = atmService.updatePwd("A01", "AA123", "A123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}
	
	@Test
	public void depositTest() {
		AtmResponse res = atmService.deposit("A01", "A123", 10);
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getBalance());
	}
	
	@Test
	public void withdrawTest() {
		AtmResponse res = atmService.withdraw("A01", "A123", 5);
		System.out.println("SystemCode:"+res.getRtnCode().getCode());
		System.out.println("SystemMessage:"+res.getRtnCode().getMessage());
		System.out.println("Account:"+res.getAtm().getAccount());
		System.out.println("Balance:"+res.getAtm().getBalance());
	}
}
