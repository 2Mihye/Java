package com.kh.example.practice1.model.vo;

public class Member {
/*
 1. �������
 2. �⺻������
 3. ��� �޼ҵ�
 */
	// 1. �������
	String memberId;
	String memberPwd;
	String memberName;
	String email;
	String phone;
	int age;
	char gender;
	// ������ + Member() // �̸��� �ٲ�� �ϱ� ������ ��¥ �ʿ��Ѱ� Name �ϳ����̱� ������ ��� �����ڸ� �� ���� �ʿ䰡 ����.
	/*
	public Member(char gender) {
		this.gender = gender;
	}
	*/
	public Member() {
		
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	// printName():void
	public void printName() {
		System.out.println("�̸� : " + memberName);
	}
}
