package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/* Problem1
		 1. 배열의 길이를 선언
		 2. 1~10까지의 반복문을 이용
		
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			// 3. 순서대로 배열 인덱스에 넣은 후
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		// 4. 그 값을 출력
		for (int i = 1; i<num.length; i++) {
			System.out.println("num[ " + i + " ] = " + num[i]);
		}
		
		// 길이가 10인 배열을 선언하고 1~10까지의 값을 반복문을 이용해서 역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		// 출력값 : 10 9 8 7 6 5 4 3 2 1
		*/
		
		
		// Problem2
		// 1. 1부터 10인 배열을 선언
		int[] rever = new int[10];
		// 2. 1부터 10까지 값을 역순으로 배열에 할당
		int value = 10; // 10 대신에 rever.length라고 써도 가능 
		for (int i = 0; i < rever.length; i++) {
			rever[i] = value--;
			System.out.println("rever[ " + i + " ] = " + rever[i]);
		}
		
		// Problem3
		// 길이가 5인 String 배열 선언
		// "사과" "귤" "포도" "복숭아" "참외"로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하기
		String[] fruit = {"사과","귤","포도","복숭아","참외"};

		System.out.println("fruitIndex 1 = " + fruit[1]);
		
	}

}
