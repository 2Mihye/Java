package com.kh.practice7;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// 사용자에게 행의 크기를 입력받고 그 수만큼의 반복을 통해 열의 크기도 받아 문자형 가변 배열을 선언 및 할당
		// 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		// 사용자에게 행의 크기를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // 개행문자 제거
		
		int[][] charArray = new int[numRows][]; // 열은 자유롭게 할 수 있으므로 행만 입력
		// 그 수만큼의 반복을 통해
		for (int i = 0; i < numRows; i++) {
			// 열의 크기도 받아
			System.out.print("열의 크기 받기 : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int startValue = i * numCols + 1;
			for (int j = 0; j < numCols; j++) {
				charArray[i][j] = startValue++;
			}
			
			
			// 배열 출력
			}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < charArray[i].length; j++) {
				System.out.print('a' + charArray[i][j]-1);
			}
			System.out.println();
		}
	}

}
