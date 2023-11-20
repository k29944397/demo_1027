package com.example.demo_1027;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo_1027.entity.Menu;
import com.example.demo_1027.repository.MenuDao;
import com.example.demo_1027.service.ifs.MenuService;

@SpringBootTest // (classes = {Demo1027Application.class})
public class MenuServiceTest {

	@Autowired
	private MenuService menuService;

	@Autowired
	private MenuDao menuDao;
	
//	@Test
//	public void addMenuTest() {
//		menuService.addMenu(new Menu("pork", 100)); //加入pork 100元
//	}



	@Test
	public void addMenuTest() {
		// name 不合條件
		Menu result = menuService.addMenu(new Menu("", 200));
		Assert.isTrue(result == null, "addMenu error!");
		// price = 0
		result = menuService.addMenu(new Menu("chiken", 0));
		Assert.isTrue(result == null, "addMenu error!");
		// 正常新增
		result = menuService.addMenu(new Menu("fish", 120));
		Assert.isTrue(result != null, "addMenu error!");
		// 新增已存在Menu
		result = menuService.addMenu(new Menu("fish", 150));
		Assert.isTrue(result == null, "addMenu error!");
		// 刪除測試資料
//		menuDao.deleteById("fish");
	}

	@Test
	public void addMenuTest2() {

		Menu result = menuService.addMenu(new Menu("beef", 120));
		Assert.isTrue(result == null, "addMenu error!");
	}

	@Test
	public void findByaNameTest() {
		// name 不符條件
		Menu result = menuService.findByName("");
		Assert.isTrue(result == null, "findByName error!");
		// name 不存在
		result = menuService.findByName("fish");
		Assert.isTrue(result == null, "findByName error!");
		// 新增測試資料
//		result = menuService.addMenus(new Menu ("fish",120));
		result = menuService.findByName(null);
	}
}
