package com.kh.practice6;

public class ClassPractice1 {
	
	// 1. 멤버변수
	String memberId, memberPwd, memberName, phone, email;
	int age;
	char gender;
	
	//2. 생성자 + Member() // 이름을 바꿔야 하기 때문에 진짜 필요한건 Name 하나만이기 때문에 모든 생성자를 다 만들 필요가 없음.
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
		System.out.println("이름 : " + memberName);
	}
	
}
