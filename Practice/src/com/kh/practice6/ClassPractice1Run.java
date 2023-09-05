package com.kh.practice6;

public class ClassPractice1Run {

	public static void main(String[] args) {
		/*
		 실행용 메소드로 기본 생성자를 통해 Member type의
		객체를 생성하고 changeName()를 이용해 값 변경 후
		printName()를 이용해 출력
		 */
		// 만약 char 값을 넣고 싶다면 
		// 1. Member 객체를 생성
		ClassPractice1 member = new ClassPractice1();
		// 2. changeName() 값 변경
		member.ChangeName("뉴네임");
		// 3. printName()을 이용해 출력
		member.PrintName();

	}

}
