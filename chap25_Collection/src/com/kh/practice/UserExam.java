package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
		// HashMap 생성
		/*
		 Map.Entry :인터페이스와 함께 사용되는 인터페이스
		 getKey() : 가져오는 객체의 키를 반환함
		 getValue(): 가져오는 객체의 값을 반환함
		 */

		Map <String, Integer> kungya = new HashMap<>();
		
		// 쿵야와 점수를 추가
		kungya.put("주먹밥쿵야", 15);
		kungya.put("두부쿵야", 20);
		kungya.put("양파쿵야", 16);
		kungya.put("호박쿵야", 22);
		
		// containsValue와 containsKey는 기본적으로 boolean형식으로 되어있다.
		System.out.println(kungya.containsValue(15)); // boolean 형식으로 반환
		// System.out.println(kungya.containsKey("호박쿵야"); // boolean 형식으로 반환
		
		String kungyaName = "양파쿵야";
		
		if(kungya.containsKey(kungyaName)) {
			int height = kungya.get(kungyaName);
			System.out.println(kungyaName + "의 키는 " + height + "cm");
		} else {
			System.out.println(kungyaName + "의 키를 찾을 수 없습니다.");
		}
		
		// 모든 쿵야와 키를 출력
		for (Map.Entry<String, Integer> entry : kungya.entrySet()) {
			String name = entry.getKey();
			int kungyaheight = entry.getValue();
			System.out.println(name + "는 " + kungyaheight + "cm");
		}
		
		// 쿵야 키 수정
		String kungyaUpdate = "양파쿵야";
		int newHeight = 17;
		kungya.put(kungyaUpdate, newHeight);
		System.out.println(kungyaUpdate + "의 키가 " + newHeight + "cm로 성장했습니다.");
		/*
		int kungyaHeight = 15;
		
		if(kungya.containsValue(kungyaHeight)) {
			String name = kungya.get(kungya);
		}
		*/

	}

}
