package com.ky.classConstant;

public class Constant {
	private final int c = 1;
	public static final int a = 1; // 더 이상 a의 값을 바꾸지 못하게 잠궈둠
	static final int b = 1;
	
	public static void main(String[] args) {
		// 상수사용
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		
		System.out.println("a의 값 : " + a);
	}
}
