package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		System.out.println("���ڸ� �Է��ϼ���.");
		num = sc.nextInt();
		if (num % 2 > 0) {
			System.out.println("Ȧ���Դϴ�.");
		} else if (num / 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}

}
