package com.kh.practice1teacher.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("첫 번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		System.out.println("나누기 나머지 결과 : " + (num1 % num2));
		
	}

}
