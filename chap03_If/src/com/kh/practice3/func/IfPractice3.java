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
		System.out.println("���� ������ �Է��ϼ��� : ");
		korean = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		math = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		english = sc.nextInt();
		total = korean + math + english;
		average = (double)(total / 3);
		
		if (average >= 60) {
			System.out.println("���� : " + korean);
			System.out.println("���� : " + math);
			System.out.println("���� : " + english);
			System.out.println("�հ�� : " + total);
			System.out.println("����� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
}
