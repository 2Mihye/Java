package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple","Cherry"},
				{"Grape","Orange","Strawberry"},
				{"Kiwi"}
		};
		System.out.println("fruits.length : " + fruits.length);
		System.out.println("fruits[i].length : " + fruits[0].length);
		System.out.println("fruits[1].length : " + fruits[1].length);
		System.out.println("fruits[2].length : " + fruits[2].length);
		
		for (int i = 0; i < fruits.length; i++) { // 첫 번째 for문은 행
			System.out.println("첫 번째 for문 : " + i);
			for (int j = 0; j < fruits[i].length; j++) { // 두 번째 for문은 열
				System.out.print(fruits[i][j] + " ");
				System.out.println("두 번째 for문 : " + j);
			}
			System.out.println(); // 다음 행으로 이동할 수 있도록 enter용 출력 메서드 입력
		}
	}

}
