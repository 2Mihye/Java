package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// HashMap ����
		/*
		 Map.Entry :�������̽��� �Բ� ���Ǵ� �������̽�
		 getKey() : �������� ��ü�� Ű�� ��ȯ��
		 getValue(): �������� ��ü�� ���� ��ȯ��
		 */

		Map <String, Integer> kungya = new HashMap<>();
		
		// ���߿� ������ �߰�
		kungya.put("�ָԹ�����", 15);
		kungya.put("�κ�����", 20);
		kungya.put("��������", 16);
		kungya.put("ȣ������", 22);
		
		// containsValue�� containsKey�� �⺻������ boolean�������� �Ǿ��ִ�.
		System.out.println(kungya.containsValue(15)); // boolean �������� ��ȯ
		// System.out.println(kungya.containsKey("ȣ������"); // boolean �������� ��ȯ
		
		String kungyaName = "��������";
		
		if(kungya.containsKey(kungyaName)) {
			int height = kungya.get(kungyaName);
			System.out.println(kungyaName + "�� Ű�� " + height + "cm");
		} else {
			System.out.println(kungyaName + "�� Ű�� ã�� �� �����ϴ�.");
		}
		
		// ��� ���߿� Ű�� ���
		for (Map.Entry<String, Integer> entry : kungya.entrySet()) {
			String name = entry.getKey();
			int kungyaheight = entry.getValue();
			System.out.println(name + "�� " + kungyaheight + "cm");
		}
		
		// ���� Ű ����
		String kungyaUpdate = "��������";
		int newHeight = 17;
		kungya.put(kungyaUpdate, newHeight);
		System.out.println(kungyaUpdate + "�� Ű�� " + newHeight + "cm�� �����߽��ϴ�.");
		/*
		int kungyaHeight = 15;
		
		if(kungya.containsValue(kungyaHeight)) {
			String name = kungya.get(kungya);
		}
		*/

	}

}
