package com.kh.classAM;

public class AM {
	public 	  int pNum = 10;
	protected int pNum2 = 20;
	// default   int pNum3 = 30; // 접근제한자를 명시하지 않으면 자동을 default로 적용됨.
	int pNum3 = 30;
	private   int pNum4 = 40;
	
	//호울 메소드 작성해서 각각 호출하기
	public void publicMethod() {
		System.out.println("어떤 클래스에서든 접근이 가능 / publicMethod() 호출됨");
	}
	
	protected void protectedMethod() {
		System.out.println("같은 패키지 내에서 접근이 가능 / protectedMethod() 호출됨");
	}
	
	// default void defaultMethod() { // 똑같이 기본으로 내장되어 있기 때문에 default 접근제한자를 작성하지 않아도 된다.
	void defaultMethod() {
		System.out.println("같은 패키지 내에서만 접근이 가능 / defaultMethod() 호출됨");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod() 호출됨");
	}
}
