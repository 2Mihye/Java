package com.kh.practice4.func;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			num += i;
			System.out.println ( );
		}
		// 선생님 생신 축하드려요.. 저는 여기까지가 한계였슴미다..
	}

}
