package com.kh.pattern.mvc.controller;
	/*
	 모델과 뷰를 연결하는 곳
	 사용자 입력을 처리하는 곳
	 */
import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;

public class StudentController {
	private StudentModel studentModel;
	private StudentView studentView;
	
	public StudentController (StudentModel studentModel, StudentView studentView) {
		this.studentModel = studentModel;
		this.studentView = studentView;
	}
	
	public void setStudentName(String name) {
		studentModel.setName(name);
	}
	
	public void setStudentAge(int Age) {
		studentModel.setAge(Age);
	}
	public String getStudentName() {
		return studentModel.getName();
	}
	public int getStudentAge() {
		return studentModel.getAge();
	}
	
	public void updateView() {
		// DB에 변경될 값 추가
		studentView.displayInfo(studentModel.getName(), studentModel.getAge());
	}
}
