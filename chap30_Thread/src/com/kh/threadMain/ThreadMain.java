package com.kh.threadMain;
/*
Thread란?
	프로세스 내에서 실행되는 독립적인 실행 흐름
	멀티스레딩을 통해 여러 작업을 수행할 수 있게 한다.
	
*/
public class ThreadMain extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread 실행 중 : " + i);
		}
		try {
			Thread.sleep(1000); // 1초 동안 Thread 일시정지
			System.out.println("Thread 끝났습니까?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// 인스턴스 둘 생성
		ThreadMain thread1 = new ThreadMain();
		ThreadMain thread2 = new ThreadMain();
		
		// Thread 시작
		thread1.start();
		thread2.start();

		// main Thread에서 다른 작업을 수행할 수 있음
		try {
			thread1.join(); // Thread1이 종료될 때까지 대기
			thread2.join(); // thread2가 종료될 때까지 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("모든 thread 종료!");
	}

}
