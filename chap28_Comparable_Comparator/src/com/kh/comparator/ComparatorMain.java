package com.kh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String> {

	@Override
	public int compare(String num1, String num2) {
		if (num1.length() == num2.length()) {
			// ���̰� ������ 0 ��ȯ
			return 0;
		} else if ( num1.length() > num2.length()) {
			// num1�� num2���� ��� ��� ��ȯ
			return 1;
		} else {
			// num1dl num2 ���� ª���� ����
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
		
		// Comparator�� ����Ͽ� ���ڿ��� ���� 1.���� / 2.����
		Collections.sort(str, new ComparatorMain());
		// �ѱ� �ҹ��� �빮�� ����
		// ���ĵ� ��� ��� (���̰� ª�� �������)
		for (String s : str) {
			System.out.println(s);
		}
	}

}
