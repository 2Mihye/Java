package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("kh�л�1");
		System.out.println(stKim.serialNum); // �츮�б� �л� ����Ű serialNum
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH�л�2");
		System.out.print("KH stKim : ");
		System.out.println(stKim.serialNum);
		System.out.print("KH khLee : ");
		System.out.println(khLee.serialNum);
	}
}
