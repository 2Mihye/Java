package com.kh.practice2teacher.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("�������� : ");
		double kor = sc.nextDouble();
		System.out.println("�������� : ");
		double eng = sc.nextDouble();
		System.out.println("�������� : ");
		double math = sc.nextDouble();
		
		int totalScore = (int)(kor + eng + math);
		int averageScore = (totalScore / 3);
		System.out.println("�������� = " + kor + " / �������� = " + eng + " / �������� = " + math + " / ��÷ = " + totalScore + " / ������� = " + averageScore);
		
		
 	}

}
