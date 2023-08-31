package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1부터 10까지 합 구하기
		int sum = 0; // 최종 합
		int num = 1;
		
		while(num <= 5) { // true
			System.out.println("num = " + num);
			sum += num;
			num = ++num;
			//System.out.println("sum = " + sum); // sum의 합계를 주기적으로 보고싶다면 while문 안에 작성하기
		}
		System.out.println("sum = " + sum);
		/*
		 while문이 종료되었다해서 클래스가 종료된 것은 아님.
		 while문이 중료된 후 남아있는 System.out.println(sum)이 출력됨.
		 */
	}

}
