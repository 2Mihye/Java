package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain4 {

	public static void main(String[] args) {
		PracticeMain4 pm = new PracticeMain4();
		// pm.practice1();
		// pm.practice2();
		// pm.practice3();
		pm.practice4();
	}
	
	public void practice1() {
		String name = "KH";
		int age = 25;
		String formatString = String.format("�̸�:%s, ����:%d", name, age);
		System.out.println(formatString);
		System.out.println("�̸�:" + name + ", ����:" + age);
	}
	
	public void practice2() {
		// ��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// String s = smDateFormat.format(currentDate);
		String formatStr = String.format("���� ��¥ : %s", smDateFormat.format(currentDate));
		System.out.println(formatStr);
	}

	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		// String ������ = String.format("����1:    , ����2:      ",    ,     );
		// System.out.println(������);
		String fmString = String.format("����1: %d / ����2: %d",num1,num2);
		System.out.println(fmString);
		
		// ���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		// ��µǴ� ������ �ּ� �ʺ� �ڸ��� 5�ڸ��� �ϰ���� �� %05d
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		// �ּ� 10�ڸ��� ������ ���� %10s
		// ���� ���ڿ���  10�ڸ����� ª�ٸ�  ���ʿ� �������� ä������.
		// ���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä������.
		// ' ���� ����ǥ�� �ѷ��ξ���
		String formatStr = String.format("'%-10s' %10s",text1, text2);
		System.out.println(formatStr);
		
	}
}
