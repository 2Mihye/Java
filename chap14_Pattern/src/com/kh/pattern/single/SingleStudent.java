package com.kh.pattern.single;
 // 한 페이지에서 하나의 객체만을 생성하고 
public class SingleStudent {
	private String name;
	
	
	// 생성자
	private SingleStudent() {
		
	}
	
	
	//출력 메서드
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}
	
	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent();
		
		std1.display();
	}

}
