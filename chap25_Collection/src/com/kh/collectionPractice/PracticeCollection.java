package com.kh.collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
	}
	
	// String �ߺ��� �� �����ؼ� add �غ��� ���for������ ���
	public void practiceList() {
		
		List<String> pList = new ArrayList<>();
		pList.add("�ɷ���");
		pList.add("���̸�ε�");
		pList.add("�ó����");
		pList.add("����Ǫ��");
		pList.add("�ó����"); // �ߺ������� ��µ�
		System.out.println("ArrayList : ");
		for(String characters : pList) {
			System.out.println(characters);
		}
	}
	
	// String �ߺ��� �� �����ؼ� add �غ��� ���for������ ���
	public void practiceSet() {
		Set<String> mySet = new HashSet<>();
		mySet.add("�̹���");
		mySet.add("�ǵ�������");
		mySet.add("������");
		mySet.add("�̹���"); // �ߺ��̶� ������ ���� ���
		System.out.println("Set : ");
		for(String musician : mySet) {
			System.out.println(musician);
		}
	}

}
