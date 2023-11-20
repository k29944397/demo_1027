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
//		menuService.addMenu(new Menu("pork", 100)); //�[�Jpork 100��
//	}



	@Test
	public void addMenuTest() {
		// name ���X����
		Menu result = menuService.addMenu(new Menu("", 200));
		Assert.isTrue(result == null, "addMenu error!");
		// price = 0
		result = menuService.addMenu(new Menu("chiken", 0));
		Assert.isTrue(result == null, "addMenu error!");
		// ���`�s�W
		result = menuService.addMenu(new Menu("fish", 120));
		Assert.isTrue(result != null, "addMenu error!");
		// �s�W�w�s�bMenu
		result = menuService.addMenu(new Menu("fish", 150));
		Assert.isTrue(result == null, "addMenu error!");
		// �R�����ո��
//		menuDao.deleteById("fish");
	}

	@Test
	public void addMenuTest2() {

		Menu result = menuService.addMenu(new Menu("beef", 120));
		Assert.isTrue(result == null, "addMenu error!");
	}

	@Test
	public void findByaNameTest() {
		// name ���ű���
		Menu result = menuService.findByName("");
		Assert.isTrue(result == null, "findByName error!");
		// name ���s�b
		result = menuService.findByName("fish");
		Assert.isTrue(result == null, "findByName error!");
		// �s�W���ո��
//		result = menuService.addMenus(new Menu ("fish",120));
		result = menuService.findByName(null);
	}
}
