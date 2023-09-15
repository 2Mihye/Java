package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer> users = new HashMap<>();
		
		// ������ �̸��� ����
		users.put("��������", 3);
		users.put("�ָԹ�����", 4);
		users.put("�κ�����", 4);
		users.put("����������", 2);
		
		// Ư�� ���� �˻�
		String userName = "�ָԹ�����";
		if (users.containsKey(userName)) {
			int age = users.get(userName);
			System.out.println(userName + "�� �ֽ��ϴ�.");
		} else {
			System.out.println(userName + "�� ã�� �� �����ϴ�.");
		}
		
		// ��� ������ ���� ���
		for (Map.Entry<String,Integer> entry : users.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name +"�� " + age + "�� �Դϴ�.");
		}
		
		// ���� ���� ����
		String updateUser = "�κ�����";
		int newAge = 5;
		users.put(updateUser, newAge);
		System.out.println(updateUser + "�� ���̰� " + newAge + "�� ������Ʈ �Ǿ����ϴ�.");
		
		
		// ���� Ż��
		String removeUser = "����������";
		users.remove(removeUser);
		
		System.out.println(removeUser + "�� �����Ǿ����ϴ�.");
		// ���� ���� ���
		
		System.out.println("���� ���� ��� : ");
		for (Map.Entry<String, Integer> entry : users.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(age + "�� " + name + "�� �ֽ��ϴ�.");
		}
	}

}
