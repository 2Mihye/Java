package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.Controller;
import com.kh.pattern.mvc.model.Model;
import com.kh.pattern.mvc.view.View;

public class Client {
	// MVC 패턴을 사용해서 학생 정보를 다루는 곳
	public static void main(String[] args) {
		// Model 객체 생성
		Model user = new Model("둘리",20); // import 해주기
		
		// View 객체 생성
		View view = new View(); // import 해주기
		
		// Controller 객체 생성 및                 모델    뷰 설정
		Controller controller = new Controller(user, view);
		
		// 학생 정보를 업데이트해서 출력
		controller.updateView();
		
		// 학생 정보 업데이트
		controller.setUserName("이순신");
		controller.setUserAge(30);
		
		// 업데이트된 학생 정보 출력
		controller.updateView();
	}
}
