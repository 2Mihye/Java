package com.kh.operator;

public class Logical {

	public static void main(String[] args) {
		// 5. 논리연산자(Logical) : 논리적인 조건을 다룰 때 사용. &&(논리 and), ||(논리 or), !(논리 not)
		/*
		 * &&(논리곱) :  두 항이 모두 참인 경우 참, 아니면 거짓
		 * 			ex) boolean val = (5 > 2) && (5 > 3); // true
		 * ||(논리합) : 두 항 중 하나라도 참인 경우 참, 모두 거짓이면 거짓
		 * 			ex) boolean val = (5 > 2) || (5 < 3); // true
		 * !(부정) : 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿈
		 * 			ex) boolean val = !(5 > 2); // false
		 * 
		 */
		
		boolean isTrue = true;
		boolean isFalse = false;
		// 1. &&(논리곱 AND)
		boolean logicalAnd = isTrue && isFalse;
		System.out.println("&& : " + logicalAnd);
		boolean val1 = 5 > 2 && 5 > 3;
		System.out.println("val1 && : " + val1); // true
		int a = 10;
		int b = 5;
		int c = 3;
		boolean val2 = a > b && a > c;
		System.out.println("val2 && : " + val2); // true
		boolean val3 = a > b && a < c;
		System.out.println("val3 && : " + val3); // false
		
		// 2. ||(논리합 OR)
		boolean val4 = 5 > 2 ||  5 < 3;
		System.out.println("val4 || : " + val4); // true
		int d = 20;
		int e = 10;
		int f = 5;
		boolean val5 = d > e || d < f; // true || false
		System.out.println("val5 || : " + val5); // true
		boolean val6 = d < e || d < f; // false || false
		System.out.println("val6 || : " + val6); // false
		
		// 3. !(부정 NOT)
		boolean val7 = !(5 > 2); // true
		System.out.println("val7 ! : " + val7); // false
		int g = 100;
		int h = 200;
		int i = 100;
		boolean val8 = !(g > h); // false
		System.out.println("val8 ! : " + val8); // true
		boolean val9 = ! (g > i); // false
		System.out.println("val9 ! : " + val9); // true 
		
	}

}
