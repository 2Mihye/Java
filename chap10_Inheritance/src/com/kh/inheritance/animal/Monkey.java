package com.kh.inheritance.animal;

public class Monkey extends Animal {
	public Monkey(String name) {
		super(name);
	}
	@Override
	public void sleep() {
		System.out.println(getName() + "¿Ã ¡÷¿Œ π´∏≠ ¿ßø°º≠ ¿‹¥Ÿ.");
	}
	@Override
	public void eat() {
		System.out.println(getName() + " ∏‘¿Ã ∏π¿Ã ∏‘¿Ω.");
	}
	
	

}
