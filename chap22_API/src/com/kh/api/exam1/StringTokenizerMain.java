package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ����ϸ� �־��� ������(�⺻: ����)�� �������� ���ڿ��� ��ū���� �и��Ѵ�.
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
		
		// hasMoreTokens : Ư�� ���ؿ����� ��ū�� ���� �ϴ� ��
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
		// - �����ڸ� �̿��Ͽ� text �����  - �����ڷ� ��� ����ϱ�
		String text = "�̹���-������-�ǵ�������";
		StringTokenizer tokenizer = new StringTokenizer(text, "-");
		
		while(tokenizer.hasMoreTokens()) {
			String musician = tokenizer.nextToken();
			System.out.println(musician);
		}
	}
	
	public void STExam4() {
		// - �����ڸ� �̿��Ͽ� text �����  - �����ڷ� ��� ����ϱ�
		String text = "�̹���, ������, �ǵ�������";
		StringTokenizer tokenizer = new StringTokenizer(text, ", ");
		
		while (tokenizer.hasMoreTokens()) {
			String musician = tokenizer.nextToken();
			System.out.println(musician);
		}
	}

	// Ư�� �ܾ� �����ϰ� �����ڷ� �и�
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
	
	
	// ��¥ �����ڷ� �и�
	public void STExam6() {
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken());
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		
		//System.out.println("Year : " + year);
		//System.out.println("Month : " + month);
		//System.out.println("Day : " + day);
		System.out.println(year + "�� " + month + "�� " + day + "��");
	}

	// ���ڿ����� ���� ����
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