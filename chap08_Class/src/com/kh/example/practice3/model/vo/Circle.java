package com.kh.example.practice3.model.vo;

public class Circle {
/*
 �ʵ�(�������)
 		- PI : double = 3.14
 		- radius : int = 1
 ������
 		+ Circle()
 �޼ҵ�
 		+ incrementRadius() : void
 		+ getAreaOfCircle() : void
 		+ getSizeOfCircle() : void
 */
	
// �������
	double PI = 3.14; // ������
	int radius = 1; //������
	
	//������
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
		System.out.println("radius : " + radius);
	}
	
	public void getAreaOfCircle() {
		double area = PI * radius * radius;
		System.out.println("area : " + area);
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� ������: " + radius);
	}
		
}
