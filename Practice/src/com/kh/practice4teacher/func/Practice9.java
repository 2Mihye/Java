package com.kh.practice4teacher.func;

public class Practice9 {

	public static void main(String[] args) {
		/*
		 �ֹε�Ϲ�ȣ �������� ���ĺ��� *�� ������ ���.
		 ��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		 ex) �ֹε�Ϲ�ȣ(-����) : 123456-1234567
		 	123456-1******
		 */
		
		// 1. �ֹι�ȣ �����
		String jumin = "123456-1234567";
		
		// 2. �����ڸ� ���� ��ǥ ����� �� �����
		String makeStar = "*";
		// to charArray�� ����ؼ� String -> char Array�� ����
		char[] juminStar = jumin.toCharArray(); // {'1','2','3','4','5','6','-','1','2','3','4','5','6','7'} // -���� �� 14�ڸ�
		for (int i = 8; i < juminStar.length; i++) { //juminStar�༮�� 9�ڸ��� �����ϸ� �긦 *�� �ٲ������ //
			juminStar[i] = '*'; // juminStar[��ڸ�����] = '*';
		}
		System.out.println(juminStar);
	}

}
