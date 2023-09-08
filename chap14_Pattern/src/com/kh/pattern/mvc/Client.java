package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.Controller;
import com.kh.pattern.mvc.model.Model;
import com.kh.pattern.mvc.view.View;

public class Client {
	// MVC ������ ����ؼ� �л� ������ �ٷ�� ��
	public static void main(String[] args) {
		// Model ��ü ����
		Model user = new Model("�Ѹ�",20); // import ���ֱ�
		
		// View ��ü ����
		View view = new View(); // import ���ֱ�
		
		// Controller ��ü ���� ��                 ��    �� ����
		Controller controller = new Controller(user, view);
		
		// �л� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		
		// �л� ���� ������Ʈ
		controller.setUserName("�̼���");
		controller.setUserAge(30);
		
		// ������Ʈ�� �л� ���� ���
		controller.updateView();
	}
}
