package com.kh.overloadingEx;

public class OverSample {
	public float sum (float a, float b) {
		return a+b;
	}
	
	public float mul (float a, float b) {
		return a*b;
	}
	
	public int sum (int a, int b) {
		return a+b;
	}
	
	public int mul (int a, int b) {
		return a*b;
	}
	
	public int div (int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		OverSample obj = new OverSample();
		
		System.out.println("float �� : " + obj.sum(2.9f, 6.1f));
		System.out.println("float �� : " + obj.mul(2.9f, 6.1f));
		System.out.println("int �� : " + obj.sum(2, 24));
		System.out.println("int �� : " + obj.mul(2, 24));
		System.out.println("int ������ : " + obj.div(24, 2));
	}
}
