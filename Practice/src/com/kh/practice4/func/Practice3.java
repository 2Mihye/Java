package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		
		if (num < 1) { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { // 1 �̻��� ���ڵ�
			for (int i = 1; i <= num; num-- ) { // for�� �ȿ� �ϼ��ϱ�
				System.out.println(num);
			}
		}
	}

}
