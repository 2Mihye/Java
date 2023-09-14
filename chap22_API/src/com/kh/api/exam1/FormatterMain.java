package com.kh.api.exam1;

public class FormatterMain {
/*
 Formatter란?
 	문자열을 형식화 하는데 사용되는 클래스로 텍스트 출력을 원하는 형식에 맞게 포멧팅하고싶을 때 유용하게 사용한다.
 */
	public static void main(String[] args) {
		String name = "Kim";
		int age = 30;
		double salary = 50000.50;
		
		// Formatter 사용하여 문자열을 형식화
		// .2는 소수점 이하 자릿수를 지정하는데 사용되고 소수점 이하 두자리까지 출력한다.
		String formatString = String.format("이름:%s, 나이:%d, 월급:%.2f ", name, age, salary);
		
		// 형식화된 문자열을 출력
		System.out.println(formatString);

	}

}
