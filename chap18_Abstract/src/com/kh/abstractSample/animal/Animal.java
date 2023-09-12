package com.kh.abstractSample.animal;

public abstract class Animal {
	// �ʵ� String name;
	private String name;
	
	// ������ �ۼ� // �����ڶ� �ѹ� �� ���Ǹ� ���ִ� ��
	public Animal(String name) {
		this.name = name;
	}
	
	// �߻�޼���� ���� �Ҹ� ��� void makeSound();
	public abstract String makeSound();
	
	// �Ϲݸ޼��� ���� �̸� ��� void displayName();
	public void setDisplayName(String name) {
		this.name = name;
	}
	
	public String getDisplayName() {
		return name;
	}
	
}