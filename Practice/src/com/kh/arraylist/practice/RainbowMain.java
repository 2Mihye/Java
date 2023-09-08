package com.kh.arraylist.practice;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		/*
		ArrayList 이용해서 빨주노초파남보
	 	수정3회 1,3,5 -> 블랙, 브라운, 그린으로 수정
		더하기 2회 -> 주황(블랙), [옐로우],파랑,[연한파랑]
		향상된 for문 이용 색상 출력//빨 파 보
		 */
		
		ArrayList<String> rainbow = new ArrayList<>();
		
		// 배열 확인
		System.out.println(rainbow);
		
		// 요소 추가
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남색");
		rainbow.add("보라");
		System.out.println("전체 색상 : " + rainbow);
	
		// 요소 수정
		rainbow.set(1, "블랙"); // 주황 -> 블랙
		rainbow.set(3, "브라운"); // 초록 -> 브라운
		rainbow.set(5, "그린"); // 남색 -> 그린
		System.out.println("색상 수정 : " + rainbow);
		
		// 더하기 2회 -> 주황(블랙), [옐로우],파랑,[연한파랑]
		rainbow.add(2, "옐로우");
		rainbow.add(6, "연한파랑");
		
		System.out.println("색상 추가 : " + rainbow);
		
		// ArrayList는 자동으로 배열이 형성이 되기 때문에 한번 삭제하고 나면 뒤에있던 배열이 알아서 당겨짐
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
	
		/* 향상된 for문 이용 색상 출력 // 빨 파 보
			1. 인덱스 이용해서 자리 출력 // System.out.println("최종 출력 : " + 배열명.get(해당 인덱스값))'
				System.out.println(rainbow.get(0) + rainbow.get(1) + rainbow.get(2));
			2. 초기화 후 출력
				ArrayList<String> colors = new ArrayList<>();
				colors.add("빨"); ...
				System.out.println("최후 출력 : " + colors.get(0) + colors.get(1) + colors.get(2))"
		 
		*/
		for(String colorList : rainbow) {
			System.out.println(colorList);
		}
		
	}

}
