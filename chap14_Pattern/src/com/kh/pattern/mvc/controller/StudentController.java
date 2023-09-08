package com.kh.pattern.mvc.controller;
	/*
	 �𵨰� �並 �����ϴ� ��
	 ����� �Է��� ó���ϴ� ��
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
		// DB�� ����� �� �߰�
		studentView.displayInfo(studentModel.getName(), studentModel.getAge());
	}
}
