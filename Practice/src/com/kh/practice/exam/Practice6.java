package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// 1 �̻��� ���ڸ� �Է��ϼ���
		// ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ���
		// ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		// ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���"�� ����ϼ���.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if (num < 1) { // ���� 1 �̸��� ���ڰ� �Է��� �ǰų� �Է��� ���� 1���� ũ
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { // 1 �̻��� ���ڵ�
			for ( int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
	}

}
