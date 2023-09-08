package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.StudentController;
import com.kh.pattern.mvc.model.StudentModel;
import com.kh.pattern.mvc.view.StudentView;

public class StudentClient {
	// MVC ������ ����Ͽ� �л� ������ �ٷ�� ��
	public static void main(String[] args) {
		// �� ��ü ���� Model
		StudentModel model = new StudentModel("�̹���",20); // import ���ֱ�
		// �� ��ü ���� View
		StudentView view = new StudentView(); // import ���ֱ�
		// ��Ʈ�ѷ� ��ü ���� Controller (�� �� ����)
		StudentController controller = new StudentController(model, view);
		// �л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		// �л� ������ ������Ʈ�ϱ�!
		controller.setStudentName("���ϴ�");
		controller.setStudentAge(30);
		// ������Ʈ �� �л� ������ ���
		controller.updateView();
	}

}
