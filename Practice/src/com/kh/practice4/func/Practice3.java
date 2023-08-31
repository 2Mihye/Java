package com.kh.practice4.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		if (num < 1) { 
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { // 1 이상인 숫자들
			for (int i = 1; i <= num; num-- ) { // for문 안에 완성하기
				System.out.println(num);
			}
		}
	}

}
