package com.kh.operator;

public class Assignment {

	public static void main(String[] args) {
		// 2. 대입연산자(Assignment) :  변수에 값을 할당할 때 사용하고 오른쪽 피연산자의 값을 왼쪽 피연산자에 할당한다.
		// 피연산자란? 처리될 데이터 그 자체 또는 데이터를 지정하는 컴퓨터 명령어의 일부(=변수)
		// int a = 1;
		
		// 복합 대입 연산자 : 변수의 현재 값과 다른 값을 계산하여 그 결과를 다시 변수에 저장하는 연산자이며,
		//				 코드를 좀 더 간결하게 작성하고 읽기 쉽게 만들 수 있다.
		/*
		 += 덧셈 후 대입
		 -= 뺼셈 후 대입
		 *= 곱셈 후 대입
		 /= 나눗셈 후 대입
		 %= 나머지 후 대입
		 &= 비트 AND 후 대입 (자주 사용하지 않음)
		 |= 비트 OR 후 대입 (자주 사용하지 않음)
		 ^= 비트 XOR 후 대입 (자주 사용하지 않음)
		 <<== 왼쪽 시프트 후 대입 (자주 사용하지 않음)
		 >>== 오른쪽 시프트 후 대입 (자주 사용하지 않음)
		 */
		
		int a = 10;
		a += 5; // a = a + 5;
		System.out.println("a : " + a);
		
		int b = 20;
		b -= 3; // b = b - 3;
		System.out.println("b : " + b);
		
		int c = 8;
		c *= 2; // c = c * 2;
		System.out.println("c : " + c);
		
		int d = 50;
		d /= 10; // d = d / 10;
		System.out.println("d : " + d);
		
		int e = 25;
		e %= 7; // e = e % 7;
		System.out.println("e : " + e);
	}

}
