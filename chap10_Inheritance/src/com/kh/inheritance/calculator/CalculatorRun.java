package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod { // 상속

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2 : ");
		int num2 = sc.nextInt();
		

		CalculatorForMod cal = new CalculatorForMod();
		System.out.println("sum = " + cal.add());
		System.out.println("mul = " + cal.multiply());
		System.out.println("mod = " + cal.mod(cal.num1,cal.num2));
		
		
		/*
		Calculator cal = new Calculator();
		// Scanner 이용해서 코드 변경하기
		Scanner sc = new Scanner (System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		
		System.out.println("Add : " + result1);
		System.out.println("Substruct : " + result2);
		System.out.println("Multiply : " + result3);
		System.out.println("Divide : " + result4);
		
		*/
	}

}
