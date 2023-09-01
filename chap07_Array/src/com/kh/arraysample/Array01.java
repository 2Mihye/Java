package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		/* Array 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 			동일한 데이터 타입을 가진 여러 값을 한 곳에 저장하고 인덱스를 사용하여 각 값에 접근할 수 있도록 제공
		 			배열은 프로그램에서 데이터를 보다 효율적으로 저장하고 관리하는데 사용
		 			데이터의 집합을 쉽게 다룰 수 있도록 도와줌
		 			
		   특징 
		   1. 고정된 크기 : 생성할 때 크기가 결정되고, 크기가 고정되어 있음
		 	 		  	  : 생성 후 크기를 변경할 수 없음
		   2. 같은 데이터 타입 : 배열 내에 모든 요소는 동일한 데이터 타입을 가져야함.
		   					ex) int타입 배열은 모든 요소가 정수여야 한다.
		   3. index 기반 접근 : 각 배열의 요소는 순차적인 index를 가지며 0부터 시작해서 배열 크기 -1까지의 값을 가짐
		   					 index를 사용하여 특정 위치에 있는 요소 접근 가능
		   					 ex) 배열크기를 5로 줬다면 index는 0 ~ 4
		   4. 배열의 길이(length) : 배열의 길이를 알 수 있다.
		   
		   
		   배열의 구조
		   		데이터타입[] 배열이름 = new 데이터타입[크기]; // 배열 생성 및 초기화
		   		
		   		C언어에서는 데이터타입 배열이름[] = ~ 로 사용함
		 */
		
		// int score1, score2, score3, score4, score5; // score가 지금은 5개지만 나중에 1000개라면? -> 배열 사용
		/* int[] score = new int [5]; // 생성자 // int 타입 5개의 배열 생성
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		// System.out.println(score); // [I@5e91993f
	 	System.out.println(score[0]);
	 	*/
		/*
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[5]; // index 0 ~ 4까지 만들기 // int 5개 생성
		for(int i = 0; i < 5; i++) {
			// System.out.println("값을 입력하시오.");
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		*/
		
		String[] stringArray = new String[2]; // String[] stringArray = {" "," "," "};
		// 어떤 값이 들어올지 모를 경우 사용
		System.out.println("stringArray : " + stringArray[0]); // StringArry : null // 아직 값을 입력하지 않았기 때문
		stringArray[0] = "가";
		System.out.println("stringArray : " + stringArray[0]); // stringArray : 가
		
		// String[] nameArray = {"김경난","김말똥","홍길동"};
		String[] food = {"떡볶이","떡꼬치","김밥","닭강정","피자","감자튀김"}; // index 5개
		int foodLength = food.length;
		System.out.println("food 배열의 길이 : " + foodLength); // length는 index값을 0부터 세지 않고 1부터 // 6
		// 
		
	}

}
