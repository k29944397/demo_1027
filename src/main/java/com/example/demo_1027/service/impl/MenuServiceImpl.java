package com.example.demo_1027.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo_1027.entity.Menu;
import com.example.demo_1027.repository.MenuDao;
import com.example.demo_1027.service.ifs.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	//@: annotation
	@Autowired
	private MenuDao menuDao;
	
	@Override
	public Menu addMenu(Menu menu) {
		if(!StringUtils.hasText(menu.getName()) || menu.getPrice() <= 0) {
			return null;
		}
//		Menu result = menuDao.save(menu);
//		return result;
		return menuDao.save(menu);
	}

	@Override
	public List<Menu> addMenus(List<Menu> menuList){
		for(Menu item : menuList) {
			if(!StringUtils.hasText(item.getName())||item.getPrice()<=0) {
				return null;
			}
		}
		return menuDao.saveAll(menuList);
	}

	@Override
	public Menu updateMenu(Menu menu){
		if (!StringUtils.hasText(menu.getName())||menu.getPrice()<=0) {
			return null;
		}
		if(menuDao.existsById(menu.getName())) {
			return null;
		}
		return menuDao.save(menu);
	}

	@Override
	public Menu findByName(String name) {
		Optional<Menu> op = menuDao.findById(name);
//		return op.orElseGet(null);
		if(op.isEmpty()) {
			return null;
		}
		return op.get();
		
		//三元式
		// ? 後面 true : false;
//		Menu menu = op.isEmpty() ? null : op.get();
//		return menu;
		//等於↓
//		return op.isEmpty() ? null : op.get();
	}
	@Override
	public List<Menu> findAll(){
		return menuDao.findAll();
	}

	@Override
	public List<Menu> addMenus(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
