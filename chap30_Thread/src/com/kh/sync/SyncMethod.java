package com.kh.sync;
/*
 Synchronized��?
 	���� ������ ȯ�濡�� ���� �������κ��� �������� �ϰ����� ��ȣ�ϱ� ���� ���Ǵ� Ű�����̴�.
 	�ϳ��� �����尡 Ư�� ���� �Ǵ� �޼��带 �����ϴ� ���� �ٸ� �����尡 ������ ���� �Ǵ� �޼��忡 ���ÿ� �������� ���ϵ��� �ϴµ�,
 	�̴� ������ ���� ���� ���ǰ� ������ ����ġ ������ �����ϴ� �� ������ �ȴ�.
 	
 	�޼��� ����ȭ : �޼��� ��ü�� ����ȭ �ϴ� ���, �ش� �޼����� ���� �߿��� �ٸ� �����尡 �ش� �޼��忡 ������ �� ����.
 				ex) public synchronized void syncMethod() {
 						// ����ȭ �� �޼��� ����
 					}
 	���� ����ȭ : Ư�� ������ ����ȭ�ϴ� ��� ���� ������ �ڵ常 ����
 				ex) public void someMethod () {
 						// �񵿱��ڵ�
 						synchronized () {
 							// ����ȭ �� ���� ����
 							}
 						// �񵿱��ڵ�
 					}
 */
public class SyncMethod {
	private int count = 0;
	private Object lockObj = new Object(); // ����ȭ�� ���� ��ü
	
	// �޼��� ���� ����ȭ�� ����ؼ� count ������ ������Ŵ
	// �� ���� �ϳ��� �����常 ������ �� �ֵ��� �����Ѵ�.
	public synchronized void increment() {
		count++;
	}
	
	/*
	  pTask : ����ȭ�� ���ΰ��� �Բ� ����Ѵ�.
	  synchronized(lockObj) : "�ڵ� ���� ������ count ������ ������Ű�� ���� lockObj�� ����Ͽ� ���⸦ ����
	  lockObj ����ϴ� ���� : �ٸ� �޼��忡�� ����ȭ�� ����� �� �ְ�, �ٸ� ��ü�� ���� ����ȭ�� �и��Ǿ� �浹�� ������ �� �ִ�.
	  
	 */
	
	public void pTask() {
		// �ٸ� �񵿱� �ڵ�
		synchronized(lockObj) {
			// lockObj�� ����� ����ȭ�� ����
			 count++;
		}
		// �ٸ� �񵿱� �ڵ�
	}
	
	// SyncMethod Ŭ������ �ν��Ͻ��� �����ϰ� Runnable �����Ͽ� ������ ���� 
	public static void main(String[] args) {
		SyncMethod sync = new SyncMethod();
		// Runnable �������̽� ������ ����ؼ� ������ ����
		//  ������ ����
		
		// thread1
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					sync.increment();
				}
			}
		};
		
		// thread2
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					sync.increment();
				}
			}
		};
		
		// ������ ���� �� ����
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		// ��� �����尡 ����� �� ���� ���
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����ī��Ʈ : " + sync.count);
	}
}

 // synchronized count ������ ���� ���� ������ ����ȭ, ������ �� ���� ������ �߻����� �ʾ� count ������ �����ϰ� �����ϰ� �������� �ϰ����� �����Ѵ�.