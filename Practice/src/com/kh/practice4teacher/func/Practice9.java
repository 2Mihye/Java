package com.kh.practice4teacher.func;

public class Practice9 {

	public static void main(String[] args) {
		/*
		 주민등록번호 성별저리 이후부터 *로 가리고 출력.
		 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 ex) 주민등록번호(-포함) : 123456-1234567
		 	123456-1******
		 */
		
		// 1. 주민번호 만들기
		String jumin = "123456-1234567";
		
		// 2. 성별자리 이후 별표 만드는 거 만들기
		String makeStar = "*";
		// to charArray를 사용해서 String -> char Array로 변경
		char[] juminStar = jumin.toCharArray(); // {'1','2','3','4','5','6','-','1','2','3','4','5','6','7'} // -포함 총 14자리
		for (int i = 8; i < juminStar.length; i++) { //juminStar녀석이 9자리로 시작하면 얘를 *로 바꿔버리기 //
			juminStar[i] = '*'; // juminStar[어떤자리인지] = '*';
		}
		System.out.println(juminStar);
	}

}
