package com.kh.arrayListSample;

public class ArrayList04 {

	public static void main(String[] args) {
		// ���ڿ� �迭�� ����ؼ� ���� for loop�� ���ڿ� �迭�� ��� �� ���� �� ���ڿ��� ã�� ����ϱ�
		String[] s = {"apple","banana","cherry","elderBerry"};
		String longs = "";
		for(String str : s) {
			// str.length
			if (str.length() > longs.length()) {
				longs = str;
			}
		}
		System.out.println("���� ū ���ڿ��� : " + longs);
	}
	

}
