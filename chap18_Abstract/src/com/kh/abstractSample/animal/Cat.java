package com.kh.abstractSample.animal;

public class Cat extends Animal{
	private String barkingSound;
	
	// »ý¼ºÀÚ
	public Cat(String name, String barkingSound) {
		super(name);
		this.barkingSound = barkingSound;
	}
	
	/*
	public static void CatArray(String name, String barkingSound) {
	String[] catArray = new String[2];
	catArray[0] = "name";
	catArray[1] = "bardkingSound";
	}
	*/
	
	@Override
	public String makeSound() {
		return barkingSound;
	}
}
