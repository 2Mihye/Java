package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {
		// 정수형
		ArrayList<String> strList = new ArrayList<>();
		strList.add("케로피");
		strList.add("마이멜로디");
		strList.add("시나몬롤");
		strList.add("키티");
		
		printList(strList);
	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	public void practice2() {
		// Box 객체를 com.kh.genericspractice; 밑에 생성
		// 정수형 데이터를 저장하는 Box 인스턴스 생성
		Box<Integer> intBox = new Box<>();
		intBox.put(9);
		intBox.put(10);
		intBox.put(11);
		int intValue = intBox.get();
		
		// 문자열 데이터를 저장하는 Box 인스턴스 생성
		Box<String> strBox = new Box<>();
		strBox.put("블로섬");
		strBox.put("버블");
		strBox.put("버터컵");
		String strValue = strBox.get();
		
		// 각 각 출력
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		
		// 향상된 for문 사용하여 값 모두 출력 // 일단 생략
		
		
	}
	/*
	public static <T> void printBox(Box<T> item) {
		for (T print : item) {
			System.out.println(item);
		}
	}
	*/

}
