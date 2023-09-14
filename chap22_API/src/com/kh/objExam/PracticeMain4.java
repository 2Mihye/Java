package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 pm = new PracticeMain4();
		// pm.practice1();
		// pm.practice2();
		// pm.practice3();
		pm.practice4();
	}
	
	public void practice1() {
		String name = "KH";
		int age = 25;
		String formatString = String.format("이름:%s, 나이:%d", name, age);
		System.out.println(formatString);
		System.out.println("이름:" + name + ", 나이:" + age);
	}
	
	public void practice2() {
		// 날짜 형식 출력
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// String s = smDateFormat.format(currentDate);
		String formatStr = String.format("현재 날짜 : %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}

	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		// String 변수명 = String.format("숫자1:    , 숫자2:      ",    ,     );
		// System.out.println(변수명);
		String fmString = String.format("숫자1: %d / 숫자2: %d",num1,num2);
		System.out.println(fmString);
		
		// 숫자가 지정된 넓이보다 짧을 경우 앞에 0으로 채워주겠다.
		// 출력되는 숫자의 최소 너비 자리를 5자리로 하고싶을 때 %05d
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		// 최소 10자리의 공간을 차지 %10s
		// 만약 문자열이  10자리보다 짧다면  왼쪽에 공백으로 채워진다.
		// 만약 문자열이 -10자리보다 짧다면 오른쪽에 공백으로 채워진다.
		// ' 작은 따옴표로 둘러싸야함
		String formatStr = String.format("'%-10s' %10s",text1, text2);
		System.out.println(formatStr);
		
	}
}
