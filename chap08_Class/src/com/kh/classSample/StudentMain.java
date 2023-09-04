package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		// public Student(String name, int age, String grade) {
		Student student1 = new Student("이미혜",20,"1학년");
		
		// 학생 정보 출력
		student1.displayInfo();
		
		// 학생을 3명 만들어서 3명 출력하기
		// student2, student3, student4
		// 각각의 이름과 나이와 학년을 displayInfo를 사용해서 출력하세요.
		
		Student student2 = new Student("이미주",20,"2학년");
		student2.displayInfo();
		
		Student student3 = new Student("이하니",20,"1학년");
		student3.displayInfo();
		
		Student student4 = new Student("최여사",50,"5학년");
		student4.displayInfo();
	}

}
