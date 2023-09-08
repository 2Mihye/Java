package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.StudentController;
import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;

public class StudentClient {
	// MVC 패턴을 사용하여 학생 정보를 다루는 곳
	public static void main(String[] args) {
		// 모델 객체 생성 Model
		StudentModel model = new StudentModel("이무진",20); // import 해주기
		// 뷰 객체 생성 View
		StudentView view = new StudentView(); // import 해주기
		// 컨트롤러 객체 생성 Controller (모델 뷰 설정)
		StudentController controller = new StudentController(model, view);
		// 학생 정보를 업데이트해서 출력
		controller.updateView();
		// 학생 정보를 업데이트하기!
		controller.setStudentName("강하늘");
		controller.setStudentAge(30);
		// 업데이트 된 학생 정보를 출력
		controller.updateView();
	}

}
