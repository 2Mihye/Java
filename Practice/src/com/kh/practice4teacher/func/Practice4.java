package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		
		while (isTrue) {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if (num < 1) { 
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else { 
				for (int i = 1; i <= num; num--) { // int i = num; i >= 1; i--
					System.out.println(num);
					isTrue = false;
				}
			}
		}
	}

}
