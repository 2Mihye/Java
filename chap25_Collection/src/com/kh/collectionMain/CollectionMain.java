package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List ����
		List<String> myList = new ArrayList<>(); // List�� ArrayList import
		myList.add("�ǹ�");
		myList.add("������");
		myList.add("�鿹��");
		myList.add("������"); // �ߺ������� ��µ�
		
		System.out.println("List : ");
		// ���� for�� Ȱ���Ͽ� ���
		for(String singer : myList) {
			System.out.println(singer);
		}
		
		// Set ����
		Set<Integer> mySet = new HashSet<>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(2); //  �ߺ��� ��Ҵ� ������� �����Ƿ� ��µ��� ����
		
		for(Integer number : mySet) {
			System.out.println(number);
		}
		
		// Map ����
		Map<String, Integer> myMap = new HashMap<>();
		// 	  Map<String, Integer>
		myMap.put("ĳ����", 1);
		myMap.put("�ѱ�",  82);
		myMap.put("�Ϻ�",  81);
		myMap.put("�̱�",  1);
		myMap.put("������", 34);
		myMap.put("����", 49);
		myMap.put("�ѱ�",  3); // �ߺ������ �ƴ϶� ���� �������� �� ��ҷ� ����� �ȴ�.
		
		for(String country:myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + " : " + code);
		}
		
	}

}
