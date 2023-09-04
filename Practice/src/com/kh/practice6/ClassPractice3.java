package com.kh.practice6;

public class ClassPractice3 {
	int grade, classroom;
	String name;
	double height;
	char gender;
	
	public ClassPractice3(String name, int grade, int classroom, double height, char gender) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.height = height;
		this.gender = gender;
	}
	
	public void StudentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("키 : " + height);
		System.out.println("성별: " + gender);
	}

}
