package com.kh.practice6;

public class ClassPractice3 {
	/*
	 1. �������
	 2. ������
	 3. ��� �޼ҵ�
	 */
	// 1. �������
	int grade, classroom;
	String name;
	double height;
	char gender;
	
	// 2. ������
	public ClassPractice3() {
		// �ʱ�ȭ ���� �̿��� �� �ʵ� �ʱ�ȭ �ʱ�ȭ ��{} ����ϸ� this. �� ������� �ʾƵ� ��.3
		{
		name = "�̹���"; // name �̸� �ʱ�ȭ
		grade = 1; // grade 1�� �ʱ�ȭ
		classroom = 2; // classroom 2 �� �ʱ�ȭ
		height = 169.5; // 
		gender = '��';
		}
	}
	
	// 3. ��� �޼ҵ�
	public void StudentInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("�г�: " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("Ű : " + height);
		System.out.println("����: " + gender);
	}

}
