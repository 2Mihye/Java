package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
		boolean isChoice = false;
		
		while (!isChoice) { // !를 사용하여 true로 표기
			System.out.println("월을 입력해주세요.");
			
			int month = sc.nextInt();
			
			switch(month) {
				case 1: case 2: case 12: // case 3개 중 하나라도 참이면 출력
					System.out.println("겨울입니다.");
					isChoice = true; // 위 !가 있을 경우 참은 거짓으로 변경되고, 거짓은 참으로 거짓으로 변경되기 때문에
					// true로 작성해줘서 !를 만나 false로 변경해 while문을 종료해준다.
					break; // break는 case문에서 실행하고자 하는게 종료될 때 한 번만 들어간다.
				case 3: case 4: case 5:
					System.out.println("봄입니다.");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("여름입니다.");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("가을입니다.");
					isChoice = true;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		*/
		
		// 나이를 입력받아 성인(19~20) 청소년(14~18) 어린이(10~13)로 분류하고 이외 나이는 다시 입력하시오 출력하기
		// while && switch case를 이용하여 출력하기
		
		boolean isChoice = true;
		while (isChoice) { // while문에서 boolean은 true일때만 실행이 됨.
			System.out.println("나이를 입력해주세요 :");
			int age = sc.nextInt();
			
			switch (age) {
				case 10: case 11: case 12: case 13:
					System.out.println("어린이입니다.");
					isChoice = false; // while문 제어
					break; // switch case 제어
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("청소년입니다.");
					isChoice = false;
					break;
				case 19: case 20:
					System.out.println("성인입니다.");
					isChoice = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

}
