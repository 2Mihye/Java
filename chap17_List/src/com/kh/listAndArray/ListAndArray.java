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
		// Array ����
			int[] intArray = new int[2]; // ũ�Ⱑ 5�� ���� �迭 ����
			intArray[0] = 1;
			intArray[1] = 2;
			
			// Array ���
			System.out.println("Array ��� : ");
			for (int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[i] + " ");
			}
			
			System.out.println(); // ���๮�� ���ԵǾ��־� enter���� ����
			// List ����
			List<Integer> intList = new ArrayList<>(); // Integer ��ü�� �����ϴ� ArrayList ���� // List�� ArrayList �� �� import
			intList.add(1);
			intList.add(2);
			intList.add(3);
			
			// List ���
			System.out.println("List ��� : ");
			for (int num : intList) {
				System.out.print(num + " ");
			}
	}
		
		
	public static void ListArray2() {
			// String���� ���� �� Array�� List ����غ���
			stArray[0] = "�̹���";
			stArray[1] = "����ȣ";
			stArray[2] = "������";
				
			System.out.println("List ��� : ");
			for (String list : stArray) {
				System.out.println(list + " ");
			}
				
			List<String> strList = new ArrayList<>();
			strList.add("����");
			strList.add("������");
			strList.add("����");
				
			System.out.println("List ��� : ");
			for (String list : strList) {
				System.out.println(list + " ");
			}
	}
		
	

}
