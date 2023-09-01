package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice6 {
	// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력
		System.out.println("첫 번째 숫자를 입력해주세요.");
		int start = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요.");
		int end = sc.nextInt();
		
		/*
		// 그 사이의 숫자를 모두 출력
		System.out.println(start + "부터 " + end + "까지의 숫자");
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		*/
		int reStart = end;
		int reEnd = start;
		if (start < end) { // 만약 첫 번째 숫자가 두 번째 숫자보다 작을 때
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
		} else if (end < start) { // 만약 두 번째 숫자가 첫 번째 숫자보다 작을 때
			for (int i = reStart; i <= reEnd; i++) {
				System.out.print(i + " ");
			}
		}
		
		/*
		 * int reStart,reEnd;
		 * if(start < end) {
		 * 		reStart = start;
		 * 		reEnd = end;
		 * } else if (end < start) {
		 * 		int reStart = end;
		 * 		int reEnd = start;
		 * }
		 * 
		 * int reStart, reEnd;
		 * for (
		 * 
		 for (int i = reStart; i <= 
		 */
		
		/*
		 Math 자바에 내장된 클래스
		 min : 가장 작은 값 ; 주어진 두 개의 숫자 중에서 더 작은 값을 반환
		 max : 가장 큰 값; 주어진 두 개의 숫자 중에서 더 큰 값을 반환
		 
		 int a = 5;
		 int b = 8;
		 int minValue = Math.min(a, b); // minValue에는 5가 저장됨
		 System.out.println("minValue : " + minValue); // 5
		 int maxValue = Math.max(a, b); // maxValue에는 8이 저장됨
		 System.out.println("maxValue : " + maxValue); // 8
		 
		 
		 //위를 활용하여
		 System.out.pritnln("첫 번째 숫자를 입력하세요.");
		 int firstNumber = sc.nextInt();
		 System.out.println("두 번째 숫자를 입력하세요.");
		 int secondNumber = sc.nextInt()
		 
		 int start = Matn.min(firstNumber, secondNumber);
		 // start에는 둘 중 상대적으로 더 작은 값이 들어간다.
		 int end = Math.max(firstNumber, secondNumber);
		 // end에는 둘 중 상대적으로 더 큰 값이 들어간다.
		  
		 for (int i = start; i <= end; i++) {
		 System.out.println(i);
		
		 */
	}

}
