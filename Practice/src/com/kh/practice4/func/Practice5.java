package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			num += i;
			System.out.println ("현재까지 총합은 " + num + " 입니다." );
		}
		
	}

}
