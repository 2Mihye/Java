package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexam {
	public static void main(String[] args) {
		// 키보드에서 정수 두 개를 입력받아 두 수의 합, 차, 곱, 나누기 한 몫과 나머지 출력
		// int num1 = 30;
		// int num2 = 3;
		Scanner sc = new Scanner(System.in);
		
		int num4, num5;
		System.out.println("정수를 입력하세요. :");
		num4 = sc.nextInt();
		System.out.println("또 다른 정수를 입력하세요. :");
		num5 = sc.nextInt();
		System.out.println(num4 - num5);
	}
}
