package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		// �÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		// player1.displayInfo();
		
		player1.setName("KH");
		// ������ : 0-10 = -10
		player1.setHealth(-10); // -10ü���� �������ְ�
		player1.ValidHealth(); // -10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
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
		
		System.out.println("Attack ��!!!");
	}

}

