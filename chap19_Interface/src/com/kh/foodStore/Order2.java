package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

public class Order2 implements FoodStore{
	private List<Menu> orders;
	
	public void Orders() {
		orders = new ArrayList<>();
	}
	
	@Override
	public void addOrder (String menu) {
		Menu menu1 = new Menu(menu);
		orders.add(menu1);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	public void printMenu1() {
		System.out.println("주문 내역");
	}
}
