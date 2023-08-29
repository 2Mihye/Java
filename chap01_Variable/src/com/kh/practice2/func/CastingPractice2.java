package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double korean, english, math;
		System.out.print("국어 : ");
		korean = sc.nextDouble();
		System.out.print("영어 : ");
		english = sc.nextDouble();
		System.out.print("수학 : ");
		math = sc.nextDouble();
		
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		
		int total = (int)(korean + english + math);
		System.out.println("총점 : " + total);
		
		int average = (int) ((korean + english + math) / 3);
		System.out.println("평균 : " + average);
	}

}
