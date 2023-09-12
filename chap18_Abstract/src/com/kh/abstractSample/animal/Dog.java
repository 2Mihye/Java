package com.kh.abstractSample.animal;

public class Dog extends Animal{
	private String barkingSound;
	// 持失切 拙失 -> super
	public Dog(String name, String barkingSound) {
		super(name);
		this.barkingSound = barkingSound;
	}
	
	@Override
	public String makeSound() {
		return barkingSound;
	}
	
	
}
