package com.kh.gettersetter;

public class Circle {
	private double PI = 3.14; // 상수
	private int radius = 1; // 변수
	

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
