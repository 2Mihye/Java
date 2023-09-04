package com.kh.example.practice3.model.vo;

public class Circle {
/*
 필드(멤버변수)
 		- PI : double = 3.14
 		- radius : int = 1
 생성자
 		+ Circle()
 메소드
 		+ incrementRadius() : void
 		+ getAreaOfCircle() : void
 		+ getSizeOfCircle() : void
 */
	
// 멤버변수
	double PI = 3.14; // 원주율
	int radius = 1; //반지름
	
	//생성자
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
		System.out.println("원의 반지름: " + radius);
	}
		
}
