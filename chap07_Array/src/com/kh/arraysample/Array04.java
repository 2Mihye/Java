package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		/*
		 Array ����
		 String[] internArray = {"��泭","���ϴ�","�̹���","�̹���","¯��"};
		 internArray[3] = "����";
		 System.out.println("�̹��� ��� " + internArray[3]);
		 */
		
		String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		
		fruitArray[0] = "�ٳ���";
		fruitArray[1] = "����";
		fruitArray[2] = "����";
		fruitArray[3] = "��";
		fruitArray[4] = "������";
		
		
		int fruitLength = fruitArray.length;
		for (int i = 0; i < fruitLength; i++) {
			System.out.println("index "+ i + "�� �ڸ� : " + fruitArray[i]);
		}
		
	}	

}
