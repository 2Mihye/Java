package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�ٷ���");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("����");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("�տ���");
		myMonkey.sleep();
		myMonkey.eat();
		
		Lion myLion = new Lion("����");
		myLion.eat();
		myLion.sleep();
	}

}
