package com.kh.practice1teacher.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("문자열을입력하세요. : ");
		String s = sc.next();
		
		char a = s.charAt(0); // 문자를 1자씩 읽기 때문에 apple이 1자를 넘어가서 출력할 수 없음. // 자리 위치 정해서 출력하기
		System.out.println("index 0번째 자리 : " + a);
		char p = s.charAt(1); // 보통 변수 이름을 indextNum1 나 indextNum2를 써서 변수명으로 보여주어야 함.
		System.out.println("index 1번째 자리 : " + p);
		
		String p2 = s.substring(2,3); // 시작과 끝을 정해서 출력 가능함. // 객체부분 // 한 자리가 아니라 자리를 지정해서 출력할 수 있음.
		// 시작만 정해도 되고, 끝을 지정해도 됨. // 자리 위치 정해서 출력하기
		// 시작만 작성할 경우 시작한 인덱스 위치부터 끝까지 출력된다.
		System.out.println("index 2번째 자리 : " + p2);
		
		
		
	}

}
