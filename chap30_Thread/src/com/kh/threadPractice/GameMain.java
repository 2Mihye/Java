package com.kh.threadPractice;

public class GameMain extends GameLoop {
	public static void main(String[] args) {		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		// ������ ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			System.in.read(); // ����ڰ� Ű����� �Է��� ����Ʈ�� �а�, ����ڰ� Enter Ű�� ���� ������ ���α׷� �Ͻ� ����
			
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
				// ���� ���� ����
				int randomValue = new Random().nextInt(10);
				System.out.println("������ ���� : " + randomValue);
				
				// ���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// ���� ���� ������ Enter Ű�� ������ ������ �����
				System.out.println("������ �����Ϸ��� Enter�� ��������");
			}
		}
	}
 */
}
