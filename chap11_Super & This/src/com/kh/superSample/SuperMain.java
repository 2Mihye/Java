package com.kh.superSample;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("�Ѹ�");
		child2.display(); // super.display(); ���� �� ��� �Ǵ���, ����ϰ� �ʹٸ� ��� �ؾ� �ϴ���!
	}

}
