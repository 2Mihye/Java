package com.kh.variable;

public class VariableSample {
	public static void main(String[]  args) {
	String name; 
	name = "쿠팡";
	
	int hour = 15;
	double score = 90.5;
	char grade = 'A';
	System.out.println("안녕하세요. " + name + "입니다. 오늘 " + hour + "시에 배송됩니다.");
	System.out.println("저의 성적은 " + score + "입니다.");
	System.out.println(score + "점은 학점 " + grade + " 입니다.");
	
	// 변수에 이름과 나이와 자신의 성적 (double)로 넣기
	name = "이미혜";
	int age = 20;
	score = 89.5;
	grade = 'B';
	System.out.println("안녕하세요. 저는 "+ age + "살 " + name + "이고, " + score + "점으로 학점은 " + grade + " 입니다.");
	}
}
