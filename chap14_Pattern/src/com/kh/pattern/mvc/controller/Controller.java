package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.Model;
import com.kh.pattern.mvc.view.View;

public class Controller {
	// 모델과 뷰를 연결하는 곳
	// 사용자 입력을 처리하는 곳
	private Model usermodel; // 모델 import 시키기
	private View userview;

	public void setUserName(String name) {
		//this.usermodel = usermodel;
		usermodel.setName(name);
	}
	
	public void setUserAge(int Age) {
		usermodel.setAge(Age);
	}

	public void setView(View userview) {
		this.userview = userview;
	}

	public String getModel() {
		return usermodel.getName();
	}
	
	public View getView() {
		return userview;
	}

	
	public int getUserAge() {
		return usermodel.getAge();
	}
	
	public void updateView() {
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}
	
	public Controller(Model model, View view) {
		this.usermodel = model;
		this.userview = view;
	}
	
	public static void main(String[] args) {
		
	}
}
