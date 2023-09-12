package com.kh.abstractSample.animal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("다롱이","왕왕");
		System.out.println("강아지 이름 : " + dog.getDisplayName());
		System.out.println("강아지 소리 : " + dog.makeSound());
		
		System.out.println("==================================================");
		
		Cat cat = new Cat("고얌미","미야옹");
		System.out.println("고양이 이름 : " + cat.getDisplayName());
		System.out.println("고양이 소리 : " + cat.makeSound());
		
		
		// System.out.println("고양이 소리 : " + catArray[1]);
		
		/* 1. cat 만들기
			Cat cat = new Cat("고양이");
		2. 객체배열로 Animal 정의해서 출력 / 다형성을 활용한 객체 다루기
			Animal[] animal = new Animal[2];
		*/
		Animal[] animal = new Animal[2];
		animal[1] = new Dog("다롱이", "왕왕");
		animal[0] = new Cat("고먐미","미야옹");
		
		//System.out.println(animal[0]);
		//System.out.println(animal[1]);
		for (Animal a : animal) {
			a.getDisplayName();
			a.makeSound();
			System.out.println();
		}
	}
}
