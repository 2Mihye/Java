package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alphabet;
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		alphabet = sc.next();
		System.out.println("ù ��° ���� : " + alphabet.charAt(0));
		System.out.println("�� ��° ���� : " + alphabet.charAt(1));
		System.out.println("�� ��° ���� : " + alphabet.charAt(2));
		
	}
}
