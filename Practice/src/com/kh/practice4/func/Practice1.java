package com.kh.practice4.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		if (num < 1) { 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { 
			for ( int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		
	}

}