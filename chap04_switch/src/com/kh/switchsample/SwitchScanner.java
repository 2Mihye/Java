package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("과일을 선택해주세요.");
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("사과");
				break;
			case 2:
				System.out.println("포도");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
		}
		
		
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.print("1. 아메리카노 ");
		System.out.print("2. 얼그레이 바닐라라떼 ");
		System.out.print("3. 아인슈페너 ");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("얼그레이 바닐라라떼 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아인슈페너 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
		*/
		
		// scanner를 이용하여 과자를 선택하는 switch 만들기
		System.out.println("과자를 선택해주세요.");
		System.out.print("1.포테토칩 / ");
		System.out.print("2.무뚝뚝 / ");
		System.out.println("3.오감자 ");
		
		int choice;
		boolean isChoice = false;
		// choice = sc.nextInt();
		
		while (!isChoice) {
			choice = sc.nextInt();
		
			switch (choice) {
				case 1:
					System.out.println("1.포테토칩 주문하셨습니다.");
					isChoice = true;
					break;
				case 2:
					System.out.println("2.무뚝뚝 주문하셨습니다.");
					isChoice = true;
					break;
				case 3:
					System.out.println("3.오감자 주문하셨습니다.");
					isChoice = true;
					break;
				default:
					System.out.println("잘못된 주문입니다. 다시 입력해주세요.");
			}
		}
		

	}

}
