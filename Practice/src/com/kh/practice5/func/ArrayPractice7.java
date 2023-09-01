package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int sum = 0;
		
		System.out.println("배열의 길이를 입력하세요.");
		int num = sc.nextInt();
		int[] numArray = new int[num];
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(i + "번째 인덱스에 넣을 값 : ");
			int answer = sc.nextInt();
			numArray[i] = answer;
		}
		
		for (int j = 0; j < numArray.length; j++) {
			System.out.print(numArray[j] + " ");
			sum += numArray[j];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	
		

		
		
	}

}
