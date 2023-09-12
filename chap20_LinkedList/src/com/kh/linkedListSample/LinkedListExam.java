package com.kh.linkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List 인터페이스 LinkedList 객체 활용해서 값 넣고 출력
		// 값은 String 넣고 수정 삭제 출력
		// 생성
		List<String> linkedList = new LinkedList<>();
		// 요소 추가
		linkedList.add("떡볶이");
		linkedList.add("오므라이스");
		linkedList.add("가라아게");
		// 요소 수정
		linkedList.set(2,"치킨텐더");
		// 요소 삭제
		linkedList.remove(2);
		// 출력
		System.out.println(linkedList);
		
		// LinkedList 객체 new LinkedList 객체
		// 값은 int 넣고 수정 삭제 출력
	}

}
