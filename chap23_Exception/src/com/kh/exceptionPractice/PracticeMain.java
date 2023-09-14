package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.ArithException();
		// pm.NPException();
		// pm.NumFormatException();
		pm.ExceptionExam();
	}
	
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리
		try {
			int dividend = 100;
			int divisor = 0;
			int result = dividend / divisor; // 0으로 나누는 시도
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("산술 연산으로 인해 발생한 에러!!" + e.getMessage());
		}
		
	}
	
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			// int length = text.lenth(); // Hello World 길이 얻기
			int length = text.indexOf(subText); // indexOf subText에 있는 null 값을 포함한 문자열 검색
		} catch(NullPointerException npe) {
			System.out.println("NullPointerException 에러 발생 : " + npe.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text); // 부적절한 형식의 문자열을 정수로 변환
			System.out.println(number);
		} catch (NumberFormatException format) {
			System.out.println("숫자만 넣어주세요.");
		}
	}
	
	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; // 유효하지 않은 인덱스 넘버
			int result = numbers[index]; // 배열 요소에 접근
			System.out.println("Result : " + result);
		} catch(ArrayIndexOutOfBoundsException e) { // 배열 인덱스가 범위를 벗어났을 때 발생하는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어나서 예외가 발생!");
		} catch(Exception e) { // 다른 예외를 처리할 수 있는 예외 처리
			System.out.println("배열 인덱스 범위를 벗어난 예외가 아닌 일반적인 다른 예외 발생");
		} finally {
			System.out.println("Finally 등장!"); // catch와는 별개로 항상 실행되는 블록
		}
		System.out.println("프로그램이 종료되었습니다.");

		
	}

}
