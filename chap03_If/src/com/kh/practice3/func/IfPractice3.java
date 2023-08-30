package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int korean;
		int math;
		int english;
		int total;
		double average;
		System.out.println("영어 점수를 입력하세요 : ");
		korean = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		english = sc.nextInt();
		total = korean + math + english;
		average = (double)(total / 3);
		
		if (average >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계는 : " + total);
			System.out.println("평균은 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
}
