package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("ÀÌ¹ÌÇý");
		student.setGender('¿©');
		student.setGrade(3);
		student.setClassroom(1);
		student.setHeight(169.5);
		
		student.StudentInfo();
	}

}
