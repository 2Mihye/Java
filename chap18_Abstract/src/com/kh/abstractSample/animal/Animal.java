package com.kh.abstractSample.animal;

public abstract class Animal {
	// 필드 String name;
	private String name;
	
	// 생성자 작성 // 생성자란 한번 더 정의를 해주는 것
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상메서드로 동물 소리 출력 void makeSound();
	public abstract String makeSound();
	
	// 일반메서드 동물 이름 출력 void displayName();
	public void setDisplayName(String name) {
		this.name = name;
	}
	
	public String getDisplayName() {
		return name;
	}
	
}