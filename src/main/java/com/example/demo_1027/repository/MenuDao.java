package com.example.demo_1027.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_1027.entity.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, String>{

//	public Menu addMenu(Menu menu);
//
//	public List<Menu> addMenus(List<Menu> menuList);
//
//	public List<Menu> updateMenu(Menu menu);

	public List<Menu> findByName(String name);
	
	public List<Menu> findAll();
}
