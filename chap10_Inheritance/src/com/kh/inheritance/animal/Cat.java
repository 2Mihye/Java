package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(getName() + "주인이 와서 달린다!");
	}
	
	// override : 이미 정의 한 것을 한번 더 가져와서 한번 더 다시 정의를 내린다.
	//animal 에 적혀있는 eat을 고양이 안에서만 다시 정의를 내린다.
	public void eat() {
		System.out.println(getName() + "가 먹이통을 뺐어먹습니다.");
	}
}
