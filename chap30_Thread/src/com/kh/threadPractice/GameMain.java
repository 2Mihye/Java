package com.kh.threadPractice;

public class GameMain extends GameLoop {
	public static void main(String[] args) {		
		// 게임 루프 스레드 시작
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		// 게임의 종료 조건 : 플레이어가 Enter 키를 누르면 게임 종료
		try {
			System.in.read(); // 사용자가 키보드로 입력한 바이트를 읽고, 사용자가 Enter 키를 누를 때까지 프로그램 일시 중지
			
			isGameOver = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/*
	class Gm implements Runnable{
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
 */
}
