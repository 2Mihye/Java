package com.kh.practice6;

public class ClassPractice1Run {

	public static void main(String[] args) {
		/*
		 ����� �޼ҵ�� �⺻ �����ڸ� ���� Member type��
		��ü�� �����ϰ� changeName()�� �̿��� �� ���� ��
		printName()�� �̿��� ���
		 */
		// ���� char ���� �ְ� �ʹٸ� 
		// 1. Member ��ü�� ����
		ClassPractice1 member = new ClassPractice1();
		// 2. changeName() �� ����
		member.ChangeName("������");
		// 3. printName()�� �̿��� ���
		member.PrintName();

	}

}
