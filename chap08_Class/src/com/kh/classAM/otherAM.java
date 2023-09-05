package com.kh.classAM;

public class otherAM {
	public static void main(String[] args) {
		// AM 생성
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		// am.privateMethod(); 다른 !클래스!에 존재하기 때문에 출력이 불가능함
	}
}
