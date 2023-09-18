package com.kh.threadPractice;

import java.util.Random;

public class GameLoop implements Runnable {
	static boolean isGameOver = false;

	@Override
	public void run() {
		while (!isGameOver) {
			// 게임 루프 내용
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
			
			// 게임 루프 지연 시간
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 게임 종료 조건은 Enter 키를 누르면 게임이 종료된
			System.out.println("게임을 종료하려면 Enter을 누르세요");
		}
	}

}