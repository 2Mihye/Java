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
		System.out.println("�̸�: " + name);
		System.out.println("�г�: " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("Ű : " + height);
		System.out.println("����: " + gender);
	}

}
