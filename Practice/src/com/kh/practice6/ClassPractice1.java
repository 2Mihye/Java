package com.kh.practice6;

public class ClassPractice1 {
	
	// 1. �������
	String memberId, memberPwd, memberName, phone, email;
	int age;
	char gender;
	
	//2. ������ + Member() // �̸��� �ٲ�� �ϱ� ������ ��¥ �ʿ��Ѱ� Name �ϳ����̱� ������ ��� �����ڸ� �� ���� �ʿ䰡 ����.
	/*
	public Member(char gender) {
	this.gender = gender;
	}
	*/
	public ClassPractice1 () {
	
	}
	
	public void ChangeName(String memberName) {
		this.memberName = memberName;
	}
	
	// printName():void
	public void PrintName() {
		System.out.println("�̸� : " + memberName);
	}
	
}
