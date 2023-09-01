package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		/*
		 Array 예제
		 String[] internArray = {"김경난","이하니","이미주","이미혜","짱구"};
		 internArray[3] = "훈이";
		 System.out.println("이미주 대신 " + internArray[3]);
		 */
		
		String[] fruitArray = {"사과","딸기","키워","메론","귤"};
		
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		
		
		int fruitLength = fruitArray.length;
		for (int i = 0; i < fruitLength; i++) {
			System.out.println("index "+ i + "의 자리 : " + fruitArray[i]);
		}
		
	}	

}
