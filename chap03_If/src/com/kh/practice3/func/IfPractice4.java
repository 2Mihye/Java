package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int month;
		System.out.println("���� �Է��ϼ��� : ");
		month = sc.nextInt();
		switch (month) {
			case 1: case 2: case 12: {
				System.out.println(month + "���� �ܿ��Դϴ�.");
				break;
			}
			case 3: case 4: case 5: {
				System.out.println(month + "���� ���Դϴ�.");
				break;
			}
			case 6: case 7: case 8: {
				System.out.println(month + "���� �����Դϴ�.");
				break;
			}
			case 9: case 10: case 11: {
				System.out.println(month + "���� �����Դϴ�.");
			}
			default:
				System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}

}
