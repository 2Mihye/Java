package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain pm = new PracticeMain();
		pm.practice1();
		pm.practice2();
	}
	
	public void practice1() {
		// ������
		ArrayList<String> strList = new ArrayList<>();
		strList.add("�ɷ���");
		strList.add("���̸�ε�");
		strList.add("�ó����");
		strList.add("ŰƼ");
		
		printList(strList);
	}
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	public void practice2() {
		// Box ��ü�� com.kh.genericspractice; �ؿ� ����
		// ������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		Box<Integer> intBox = new Box<>();
		intBox.put(9);
		intBox.put(10);
		intBox.put(11);
		int intValue = intBox.get();
		
		// ���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		Box<String> strBox = new Box<>();
		strBox.put("��μ�");
		strBox.put("����");
		strBox.put("������");
		String strValue = strBox.get();
		
		// �� �� ���
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
		
		// ���� for�� ����Ͽ� �� ��� ��� // �ϴ� ����
		
		
	}
	/*
	public static <T> void printBox(Box<T> item) {
		for (T print : item) {
			System.out.println(item);
		}
	}
	*/

}
