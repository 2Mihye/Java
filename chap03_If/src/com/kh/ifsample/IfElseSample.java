package com.kh.ifsample;

public class IfElseSample {

	public static void main(String[] args) {
		/* if-else : ���α׷� ���ǿ� ���� �� ���� ���� �ٸ� �ڵ��� �� �ϳ��� �����ϴ� �����
					 ���� if ���� ������ ���̸� if ���� �ִ� ����� ������ �ǰ�, ������ �����̸� else ����� ������ �ȴ�.
		 			 �̸� ���� �� ���� ��Ȳ�� ���� �ٸ� ������ ������ �� �ִ�.
			if (����) {
				// ������ ���� �� ����Ǵ� �ڵ�
			} else {
				// ������ ������ �� ����Ǵ� �ڵ�
		 	}
		 */
		int age = 59;
		if (age >= 60) {
			System.out.println("ȯ����ġ�� �� �ž�."); // 60���� ũ�ų� ������ ����
		} else {
			System.out.println("���� �־���...!"); // 60���� ������ ����
		}
		
		int temp = 30;
		if (temp >= 25) {
			System.out.println("���� ���� ����˴ϴ�.");
		} else {
			System.out.println("������ ������ ����˴ϴ�.");
		}
	}

}
