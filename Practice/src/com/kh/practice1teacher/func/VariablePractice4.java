package com.kh.practice1teacher.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("���ڿ����Է��ϼ���. : ");
		String s = sc.next();
		
		char a = s.charAt(0); // ���ڸ� 1�ھ� �б� ������ apple�� 1�ڸ� �Ѿ�� ����� �� ����. // �ڸ� ��ġ ���ؼ� ����ϱ�
		System.out.println("index 0��° �ڸ� : " + a);
		char p = s.charAt(1); // ���� ���� �̸��� indextNum1 �� indextNum2�� �Ἥ ���������� �����־�� ��.
		System.out.println("index 1��° �ڸ� : " + p);
		
		String p2 = s.substring(2,3); // ���۰� ���� ���ؼ� ��� ������. // ��ü�κ� // �� �ڸ��� �ƴ϶� �ڸ��� �����ؼ� ����� �� ����.
		// ���۸� ���ص� �ǰ�, ���� �����ص� ��. // �ڸ� ��ġ ���ؼ� ����ϱ�
		// ���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�.
		System.out.println("index 2��° �ڸ� : " + p2);
		
		
		
	}

}
