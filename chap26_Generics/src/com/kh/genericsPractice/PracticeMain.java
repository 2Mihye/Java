package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain pm = new PracticeMain();
		pm.practice1();
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

}
