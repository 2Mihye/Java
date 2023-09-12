package com.kh.abstractSample.animal;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("�ٷ���","�տ�");
		System.out.println("������ �̸� : " + dog.getDisplayName());
		System.out.println("������ �Ҹ� : " + dog.makeSound());
		
		System.out.println("==================================================");
		
		Cat cat = new Cat("����","�̾߿�");
		System.out.println("����� �̸� : " + cat.getDisplayName());
		System.out.println("����� �Ҹ� : " + cat.makeSound());
		
		
		// System.out.println("����� �Ҹ� : " + catArray[1]);
		
		/* 1. cat �����
			Cat cat = new Cat("�����");
		2. ��ü�迭�� Animal �����ؼ� ��� / �������� Ȱ���� ��ü �ٷ��
			Animal[] animal = new Animal[2];
		*/
		Animal[] animal = new Animal[2];
		animal[1] = new Dog("�ٷ���", "�տ�");
		animal[0] = new Cat("��ι�","�̾߿�");
		
		//System.out.println(animal[0]);
		//System.out.println(animal[1]);
		for (Animal a : animal) {
			a.getDisplayName();
			a.makeSound();
			System.out.println();
		}
	}
}
