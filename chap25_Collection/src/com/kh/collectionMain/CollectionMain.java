package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("악뮤");
		myList.add("아이유");
		myList.add("백예린");
		
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
	}

}
