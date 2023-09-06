package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	public void eat() {
		System.out.println(getName() + "이 닭다리를 보고 침을 흘린다.");
	}

}
