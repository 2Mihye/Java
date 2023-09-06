package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("다롱이");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("나비");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("손오공");
		myMonkey.sleep();
		myMonkey.eat();
		
		Lion myLion = new Lion("레온");
		myLion.eat();
		myLion.sleep();
	}

}
