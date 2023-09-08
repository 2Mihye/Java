package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getPersonName() {
		Scanner sc = new Scanner (System.in);
		System.out.println("이름을 입력하세요.");
		return sc.next();
	}
	
	public void displayInfo(String name) {
		System.out.println("이름 : " + name);
	}
}
