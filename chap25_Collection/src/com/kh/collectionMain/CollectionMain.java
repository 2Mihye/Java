package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List 예제
		List<String> myList = new ArrayList<>(); // List와 ArrayList import
		myList.add("악뮤");
		myList.add("아이유");
		myList.add("백예린");
		myList.add("아이유"); // 중복이지만 출력됨
		
		System.out.println("List : ");
		// 향상된 for문 활용하여 출력
		for(String singer : myList) {
			System.out.println(singer);
		}
		
		// Set 예제
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2); //  중복된 요소는 허용하지 않으므로 출력되지 않음
		
		for(Integer number : mySet) {
			System.out.println(number);
		}
		
		// Map 예제
		Map<String, Integer> myMap = new HashMap<>();
		// 	  Map<String, Integer>
		myMap.put("캐나다", 1);
		myMap.put("한국",  82);
		myMap.put("일본",  81);
		myMap.put("미국",  1);
		myMap.put("스페인", 34);
		myMap.put("독일", 49);
		myMap.put("한국",  3); // 중복출력이 아니라 가장 마지막에 들어간 요소로 출력이 된다.
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
		}
		
	}

}
