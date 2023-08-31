package com.kh.practice2teacher.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("국어점수 : ");
		double kor = sc.nextDouble();
		System.out.println("영어점수 : ");
		double eng = sc.nextDouble();
		System.out.println("수학점수 : ");
		double math = sc.nextDouble();
		
		int totalScore = (int)(kor + eng + math);
		int averageScore = (totalScore / 3);
		System.out.println("국어점수 = " + kor + " / 영어점수 = " + eng + " / 수학점수 = " + math + " / 총첨 = " + totalScore + " / 평균점수 = " + averageScore);
		
		
 	}

}
