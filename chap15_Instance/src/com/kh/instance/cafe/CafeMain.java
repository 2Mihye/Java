package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe client1 = new Cafe("��", "tall", true);
		Cafe client2 = new Cafe("��׷��̹ٴҶ��", "grande", false);
		Cafe client3 = new Cafe("�Ƹ޸�ī��", "short", false);
		
		
		client1.makeCoffee();
		client2.makeCoffee();
		client3.makeCoffee();
	}

}
