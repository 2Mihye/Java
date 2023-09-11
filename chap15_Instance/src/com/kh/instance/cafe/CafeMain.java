package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("라떼", "tall", true);
		Cafe client2 = new Cafe("얼그레이바닐라라떼", "grande", false);
		Cafe client3 = new Cafe("아메리카노", "short", false);
		
		
		client1.makeCoffee();
		client2.makeCoffee();
		client3.makeCoffee();
	}

}
