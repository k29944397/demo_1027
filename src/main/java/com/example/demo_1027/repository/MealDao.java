package com.example.demo_1027.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_1027.entity.Meal;
import com.example.demo_1027.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId>{
	
	//限制搜尋結果回傳筆數 以下兩種一樣
	//findTop數字: 限制搜尋結果回傳數
	public List<Meal> findTop2ByName(String name);
	//findFirst數字: 限制搜尋結果回傳數
	public List<Meal> findFirst2ByName(String name);
	
	//排序 預設:ASC
	//ASC: 由小到大; DESC: 由大到小
	public List<Meal> findByNameOrderByPrice(String name);

	public List<Meal> findAllByOrderByPrice();
	//DESC由大到小
	public List<Meal> findAllByOrderByPriceDesc();
	
	//比較大小
	//1. 大於: GreaterThan 2.大於等於: GreaterThanEual
	//3. 小於: LessThan 4.小於等於: LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);
	
	public List<Meal> findByNameAndPriceGreaterThan(String name, int price);
	
	//containing
	public List<Meal> findByNameContaining(String name);
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between: 有包含上下界的值
	public List<Meal> findByPriceBetween(int price1, int price2);
	
	//In矩陣內有的  //NotIn 矩陣內以外的
	public List<Meal> findByPriceIn(List<Integer> priceList);
	public List<Meal> findByPriceNotIn(List<Integer> priceList);

} 
