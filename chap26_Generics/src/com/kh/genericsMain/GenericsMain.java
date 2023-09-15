package com.kh.genericsMain;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� ArrayList
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		// ���ڿ� �����͸� �����ϴ� ArrayList
		ArrayList<String> strList = new ArrayList<>();
		strList.add("�Ѹ�");
		strList.add("��浿");
		strList.add("����");
		strList.add("��ġ");
		
		// ���ʸ� �޼��带 ����Ͽ� ��� ��� -> printList
		printList(intList);
		printList(strList);
	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}

}
