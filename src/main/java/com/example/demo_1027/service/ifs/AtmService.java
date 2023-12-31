package com.example.demo_1027.service.ifs;

import com.example.demo_1027.vo.AtmResponse;

public interface AtmService {
	
	public AtmResponse login(String account,String pwd);
	
	public AtmResponse addInfo(String account,String pwd);
	
	public AtmResponse getBalanceByAccount(String account , String pwd);
	
	public AtmResponse updatePwd(String account, String oldPwd,String newPwd);
	
	public AtmResponse deposit(String account,String pwd, int amount);
	
	public AtmResponse withdraw(String account,String pwd, int amount);

}
