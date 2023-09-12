package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
	// 
		FoodStore order = new Order();
		order.addMenu("Â«»ÍÁÖ¹®");
		order.addMenu("ÅÁ¼öÀ°ÁÖ¹®");
		order.addMenu("Â¥Àå¸éÁÖ¹®");
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("µÈÀåÂî°³");
		order1.addMenu("±èÄ¡Àü");
		order1.addMenu("¸·°É¸®");
	}

}
