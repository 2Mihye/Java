package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// 정수형 데이터를 저장하는 ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// 문자열 데이터를 저장하는 ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("둘리");
		strList.add("고길동");
		strList.add("희동이");
		strList.add("또치");
		
		// 제너릭 메서드를 사용하여 요소 출력 -> printList
		printList(intList);
		printList(strList);
	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}
