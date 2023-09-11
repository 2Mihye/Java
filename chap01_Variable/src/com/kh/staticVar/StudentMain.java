package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh학생1");
		System.out.println(stKim.serialNum); // 우리학교 학생 인증키 serialNum
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH학생2");
		System.out.print("KH stKim : ");
		System.out.println(stKim.serialNum);
		System.out.print("KH khLee : ");
		System.out.println(khLee.serialNum);
	}
}
