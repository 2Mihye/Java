package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alphabet;
		System.out.print("문자열을 입력하세요 : ");
		alphabet = sc.next();
		System.out.println("첫 번째 문자 : " + alphabet.charAt(0));
		System.out.println("두 번째 문자 : " + alphabet.charAt(1));
		System.out.println("세 번째 문자 : " + alphabet.charAt(2));
		
	}
}
