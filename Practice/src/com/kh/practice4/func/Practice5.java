package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			num += i;
			System.out.println ( );
		}
		// ������ ���� ���ϵ����.. ���� ��������� �Ѱ迴���̴�..
	}

}
