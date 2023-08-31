package com.kh.practice2teacher.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 % iNum2); //2 나누기의 나머지를 구하는 문제
		System.out.println((int)dNum); // 2 int를 붙여 정수로 만드는 문제
		
		System.out.println((double)iNum2 * dNum); // 10.0
		System.out.println((double)iNum1); // 10.0
		
		System.out.println((double)iNum1 / iNum2); // 2.5
		System.out.println((float) dNum ); // 2.5
		
		System.out.println((int) fNum); // 3
		System.out.println(iNum1 / (int)fNum); // 3
		System.out.println((float)iNum1 / fNum); // 3.3333333
		System.out.println((double)iNum1 / fNum); // 3.
		
		System.out.println( ch ); // 'A' // char 출력 문제 
		System.out.println((int)ch ); // 65 // int로 변경 후 출력
		System.out.println((int)ch + iNum1 ); // 75 unicode ch를 int로 변경 후 더하기 
		System.out.println((char)((int)ch + iNum1) ); // 'K' //75로 나온 int를 ch로 변경
		
	}

}
