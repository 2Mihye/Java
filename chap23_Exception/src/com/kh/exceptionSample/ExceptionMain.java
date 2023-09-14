package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain em = new ExceptionMain();
		// em.ExceptionA();
		// em.ExceptionN();
		em.ExceptionF();

	}

	public void ExceptionA() {
		try {
			int result = 10 / 0; // 0으로 나누는 시도
			System.out.println("Result : " + result);
		} catch(ArithmeticException e) { // catch (에러이름 변수명)
			/*
			 ArithmeticException : 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e에서 e는 우리가 지정한 변수명
			 getMessage는 지정한 변수로 메세지를 전달받는다.
			 */
			System.out.println("산술 연산으로 인해 발생한 에러!!" + e.getMessage());
		}
	}

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); // 내용이 없는데 text로 부터 문자열의 길이를 얻기
			System.out.println("문자열 길이 : " + length);
		} catch(NullPointerException npe) {
			// System.out.println("빈 값입니다."); -> 문구만 출력
			System.out.println("!!!빈 값임!!!" + npe.getMessage());
		}

	}
	
	public void ExceptionF() {
		try {
			String iDNum = "팔오공904";
			int num = Integer.parseInt(iDNum); // 문자열을 정수로 변환 시도
			System.out.println("숫자 : " + num); // 안에 String이 들어있기 때문에 실행이 되지 않음.
		} catch (NumberFormatException format) {
			System.out.println("숫자만 넣어주세요.");
			System.out.println("NumberFormatException 발생 : " + format.getMessage());
		}
	}
}
