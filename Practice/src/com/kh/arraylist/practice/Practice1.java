package com.kh.arraylist.practice;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		
		// 요소 추가
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남색");
		rainbow.add("보라");
	
		// 요소 수정
		rainbow.set(1, "블랙");
		rainbow.set(3, "브라운");
		rainbow.set(5, "그린");
		
		// 더하기 2회 -> 주황, [옐로우],파랑,[연한파랑]
		rainbow.add(2, "옐로우");
		rainbow.add(6, "연한파랑");
		
		System.out.println(rainbow);
		
		// 향상된 for문 이용 색상 출력 // 빨 파 보
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
	
		
		for(String colorList : rainbow) {
			System.out.println(colorList);
		}
		
	}

}
