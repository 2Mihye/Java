package com.kh.practice.exam;

import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		/* ����� �簢��
		 *****
		 *   *
		 *   *
		 *   *
		 *****
		
		
		*/
		for(int i = 1; i <= 5; i++) { // �� ����
			for(int j = 1; j <= 5; j++) { // �� ����
				// ���� 1�� ��� (���� ����)
				// ���� �࿡�� ����ϴ� ���� ù ��° ���� ��� ( j == 1 )
				// ���� �࿡�� ���� �������� ���� ��� ( j == num)
				// ���� �������� ��� (i == num) -> ���� �Ʒ���
				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		}
		
		
		
		/*
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}

}
