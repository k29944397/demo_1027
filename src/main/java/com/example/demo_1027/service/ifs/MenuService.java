package com.example.demo_1027.service.ifs;

import java.util.List;

import com.example.demo_1027.entity.Menu;

public interface MenuService {

	public Menu addMenu(Menu menu);

	public List<Menu> addMenus(Menu menu);

	public Menu updateMenu(Menu menu);

	public Menu findByName(String name);

	public List<Menu> findAll();

	List<Menu> addMenus(List<Menu> menuList);
}
