package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		// int choice = sc.nextInt(); // while 안으로 이동예정
		
		while (isTrue) { // isTrue가 true이기 때문에 true대신에 isTrue 사용
			System.out.println("커피를 주문해주세요. 1.아메리카노 2.카푸치노 3.말차밀크티");
			int choice = sc.nextInt(); // 위에서 이동시킴
			
			switch(choice) {
				case 1:
					System.out.println("아메리카노 주문하셨습니다.");
					isTrue = false; // 아메리카노 주문을 받았으니 while문을 종료하기 위해 false를 집어넣는다.
					break;
				case 2: 
					System.out.println("카푸치노 주문하셨습니다.");
					isTrue = false;
					break;
				case 3:
					System.out.println("말차밀크티 주문하셨습니다.");
					isTrue = false;
					break;
				default:
					System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
					System.out.println();
			}
		}
	}

}
