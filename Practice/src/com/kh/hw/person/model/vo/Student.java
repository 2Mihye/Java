package com.kh.hw.person.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student(){
	}
	/*
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age,height,weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	*/
	
	// Setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// Getter
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}

}
