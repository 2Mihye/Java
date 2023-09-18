package com.kh.threadMain;
/*
Thread��?
	���μ��� ������ ����Ǵ� �������� ���� �帧
	��Ƽ�������� ���� ���� �۾��� ������ �� �ְ� �Ѵ�.
	
*/
public class ThreadMain extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread ���� �� : " + i);
		}
		try {
			Thread.sleep(1000); // 1�� ���� Thread �Ͻ�����
			System.out.println("Thread �������ϱ�?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// �ν��Ͻ� �� ����
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		// Thread ����
		thread1.start();
		thread2.start();

		// main Thread���� �ٸ� �۾��� ������ �� ����
		try {
			thread1.join(); // Thread1�� ����� ������ ���
			thread2.join(); // thread2�� ����� ������ ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��� thread ����!");
	}

}
