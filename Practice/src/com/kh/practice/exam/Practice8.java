package com.kh.practice.exam;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		/*
		 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		if (num < 1) { // 만일 1 미만의 숫자가 입력이 되거나 입력한 수는 1보다 크
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { // 1 이상인 숫자들
			for (  ;  ; ) { // for문 안에 완성하기
				System.out.println("");
			}
		}
	}

}
