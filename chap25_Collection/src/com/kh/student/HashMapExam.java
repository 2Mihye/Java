package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap 생성
		Map<String, Integer> studentGrades = new HashMap<>();
		
		// 학생과 점수를 추가하겠습니다.
		studentGrades.put("KH", 95);
		studentGrades.put("양파쿵야", 80);
		studentGrades.put("주먹밥쿵야", 77);
		studentGrades.put("두부쿵야", 92);
		
		// 특정 학생의 성적 검색
		// containsKey : Map에서 Key(키)와 Value(값)이 있는지 확인한다.
		String studentName = "샐러리쿵야";
		// 만약 학생들 중 두부쿵야가 있다면 성적을 보여주기
		if (studentGrades.containsKey(studentName)){
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + "의 성적 : " + grade);
		} else {
			System.out.println(studentName + "의 성적을 찾을 수 없습니다.");
		}
		
		// 모든 학생과 성적 출력
		/*
		System.out.println("전체 학생 성적 : ");
		for (Map.entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		*/
		
		// 학생 제거
		String removeStudent = "두부쿵야";
		studentGrades.remove(removeStudent);
		
		System.out.println(removeStudent + "의 성적을 삭제했습니다.");
		
		// 최종 학생 성적 출력
		System.out.println("최종 학생 성적 : ");
		for	(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}

	}

}
