package com.kh.example.practice1.model.vo;

public class Member {
/*
 1. 멤버변수
 2. 기본생성자
 3. 출력 메소드
 */
	// 1. 멤버변수
	String memberId;
	String memberPwd;
	String memberName;
	String email;
	String phone;
	int age;
	char gender;
	// 생성자 + Member() // 이름을 바꿔야 하기 때문에 진짜 필요한건 Name 하나만이기 때문에 모든 생성자를 다 만들 필요가 없음.
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
		System.out.println("이름 : " + memberName);
	}
}
