package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	// ���Ἲ �߰��ϱ� : ���࿡ �̸��� ��ĭ�̸� ��ĭ�Դϴ�. ����ϱ�
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void isValidName() {
		// ���࿡ �̸��� �� �����ִٸ� �ȵ��Դ� Ȥ�� this.name = 0; ���
		if(this.name == "") {
			this.name = "��ĭ�Դϴ�.";
		}
	}
	
	public String info() {
		return name;
	}
}