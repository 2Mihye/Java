package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("0���� 6���� ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
		String[] day = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		if (num < day.length) {
			System.out.println(day[num]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

}
