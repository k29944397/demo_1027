package com.example.demo_1027.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_1027.service.ifs.AtmService;
import com.example.demo_1027.vo.AtmRequest;
import com.example.demo_1027.vo.AtmResponse;
import com.exapmle.demo_1027.constants.RtnCode;

@RestController
public class AtmController {
	
	@Autowired
	private AtmService atmService;
	
	@GetMapping(value = "atm/login")
	public AtmResponse login(@RequestBody AtmRequest req, HttpSession session) {
		System.out.println(session.getAttribute("account"));
		if (session.getAttribute("account")!=null) {
			return new AtmResponse(null,RtnCode.SUCCESSFULL);
		}
		AtmResponse res = atmService.login(req.getAccount(), req.getPwd());
//		if(StringUtils.hasText(account)) {			
//			return new AtmResponse(null, RtnCode.ACCOUNT_EXISTED);
//		}
		if (res.getRtnCode().getCode()==200) {
			session.setAttribute("account", req.getAccount());
			session.setAttribute("password", req.getPwd());
			session.setMaxInactiveInterval(300);//設定session有效時間:300s
		}
		return res;
	}
	@GetMapping(value= "atm/logout")
	@Cacheable(cacheNames = "atm_login", key = "#account")
	public AtmResponse logout(@RequestBody String account,HttpSession session) {
		//讓 session 失效
		session.invalidate();
		return new AtmResponse(null, RtnCode.SUCCESSFULL);
	}

	@GetMapping(value = "atm/get_balance")
	public AtmResponse getBalanceByAccount(HttpSession session) {
		String account = (String)session.getAttribute("account");
		String pwd = (String)session.getAttribute("password");
		if(StringUtils.hasText(account)) {
			return atmService.getBalanceByAccount(account, pwd);
		}
		return new AtmResponse(null, RtnCode.PLEASE_LOGIN_FIRST);
	}
}
