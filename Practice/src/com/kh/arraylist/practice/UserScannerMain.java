package com.kh.arraylist.practice;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		// 사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음, 향상된 for문을 사용하여 배열의 모든 요소를 더한 결과 출력
		
		// 1. 정수 입력받을 Scanner 만들기
		Scanner sc = new Scanner (System.in);
		int[] numbers = new int[5];
		
		System.out.println("정수를 입력하세요 : ");
		// 배열에 5개의 정수를 입력하는 for문
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		// 조건이 최종까지 더하는 것이기 때문에 향상된 for문 사용 (=또는 기본 for문을 이용하고 싶다면 length를 사용해서 출력 가능)
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		
		// 배열의 모든 요소를 더한 결과 출력
		System.out.println("배열의 모든 요소를 더한 결과 : " + sum);

		//for(int num : numbers) {
		// System.out.println(num);
		//}
		
	}

}
