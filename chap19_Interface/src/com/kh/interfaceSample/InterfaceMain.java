package com.kh.interfaceSample;

public class InterfaceMain {

	public static void main(String[] args) {
	//  MyInterface 변수명 = new MyInterface();
						// 객체가 아니기 때문에 생성할 수 없음
		MyInterface myin = new MyClass();
		myin.doMyInterface();
	}

}
