package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {
	
	private static String[] stArray = new String[3];
	

	public static void main(String[] args) {
		ListArray1();
		ListArray2();
	}
	
	public static void ListArray1() {
		// Array 예제
			int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성
			intArray[0] = 1;
			intArray[1] = 2;
			
			// Array 출력
			System.out.println("Array 요소 : ");
			for (int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[i] + " ");
			}
			
			System.out.println(); // 개행문자 포함되어있어 enter같은 역할
			// List 예제
			List<Integer> intList = new ArrayList<>(); // Integer 객체를 저장하는 ArrayList 생성 // List와 ArrayList 둘 다 import
			intList.add(1);
			intList.add(2);
			intList.add(3);
			
			// List 출력
			System.out.println("List 요소 : ");
			for (int num : intList) {
				System.out.print(num + " ");
			}
	}
		
		
	public static void ListArray2() {
			// String으로 변경 후 Array와 List 출력해보기
			stArray[0] = "이무진";
			stArray[1] = "이준호";
			stArray[2] = "아이유";
				
			System.out.println("List 요소 : ");
			for (String list : stArray) {
				System.out.println(list + " ");
			}
				
			List<String> strList = new ArrayList<>();
			strList.add("만두");
			strList.add("떡볶이");
			strList.add("와플");
				
			System.out.println("List 요소 : ");
			for (String list : strList) {
				System.out.println(list + " ");
			}
	}
		
	

}
