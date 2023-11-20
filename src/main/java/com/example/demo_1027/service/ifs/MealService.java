package com.example.demo_1027.service.ifs;

import com.example.demo_1027.entity.Meal;

public interface MealService {
	
	public Meal addMeal(Meal meal);
	
	public Meal findByName(String name);
}
