package com.kh.classCircle;

public class Circle {
	// 멤버변수 (필드)
	// final double PI = 3.14;
	// private final double PI = 3.14
	// private static final double PI = 3.14; // 메모리 어디에 저장이 되는지에 따라 다를 뿐 전부 출력이 됨.
	final double PI = 3.14; // 상수
	private int radius = 1; // 변수
	
	// 생성자
	public Circle() {
		// 기본 생성자
		
	}
	
	// 메서드에서 반지름에 대해 출력
	public void inRadius() {
		// 반지름 증가 : 증가시킬 양을 지정할 수 있다!
		radius++;
	}
	public void AreaCircle() {
		// 원의 넓이를 계산하고 출력하는 메서드
		double area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void SizeOfCircle() {
		System.out.println("원의 크기(반지름) : " + radius);
	}
}
