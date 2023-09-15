package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMapExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer> users = new HashMap<>();
		
		// 유저의 이름과 나이
		users.put("양파쿵야", 3);
		users.put("주먹밥쿵야", 4);
		users.put("두부쿵야", 4);
		users.put("샐러리쿵야", 2);
		
		// 특정 유저 검색
		String userName = "주먹밥쿵야";
		if (users.containsKey(userName)) {
			int age = users.get(userName);
			System.out.println(userName + "가 있습니다.");
		} else {
			System.out.println(userName + "를 찾을 수 없습니다.");
		}
		
		// 모든 유저와 순위 출력
		for (Map.Entry<String,Integer> entry : users.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name +"는 " + age + "살 입니다.");
		}
		
		// 유저 나이 수정
		String updateUser = "두부쿵야";
		int newAge = 5;
		users.put(updateUser, newAge);
		System.out.println(updateUser + "의 나이가 " + newAge + "로 업데이트 되었습니다.");
		
		
		// 유저 탈퇴
		String removeUser = "샐러리쿵야";
		users.remove(removeUser);
		
		System.out.println(removeUser + "가 삭제되었습니다.");
		// 최종 유저 출력
		
		System.out.println("최종 쿵야 목록 : ");
		for (Map.Entry<String, Integer> entry : users.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(age + "살 " + name + "가 있습니다.");
		}
	}

}
