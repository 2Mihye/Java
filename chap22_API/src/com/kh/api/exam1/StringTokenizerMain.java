package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ����ϸ� �־��� ������(�⺻: ����)�� �������� ���ڿ��� ��ū���� �и��Ѵ�.
 */
	public static void main(String[] args) {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		// hasMoreTokens : Ư�� ���ؿ����� ��ū�� ���� �ϴ� ��
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}

}
