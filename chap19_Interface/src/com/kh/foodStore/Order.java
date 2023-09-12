package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

// ArrayList & List
// 주문 객체
public class Order implements FoodStore { // 개발자들간의 소통을 위해 implements를 사용하여 다시 가져와서 재사용
	private List<Menu> ordermenus; // 주문한 내용들
	
	public Order() {
		ordermenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		ordermenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	
	@Override
	public void printMenu() {
		System.out.println("주문 내역");
		for (Menu menuA : ordermenus) {
			System.out.println(menuA.getItem());
		}
	}
	
	// 주문 객체2 출력하는 문구 변경
}
