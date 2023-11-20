package com.example.demo_1027;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo_1027.entity.Meal;
import com.example.demo_1027.entity.MealId;
import com.example.demo_1027.repository.MealDao;
import com.example.demo_1027.service.ifs.MealService;

@SpringBootTest
public class MealServiceTest {

	@Autowired
	private MealService mealService;

	@Autowired
	private MealDao mealDao;

	@Test
	public void addMeal() {
		mealService.addMeal(new Meal("beef", "BBQ", 180));
		mealService.addMeal(new Meal("beef", "fry", 150));
		mealService.addMeal(new Meal("pork", "fried", 220));
		mealService.addMeal(new Meal("chiken", "stew", 260));
		mealService.addMeal(new Meal("chiken", "BBQ", 120));
		mealService.addMeal(new Meal("chiken", "steam", 520));
		mealService.addMeal(new Meal("apple", "suger", 1520));
	}

	@Test
	public void addMealTest() {
		// name ぃ才兵ン
		Meal result = mealService.addMeal(new Meal("", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error!");
		// cooking_styleぃ才
		result = mealService.addMeal(new Meal("beef", "", 180));
		Assert.isTrue(result == null, "addMeal error!");
		// price ぃ才
		result = mealService.addMeal(new Meal("beef", "BBQ", 0));
		Assert.isTrue(result == null, "addMeal error!");
		// タ盽穝糤
		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result != null, "addMeal error!");
		// 穝糤meal
		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error!");
		// 埃代刚戈
//		mealDao.deleteById(new MealId("beef", "BBQ"));
	}

	@Test
	public void limitTest() {
		List<Meal> res = mealDao.findFirst2ByName("chiken");
		System.out.println(res.size());
		Assert.isTrue(res.size() == 2, "find limit error!");
	}

	@Test
	public void limitTest2() {
		List<Meal> res = mealDao.findAllByOrderByPrice();
		for(Meal item :res) {
			System.out.println(item.getName() + item.getCookingStyle() + ":" +item.getPrice());
		}
	}
	
	@Test
	public void compareTest() {
		List<Meal> res = mealDao.findByPriceGreaterThan(200);
		for(Meal item :res) {
			System.out.println(item.getName() + item.getCookingStyle() + ":" +item.getPrice());
		}
	}
	
	@Test
	public void containingTest() {
		List<Meal> res = mealDao.findByNameContainingAndCookingStyleContaining("e", "b");
		for(Meal item :res) {
			System.out.println(item.getName() + item.getCookingStyle() + ":" +item.getPrice());
		}
	}
	
	@Test
	public void betweenTest() {
		List<Meal> res = mealDao.findByPriceBetween(200, 300);
		for(Meal item :res) {
			System.out.println(item.getName() + item.getCookingStyle() + ":" +item.getPrice());
		}
	}
	
	@Test
	public void inTest() {
//		List<Meal> res = mealDao.findByPriceIn(new ArrayList<>(List.of(120,150,180,200)));
		List<Meal> res = mealDao.findByPriceNotIn(new ArrayList<>(List.of(120,150,180,200)));
		for(Meal item :res) {
			System.out.println(item.getName() + item.getCookingStyle() + ":" +item.getPrice());
		}
	}
	
}
