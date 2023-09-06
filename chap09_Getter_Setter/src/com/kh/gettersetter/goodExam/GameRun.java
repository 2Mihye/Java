package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		// player1.displayInfo();
		
		player1.setName("KH");
		// 문제점 : 0-10 = -10
		player1.setHealth(-10); // -10체력을 저장해주고
		player1.ValidHealth(); // -10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		
		player1.displayInfo();
		
		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		player2.setHealth(80);
		player2.ValidHealth();
		player2.setAttackPower(10);
		player2.ValidAttackPower();
		
		player2.displayInfo();
		
		System.out.println("Attack 후!!!");
	}

}

