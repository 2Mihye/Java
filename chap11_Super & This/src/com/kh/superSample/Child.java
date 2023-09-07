package com.kh.superSample;

 //			 자식이  상속받는다  부모를
public class Child extends Parent {
	public Child() { // Child() { -> 이렇게 쓰면 접근제한자가 default로 변경된 것일 뿐 public과 쓰임은 같다!
		super(); // 부모 클래스의 기본 생성자 호출 // 보통 super을 위에다 쓰는게 원칙임!
		System.out.println("자식 클래스의 기본 생성자입니다.");
	}
	
	public Child(String name) {
		super(name); // 부모 클래스의 문자열 파라미터 생성자 호출
		System.out.println("자식 클래스의 문자열 파라미터 생성자입니다.");
	}
	
	public void display() {
		super.show(); // 부모 클래스의 show 출력 메서드 호출
		System.out.println("자식 클래스의 display 메서드 입니다.");
	}
}
