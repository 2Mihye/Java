package com.kh.pattern.mvc.model;

public class StudentModel {
	/*
	 1. ���� ���� ǥ��
	 	private �̸� ����
	 2. getter setter �����
	 */

	private String name; // �л� �̸�
	private int age; // �л� ����
	
	public StudentModel(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
