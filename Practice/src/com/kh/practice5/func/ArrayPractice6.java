package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("0부터 6까지 숫자를 입력하세요.");
		int num = sc.nextInt();
		String[] day = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		if (num < day.length) {
			System.out.println(day[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
