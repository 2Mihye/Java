package com.kh.collectionMain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// List
		List<String> myList = new ArrayList<>();
		myList.add("�ǹ�");
		myList.add("������");
		myList.add("�鿹��");
		
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
	}

}
