package com.kh.arrayListSample;

public class ArrayList04 {

	public static void main(String[] args) {
		// 문자열 배열을 사용해서 향상된 for loop로 문자열 배열의 요소 중 가장 긴 문자열을 찾아 출력하기
		String[] s = {"apple","banana","cherry","elderBerry"};
		String longs = "";
		for(String str : s) {
			// str.length
			if (str.length() > longs.length()) {
				longs = str;
			}
		}
		System.out.println("가장 큰 문자열은 : " + longs);
	}
	

}
