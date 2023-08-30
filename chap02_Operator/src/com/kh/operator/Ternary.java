package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. 삼항연산자 : 조건을 평가하고 세 가지 값 중 하나를 반환한다.
		// 				삼항 = 일항? 이항 : 삼항
		/*
		 * (조건) ? 값1//참 : 값2//거짓 형태로 사용됨.
		 * 값1은 조건이 참일 때 출력
		 * 값2는 조건이 거짓일 때 출력
		 * 
		 * ex) 나이 20이상은 성인인가 미성년자인가
		 * int age = 20;
		 * 						조건	   ?조건1(참): 조건2(거짓)
		 * String status = (age >= 20) ? "성인" : "미성년자";
		 * System.out.println(status);
		 */
		
		 int age = 20;
		 String status = (age >= 20) ? "성인" : "미성년자";
		 System.out.println(status);
		 
		 int score = 85;
		 String result = (score >= 60) ? "합격" : "불합격";
		 System.out.println("시험 결과 : " + result);
		 
		 int number = -5;
		 String sign = (number > 0) ? "true" : "false";
		 System.out.println("sign값 : " + sign);
		 
		 int temperature = 25;
		 String weather = (temperature > 21) ? "적당한 날씨" : "추운 날씨";
		 System.out.println("날씨 상태 : " + weather);
		 
		 // 숫자 7의 값을 짝수인지 홀수 인지 출력
		 int numb = 7;
		 String odd = (numb%2 > 0) ? "홀수" : "짝수";	//== (numb%2 == 0) ? "짝수" : "홀수";
		 System.out.println("숫자 7의 값 : " + odd);
		 
		 int numb2 = -5;
		 // 조건은 옆으로 계속 넘어감.
		 String sign2 = (numb2 > 0) ? "양수" : (numb2 < 0) ? "음수" : "0";
		 System.out.println("숫자의 부호 : " + sign2);
	}

}
