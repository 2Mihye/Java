package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������ �Է��ϼ���.");
		int num = sc.nextInt();
		
		int[] numArray = new int[num];
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

}
