package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice6 {
	// ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ù ��° ���ڸ� �Է����ּ���.");
		int start = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���.");
		int end = sc.nextInt();
		
		// �� ������ ���ڸ� ��� ���
		System.out.println(start + "���� " + end + "������ ����");
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
	}

}
