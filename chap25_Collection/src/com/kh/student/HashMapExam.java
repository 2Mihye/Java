package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ����
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// �л��� ������ �߰��ϰڽ��ϴ�.
		studentGrades.put("KH", 95);
		studentGrades.put("��������", 80);
		studentGrades.put("�ָԹ�����", 77);
		studentGrades.put("�κ�����", 92);
		
		// Ư�� �л��� ���� �˻�
		// containsKey : Map���� Key(Ű)�� Value(��)�� �ִ��� Ȯ���Ѵ�.
		String studentName = "����������";
		// ���� �л��� �� �κ����߰� �ִٸ� ������ �����ֱ�
		if (studentGrades.containsKey(studentName)){
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "�� ���� : " + grade);
		} else {
			System.out.println(studentName + "�� ������ ã�� �� �����ϴ�.");
		}
		
		// ��� �л��� ���� ���
		/*
		System.out.println("��ü �л� ���� : ");
		for (Map.entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		*/
		
		// �л� ����
		String removeStudent = "�κ�����";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "�� ������ �����߽��ϴ�.");
		
		// ���� �л� ���� ���
		System.out.println("���� �л� ���� : ");
		for	(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}

	}

}
