package com.kh.arrayListSample;

import java.util.ArrayList;

//toDoSample.java
//ArrayList 이용해서 할 일 만들고 수정하고 지우고 전부 다 삭제하기
//할 일은 총 3개 / 수정 2/ 하나 지우고 / 전부 삭제

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDo = new ArrayList<>();
		// 할 일 3개
		toDo.add("복습하기");
		toDo.add("일기쓰기");
		toDo.add("운동하기");
		
		// 할 일 개수 확인
		int size = toDo.size();
		System.out.println("할 일 목록의 크기 : " + size);
		
		// 할 일 확인
		System.out.println("할 일 목록 : " + toDo);
		
		// 할 일 2개 수정
		toDo.set(2, "장보기");
		toDo.set(1, "블로그 정리");
		System.out.println("할 일 수정 : " + toDo);
		
		// 할 일 1개 제거
		toDo.remove(2);
		System.out.println("장보기 제거 : " + toDo);
		
		// List 순회해서 요소 출력
		for(String toDoList : toDo) {
			System.out.println("수정된 할 일 목록 : " + toDoList);
		}
		
		// 전부 삭제
		toDo.clear();
		System.out.println("할 일 완료 : " + toDo);
		
	}

}
