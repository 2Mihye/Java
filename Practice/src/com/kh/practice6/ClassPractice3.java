package com.kh.practice6;

public class ClassPractice3 {
	/*
	 1. 멤버변수
	 2. 생성자
	 3. 출력 메소드
	 */
	// 1. 멤버변수
	int grade, classroom;
	String name;
	double height;
	char gender;
	
	// 2. 생성자
	public ClassPractice3() {
		// 초기화 블럭을 이용해 각 필드 초기화 초기화 블럭{} 사용하면 this. 를 사용하지 않아도 됨.3
		{
		name = "이미혜"; // name 이름 초기화
		grade = 1; // grade 1로 초기화
		classroom = 2; // classroom 2 로 초기화
		height = 169.5; // 
		gender = '여';
		}
	}
	
	// 3. 출력 메소드
	public void StudentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("키 : " + height);
		System.out.println("성별: " + gender);
	}

}
