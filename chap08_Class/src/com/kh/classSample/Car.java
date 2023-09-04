package com.kh.classSample;

public class Car {
	// 1. ���� �ʵ� �������
	String brand;	  // �귣��
	String model;	  // ��
	int speed;	 	  // �ӵ�
	boolean engineOn; // ���� ����
	/*
	 * ===========================================
	 * ������� �ؿ��� ��� �޼ҵ�� ����
	 */
	
	// 2. �����ڴ� �޼����� �� ���� ����
	public Car(String brand, String model) { // ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
		this.brand = brand; 
		this.model = model;
		this.speed = 50;
		this.engineOn = true;
	}
	
	// 3. ���� ���� �޼���
	public void startEngine() {
		// ���࿡ ������ true�� ���� �õ�
		System.out.println("������ " + brand + " �Դϴ�.");
		if(engineOn) {
			System.out.println("������ �����մϴ�."); // ��¸޼��� �ۼ�
		} else { // ������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ �����ֽ��ϴ�."); 
		}
		
	}
	
	// ���� �޼���
	public void accelerate(int amount) { // �Ķ������ �̸��� ���� ǥ���ϰ� ���� �̸��� �ᵵ �ȴ�
		if(engineOn) {
			// ������ true�� ���� �ӵ��� �󸶴�.
			speed += amount;
			System.out.println("�ӵ� " + speed + " �Դϴ�.");
		} else {
			// ������ false�� ������ ���� �־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� �����ϴ�.");
		}
		
	}
}
