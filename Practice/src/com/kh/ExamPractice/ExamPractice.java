package com.kh.ExamPractice;

public class ExamPractice {

	public static void main(String[] args) {
		ExamPractice ep = new ExamPractice();
		
		// ep.problem13(); 정답!
		 ep.problem14(); // 정답!
		// ep.problem15(); 오답!
		// ep.problem16(); 정답!
		// ep.problem23(); 정답!
		// ep.problem24(); 정답!
		// ep.problem25(); 정답!
	}
	
	public void problem13() {
		char ch = 'A';
		String result = (ch == 'A') ? "대문자" : "대문자 아님";
		System.out.println(result);
	}
	
	public void problem14() {
		byte b1 = 12;
		byte b2 = 15;
		int sum = b1 + b2;
		System.out.println(sum);
	}
	
	public void problem15() {
		byte b = 125;
		b += 10;
	System.out.println(b); // -121 byte는 -128부터 127까지이기 때문에 오류
	}
	
	public void problem16() {
		int num = 10;
		System.out.println("result : " + (12 * num++));
	}
	
	public void problem23() {
		int[][] array = {{ 5, 5, 5, 5, 5},
				{ 10, 10, 10},
				{ 20, 20, 20, 20},
				{ 30, 30}};
		System.out.println(array[3].length);
	}
	
	
	public void problem24() {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {	
			
			sum += arr[i];
		}
		
		System.out.println("sum="+sum);
	}
	
	public void problem25() {
		int[] no={100,97,89};
		int[][]count={{3,4,6},{7,4,5}};
		System.out.println(no.length);
		System.out.println(count.length);
		System.out.println(count[1].length);
		System.out.println(no[2]+count[1][2]);
	}
}
