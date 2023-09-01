package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		if (num < 1) {  // 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요" 출력
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { // 1 이상인 숫자만 들어온다.
			// 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			for ( int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			
		}
	}

}
