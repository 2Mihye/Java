package com.kh.api.exam1;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hello, World";
		
		// 만약에 문자열이 같을 때 나올 문구 ( .equals 는 == 와 같음)
		if (greeting.equals("hello, Wordl")) {
			System.out.println("문자열이 같습니다.");
		}
		
		// 문자열 연결
		String name = "Alice";
		String msg = "Hello, " + name + "!";
		System.out.println(msg);
		
	}

}
