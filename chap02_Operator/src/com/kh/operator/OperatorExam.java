package com.kh.operator;

public class OperatorExam {

	public static void main(String[] args) {
		/* 1. �������������� : ���� 1�� ������Ų �� �� ���� �ٽ� ������ �Ҵ�
						  i�� ���� 1 ������Ű�� �� ���� �ٽ� i�� �Ҵ�
		*/
		int i = 5;
		i = ++i;
		System.out.println("i = ++i : " + i);
		
		/* 2. ���� ���� ������ : ������ ���� ���� ����� �� ���� 1�� ������Ŵ
		  					i�� ���� ���� i�� �Ҵ��ϰ�, �� �Ŀ� i�� ���� 1 ������Ų��.
		  					������ �Ҵ��� ���簪�̹Ƿ� i�� ������� �ʴ´�.
		
		int j = 5;
		int l;
		l = j++;
		System.out.println("j = j++ : " + l);
		System.out.println(j);
		*/
		
		int a = 5;
		a++;
		System.out.println("a++ : " + a);
		
		int b = 5;
		++b;
		System.out.println("++b : " + b);
		
	}

}
