package com.kh.switchsample;

public class SwitchSample {

	public static void main(String[] args) {
		// Switch문 : 특정 변수나 표현식의 값에 따라 다양한 경우를 처리하는 제어 구조
		//			 Switch문은 일련의 case문과 해당 값을 비교하여 일치하는 경우에 해당 코드블록을 실행하고 각 case문 뒤에는 일치하는 
		//			 값이나 표현식이 나옴.
		/*
		 switch (변수 또는 표현식) {
		 	case 값1 :
		 		// 값1에 해당하는 코드
		 		break; // 해당 블록이 참이라서 실행이 되고나면 빠져나가는 역할
		 	case 값2 :
		 		// 값2에 해당하는 코드
		 		break;
		 	case 값3 :
		 		// 값3에 해당하는 코드
		 		break;
		 	default : 
		 		// 위 모든 케이스와 일치하지 않을 때 실행되는 코드
		 }
		 */
		
		int date = 30;
		switch (date) {
			case 1: // case가 30이면 월요일 출력인데 아니기 때문에 false
				System.out.println("월요일");
				break;
			case 2: // false
				System.out.println("화요일");
				break;
			case 30: // true
				System.out.println("수요일");
				break;
			default:
				System.out.println("주말");
		}
		
		int choice = 4;
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("카페 라떼 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아인슈페너 주문하셨습니다.");
				break;
			case 4:
				System.out.println("바닐라라떼 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
				
		}
		
		
	}

}
