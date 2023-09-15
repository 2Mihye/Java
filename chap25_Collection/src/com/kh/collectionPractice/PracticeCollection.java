package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		// pc.practiceList();
		// pc.practiceSet();
		pc.practiceMap();
	}
	
	// String 중복된 값 포함해서 add 해보고 향상for문으로 출력
	public void practiceList() {
		
		List<String> pList = new ArrayList<>();
		pList.add("케로피");
		pList.add("마이멜로디");
		pList.add("시나몬롤");
		pList.add("폼폼푸린");
		pList.add("시나몬롤"); // 중복이지만 출력됨
		System.out.println("ArrayList : ");
		for(String characters : pList) {
			System.out.println(characters);
		}
	}
	
	// String 중복된 값 포함해서 add 해보고 향상for문으로 출력
	public void practiceSet() {
		Set<String> mySet = new HashSet<>();
		mySet.add("이무진");
		mySet.add("악동뮤지션");
		mySet.add("아이유");
		mySet.add("이무진"); // 중복이라 나오지 않을 요소
		System.out.println("Set : ");
		for(String musician : mySet) {
			System.out.println(musician);
		}
	}
	
	public void practiceMap() {
		// 키와 값을 이용해서 map put 한다음 향상for문으로 출력해보기
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("짱구", 100);
		myMap.put("철수", 85);
		myMap.put("훈이", 90);
		myMap.put("유리", 88);
		myMap.put("맹구", 95);
		myMap.put("철수", 99);
		
		for(String crayon : myMap.keySet()) {
			int grade = myMap.get(crayon);
			System.out.println(crayon + " " + grade + "점");
		}
	}

}
