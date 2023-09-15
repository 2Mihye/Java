package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		PracticeMain pm = new PracticeMain();
		pm.practice1();
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

}
