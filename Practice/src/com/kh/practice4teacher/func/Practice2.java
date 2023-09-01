package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		
		while (isTrue) { // 1. 조건만들기
			System.out.println("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) { 
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else { 
				for ( int i = 1; i <= num; i++) {
					System.out.println(i);
					isTrue = false; // 3. 조건 false 만들기
				}
				// isTrue = false
				// break; if나 switch에서 사용할 수 있다.
			}
		}

	}

}
