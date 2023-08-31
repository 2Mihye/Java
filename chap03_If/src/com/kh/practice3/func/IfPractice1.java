package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int menu;
		boolean choiceMenu = false;
		
		System.out.println("1.입력 / 2.수정 / 3.조회 / 4.삭제 / 7.종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		 
			menu = sc.nextInt();
			switch (menu) {
				case 1:
					System.out.println(menu + "번 조회 메뉴입니다.");
					break;
				case 2:
					System.out.println(menu + "번 수정 메뉴입니다.");
					break;
				case 3:
					System.out.println(menu + "번 조회 메뉴입니다.");
					break;
				case 4:
					System.out.println(menu + "번 삭제 메뉴입니다.");
					break;
				case 7:
					System.out.println("프로그램이 종료됩니다.");
					break;
				default:
					System.out.println("잘못 누르셨습니다. 다시 눌러주세요.");
			}
		}
	}
