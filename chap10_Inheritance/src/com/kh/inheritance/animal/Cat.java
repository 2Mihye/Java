package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "������ �ͼ� �޸���!");
	}
	
	// override : �̹� ���� �� ���� �ѹ� �� �����ͼ� �ѹ� �� �ٽ� ���Ǹ� ������.
	//animal �� �����ִ� eat�� ����� �ȿ����� �ٽ� ���Ǹ� ������.
	public void eat() {
		System.out.println(getName() + "�� �������� ����Խ��ϴ�.");
	}
}
