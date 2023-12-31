package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는 데 사용하며 주어진 구분자(기본: 공백)를 기준으로 문자열을 토큰으로 분리한다.
 */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		// stm.STExam1();
		// stm.STExam2();
		// stm.STExam3();
		// stm.STExam4();
		// stm.STExam5();
		// stm.STExam6();
		stm.stringToMath();
	}
	public void STExam1() {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// hasMoreTokens : 특정 기준에따라 토큰을 분할 하는 것
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	
	public void STExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam3() {
		// - 구분자를 이용하여 text 만들고  - 구분자로 끊어서 출력하기
		String text = "이무진-아이유-악동뮤지션";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String musician = tokenizer.nextToken();
			System.out.println(musician);
		}
	}
	
	public void STExam4() {
		// - 구분자를 이용하여 text 만들고  - 구분자로 끊어서 출력하기
		String text = "이무진, 아이유, 악동뮤지션";
		StringTokenizer tokenizer = new StringTokenizer(text, ", ");
		
		while (tokenizer.hasMoreTokens()) {
			String musician = tokenizer.nextToken();
			System.out.println(musician);
		}
	}

	// 특정 단어 제외하고 구분자로 분리
	public void STExam5() {
		String text = "This is a test.";
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) {
				System.out.println(word);
			}
		}
	}
	
	
	// 날짜 구분자로 분리
	public void STExam6() {
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		
		//System.out.println("Year : " + year);
		//System.out.println("Month : " + month);
		//System.out.println("Day : " + day);
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}

	// 문자열에서 숫자 추출
	public void stringToMath() {
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if (token.matches("\\d+(\\.\\d+)?")){
				System.out.println("Number : " + token);
			}
		
		}
	}
}