package com.kh.practice2teacher.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("문자 입력 : ");
		// char intputChar = sc.next(); // char inputChar = sc.next().charAt(0); 입력받은 문자 출력
		char inputChar = sc.next().charAt(0);
		int changeChar = inputChar;
		System.out.println("입력 문자 : " + inputChar + " / 유니코드 : " + changeChar);
	}

}
