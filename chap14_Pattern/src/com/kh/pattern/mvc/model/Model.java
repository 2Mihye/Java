package com.kh.pattern.mvc.model;

public class Model {
	/* 1. 유저 정보 표현
	 * private 이름 나이
	 * getter setter 만들기
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
