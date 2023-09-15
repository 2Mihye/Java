package com.kh.genericsMain;

public class GenericExam {
	public static void main(String[] args) {
		// ������ �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<Integer> intBook = new Book<>();
		intBook.put(42);
		intBook.put(1);
		int intValue = intBook.get(); // �� ��ȯ�� �ʿ����� ����
		
		// ���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
		Book<String> strBook = new Book<>();
		strBook.put("Hello");
		strBook.put("World");
		strBook.put("Java");
		strBook.put("Python");
		strBook.put("C++");
		String strValue = strBook.get(); // �� ��ȯ �� �ʿ� ����
		
		// ���ʸ� Ŭ������ ����Ͽ� �پ��� ������ ������ ó���� �� �ְ� ����� �� �ִ�.
		System.out.println("Int Value : " + intValue);
		System.out.println("String Value : " + strValue);
	}
}
