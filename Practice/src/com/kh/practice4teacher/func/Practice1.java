package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		if (num < 1) {  // ���� 1 �̸��� ���ڰ� �Էµƴٸ� "1 �̻��� ���ڸ� �Է����ּ���" ���
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { // 1 �̻��� ���ڸ� ���´�.
			// 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
			for ( int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			
		}
	}

}
