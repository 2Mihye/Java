package com.kh.pattern.mvc.view;

public class View {
	/*
	 정보를 화면에 출력
	 */
	public void  displayInfo(String userName, int userAge) {
		System.out.println("학생 정보");
		System.out.println("이름 : " + userName);
		System.out.println("나이 : " + userAge);
	}
	public static void main(String[] args) {
		
	}
}
