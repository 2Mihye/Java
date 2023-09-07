package com.kh.inheritance.calculator;

public class CalculatorForMod extends Calculator {
	// 나눈 다음에 나머지를 구할 수 있는 기능이 추가된 계산기로 업그레이드!
	public int mod(int num1, int num2) {
		return num1 % num2;
	}
}
