package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		/*
		 ����� �޼ҵ�� �⺻ �����ڸ� ���� Member type��
		��ü�� �����ϰ� changeName()�� �̿��� �� ���� ��
		printName()�� �̿��� ���
		 */
		// ���� char ���� �ְ� �ʹٸ� 
		// 1. Member ��ü�� ����
		Member member = new Member();
		// 2. changeName() �� ����
		member.changeName("������");
		// 3. printName()�� �̿��� ���
		member.printName();

	}

}
