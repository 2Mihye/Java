package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexam {
	public static void main(String[] args) {
		// Ű���忡�� ���� �� ���� �Է¹޾� �� ���� ��, ��, ��, ������ �� ��� ������ ���
		// int num1 = 30;
		// int num2 = 3;
		Scanner sc = new Scanner(System.in);
		
		int num4, num5;
		System.out.println("������ �Է��ϼ���. :");
		num4 = sc.nextInt();
		System.out.println("�� �ٸ� ������ �Է��ϼ���. :");
		num5 = sc.nextInt();
		System.out.println(num4 - num5);
	}
}
