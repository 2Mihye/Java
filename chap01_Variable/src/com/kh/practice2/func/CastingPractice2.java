package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double korean, english, math;
		System.out.print("���� : ");
		korean = sc.nextDouble();
		System.out.print("���� : ");
		english = sc.nextDouble();
		System.out.print("���� : ");
		math = sc.nextDouble();
		
		System.out.println("���� : " + korean);
		System.out.println("���� : " + english);
		System.out.println("���� : " + math);
		
		int total = (int)(korean + english + math);
		System.out.println("���� : " + total);
		
		int average = (int) ((korean + english + math) / 3);
		System.out.println("��� : " + average);
	}

}
