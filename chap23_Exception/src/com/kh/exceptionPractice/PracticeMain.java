package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.ArithException();
		// pm.NPException();
		pm.NumFormatException();
	}
	
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		try {
			int dividend = 100;
			int divisor = 0;
			int result = dividend / divisor;
		} catch (ArithmeticException e) {
			System.out.println("산술 연산으로 인해 발생한 에러!!" + e.getMessage());
		}
		
	}
	
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
		} catch(NullPointerException npe) {
			System.out.println("!!!빈 값임!!!" + npe.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch (NumberFormatException format) {
			System.out.println("숫자만 넣어주세요.");
		}
	}

}
