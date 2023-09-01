package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 문자열을 입력 받아 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 index에 위치하는지 index출력하기
		1. 문자열을 입력 받아
		2. 문자 하나하나 배열에 넣고
		3. 검색할 문자가 문자열에 
		4.
		5. 몇 번째 인덱스에 위치하는지
		6. 인덱스 출력하기
		 */
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("문자열을 입력하세요."); // 1. 문자열을 입력 받으시오
		String inputString = sc.next();
		System.out.println("검색할 문자를 입력하세요."); // 검색할 문자 입력빋기
		char searchChar = sc.next().charAt(0); // 첫 번째
		/*
		 2. 문자 하나하나 배열에 넣는다.
		 String 안에 있는 문자들을 배열로 담는다.
		 char로 문자를 만들어서 만든 문자들을 배열에 넣는다.
		 String 안에 char배열로 만들어주는 녀석 -> toCharArray
		 (ex) String 안녕하세요 -> {'안', '녕', '하', '세', '요'}
		
		String[] food = {"치킨","떡볶이","피자"};
		String hi = "안녕";
		System.out.println(hi.toCharArray());
		*/
		
		
		// 문자열을 -> 문자로 반환
		// String -> char
		char[] charString = inputString.toCharArray(); // toCharArray -> 문자열을 문자 배열로 변환하는 역할
		int charCount = charString.length; // 문자열에 몇 개 들어가 있는지 개수 -> length
		System.out.println("charCount : " + charCount);
		// 몇 번째 index에 위치하는지 index 출력하기
		// 총 길이가 얼마나 되는지 확인하고, 각 자리값 출력하기
		
		int count = 0;
		System.out.println(inputString + "에 " + searchChar + "가 존재하는 위치(인덱스) : ");
		// 반복문을 사용해서 위치 찾기
		for (int i = 0; i < charCount; i++) {
			// 몇 번째 인덱스에 위치하는지 인덱스 출력하기
			if (charString[i] == searchChar) { // charString[i]가 고정값이 아니라 i값이 되어야 하는 이유는
				// searchChar은 우리가 검색해서 문자값을 지정해주기 때문에 값이 고정되어 ㅣㅇㅆ어야 함.
				//만약 내가 이 문자를 검색했을 때 이 문자는 몇 번째 인덱스에 위치하는지 출력
				// 문자 배열이 내가 검색한 문자와 일치하는지
				System.out.println(i);
				count++;
			}
			
			
		}
	}

}
