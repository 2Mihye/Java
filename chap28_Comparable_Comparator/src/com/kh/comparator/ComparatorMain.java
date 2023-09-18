package com.kh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> {

	@Override
	public int compare(String num1, String num2) {
		if (num1.length() == num2.length()) {
			// 길이가 같으면 0 반환
			return 0;
		} else if ( num1.length() > num2.length()) {
			// num1이 num2보다 길면 양수 반환
			return 1;
		} else {
			// num1dl num2 보다 짧으면 음수
			return -1;
		}
	}
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("cherry");
		str.add("banana");
		str.add("apple");
		str.add("applemango");
		str.add("dragon fruit");
		
		// Comparator를 사용하여 문자열을 정렬 1.길이 / 2.순서
		Collections.sort(str, new ComparatorMain());
		// 한글 소문자 대문자 순서
		// 정렬된 결과 출력 (길이가 짧은 순서대로)
		for (String s : str) {
			System.out.println(s);
		}
	}

}
