package com.kh.practice2teacher.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("���� �Է� : ");
		// char intputChar = sc.next(); // char inputChar = sc.next().charAt(0); �Է¹��� ���� ���
		char inputChar = sc.next().charAt(0);
		int changeChar = inputChar;
		System.out.println("�Է� ���� : " + inputChar + " / �����ڵ� : " + changeChar);
	}

}
