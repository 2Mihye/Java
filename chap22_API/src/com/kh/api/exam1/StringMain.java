package com.kh.api.exam1;

public class StringMain {

	public static void main(String[] args) {
		String greeting = "Hello, World";
		
		// ���࿡ ���ڿ��� ���� �� ���� ���� ( .equals �� == �� ����)
		if (greeting.equals("hello, Wordl")) {
			System.out.println("���ڿ��� �����ϴ�.");
		}
		
		// ���ڿ� ����
		String name = "Alice";
		String msg = "Hello, " + name + "!";
		System.out.println(msg);
		
	}

}
