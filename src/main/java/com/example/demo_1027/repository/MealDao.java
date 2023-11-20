package com.example.demo_1027.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_1027.entity.Meal;
import com.example.demo_1027.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId>{
	
	//����j�M���G�^�ǵ��� �H�U��ؤ@��
	//findTop�Ʀr: ����j�M���G�^�Ǽ�
	public List<Meal> findTop2ByName(String name);
	//findFirst�Ʀr: ����j�M���G�^�Ǽ�
	public List<Meal> findFirst2ByName(String name);
	
	//�Ƨ� �w�]:ASC
	//ASC: �Ѥp��j; DESC: �Ѥj��p
	public List<Meal> findByNameOrderByPrice(String name);

	public List<Meal> findAllByOrderByPrice();
	//DESC�Ѥj��p
	public List<Meal> findAllByOrderByPriceDesc();
	
	//����j�p
	//1. �j��: GreaterThan 2.�j�󵥩�: GreaterThanEual
	//3. �p��: LessThan 4.�p�󵥩�: LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);
	
	public List<Meal> findByNameAndPriceGreaterThan(String name, int price);
	
	//containing
	public List<Meal> findByNameContaining(String name);
	public List<Meal> findByNameContainingAndCookingStyleContaining(String name,String cookingStyle);
	
	//between: ���]�t�W�U�ɪ���
	public List<Meal> findByPriceBetween(int price1, int price2);
	
	//In�x�}������  //NotIn �x�}���H�~��
	public List<Meal> findByPriceIn(List<Integer> priceList);
	public List<Meal> findByPriceNotIn(List<Integer> priceList);

} 
