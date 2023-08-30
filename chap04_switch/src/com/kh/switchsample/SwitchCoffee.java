package com.kh.switchsample;

import java.util.Scanner;

public class SwitchCoffee {

	public static void main(String[] args) {
		// while문을 활용한 switch
		Scanner sc = new Scanner (System.in);
		
		int choice;
		boolean isChoice = false;
		while (!isChoice) { // 조건이 참인 동안 코드블록을 반복적으로 실행한다.
			System.out.println("커피 주문해주세요. 1.아메리카노 2.카페라떼 3.바닐라라떼");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("아메리카노 주문");
					isChoice = true;
					break;
				case 2:
					System.out.println("카페라떼 주문");
					isChoice = true;
					break;
				case 3:
					System.out.println("바닐라라떼 주문");
					isChoice = true;
					break;
				default:
					System.out.println("잘못된 주문입니다. 다시 주문해주세요.");
			}
		}
	}

}
