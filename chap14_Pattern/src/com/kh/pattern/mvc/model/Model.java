package com.kh.pattern.mvc.model;

public class Model {
	/* 1. ���� ���� ǥ��
	 * private �̸� ����
	 * getter setter �����
	 * 
	 */
	private String name;
	private int age;
	
	public Model(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
	}
}
