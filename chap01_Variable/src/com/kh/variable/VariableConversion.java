package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		// 1. 자동 형변환(암시적 형변환, 묵시적 형변환)
		int intNum = 100;
		System.out.println(intNum); // 숫자 100을 의미
		long longNum = intNum; // int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; // float을 double로 자동 형변환
		System.out.println(floatNum);
		
		// int -> long 변경하는 형변환 2가지 만들고 출력하기
		int i = 209;
		long l = i;
		System.out.println("int -> long 1 : " + l);
		
		int date = 829;
		long longDate = date;
		System.out.println("int -> long 2 : " + longDate);
		
		// short -> int로 변경하는 형변환 1가지 만들고 출력하기
		short bus = 504;
		int intBus = bus;
		System.out.println("short -> int : " + intBus);
		
		// float -> double로 변경하는 형변환 1가지 만들고 출력하기
		float f = 3.14f;
		double d = f;
		System.out.println("float -> double : " + d);
		
		// 2. 강제 형변환 (명시적 형변환)
		
		// long -> int
		long largeLong = 123456789012345l;
		System.out.println("largeLong : " + largeLong);
		int largeInt = (int)largeLong;
		System.out.println("largeInt : " + largeInt); // long을 int로 강제 형변환 할 경우 값이 범위 안에 있지 않으면 일부 데이터가 손실됨.
		largeLong = 12345;
		largeInt = (int)largeLong;
		System.out.println("largeInt : " + largeInt);
		
		double largeDouble1 = 12345.6789;
		int intPart = (int)largeDouble1;
		System.out.println("intPart : " + intPart); // 실수를 int로 강제 형변환 할 때 정수 부분만 유지된다.
		
		// 문자와 숫자간의 형변환 2개 출력
		// 문자는 char charBalue = 'Z'; int로 변경
		char charBalue = 'Z';
		int character = (int) charBalue;
		System.out.println("character : " + character);
		
		char charValue = 'A';
		int character2 = charValue;
		System.out.println("character2 : " + character2);
		
		
		// double -> int로 형변환 1개 출력
		double dbNum = 3.14;
		int ntNum = (int) dbNum;
		System.out.println("ntNum : " + ntNum);
		
		// int -> short로 형변환 1개 출력
		int ntNumb = 999998889;
		short shrtNum = (short) ntNumb;
		System.out.println("ntNumb : " + ntNumb);
	}
}
