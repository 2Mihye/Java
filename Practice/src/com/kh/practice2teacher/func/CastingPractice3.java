package com.kh.practice2teacher.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 % iNum2); //2 �������� �������� ���ϴ� ����
		System.out.println((int)dNum); // 2 int�� �ٿ� ������ ����� ����
		
		System.out.println((double)iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println((float) dNum ); // 2.5
		
		System.out.println((int) fNum); // 3
		System.out.println(iNum1 / (int)fNum); // 3
		System.out.println((float)iNum1 / fNum); // 3.3333333
		System.out.println((double)iNum1 / fNum); // 3.
		
		System.out.println( ch ); // 'A' // char ��� ���� 
		System.out.println((int)ch ); // 65 // int�� ���� �� ���
		System.out.println((int)ch + iNum1 ); // 75 unicode ch�� int�� ���� �� ���ϱ� 
		System.out.println((char)((int)ch + iNum1) ); // 'K' //75�� ���� int�� ch�� ����
		
	}

}