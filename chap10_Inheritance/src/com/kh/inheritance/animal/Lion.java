package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(getName() + "�� �ߴٸ��� ���� ħ�� �기��.");
	}

}
