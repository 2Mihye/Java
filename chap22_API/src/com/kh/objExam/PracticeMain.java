package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {
	/*
	 equals if
	 hashCode
	 toString
	 */
	
	Scanner sc = new Scanner (System.in);
	Object a = new Object();
	Object b = new Object();
	
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	public void practice1() {
		// Scanner 이용해서 구현
		System.out.println("문자열 a를 입력하세요.");
		String a = sc.nextLine();
		System.out.println("문자열 b를 입력하세요.");
		String b = sc.nextLine();
		sc.close(); // 메모리 유실 방지
		
		boolean isEqual = true;
		if (a.equals(b)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열 다릅니다.");
		}
		
		// 문자열의 해시코드 출력
		int hashCode1 = a.hashCode();
		int hashCode2 = b.hashCode();
		System.out.println("첫 번째 문자열의 해시코드 : " + hashCode1);
		System.out.println("두 번째 문자열의 해시코드 : " + hashCode2);
		
		// 문자열의 문자열 표현 출력
		String aString = a.toString();
		String bString = b.toString();
		System.out.println("첫 번째 문자열의 문자열 표현 : " + aString);
		System.out.println("두 번째 문자열의 문자열 표현 : " + bString);
		
	}

}
