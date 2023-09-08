package com.kh.mvc.circle.vo;

import java.util.Scanner;

public class CircleView {
	public double getUserInput() {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요.");
		return sc.nextDouble();
	}
	
	public void displayResult(double result) {
		System.out.println("결과 : " + result);
	}
}
