package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a;
		System.out.print("���� : ");
		a = sc.next().charAt(0);
		int numb = a;
		
		System.out.println(a + " unicode : " + numb);
	}

}