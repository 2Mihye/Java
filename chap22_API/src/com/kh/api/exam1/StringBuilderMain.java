package com.kh.api.exam1;

public class StringBuilderMain {
/*
 StringBuilder : ���ڿ��� ȿ�������� ������ �� �ְ� ���ִ� Ŭ����
 				 ���ڿ��� ������ ������ ���ο� ���ڿ� ��ü�� �����ϴ� ���� �ƴ϶� ���� ���ڿ��� �����ϴ� ������� ������
 				 �׷��Ƿ� �޸� ����� ȿ�����̰� ��.
 */
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		
		// append �޼��带 ����Ͽ� ���ڿ� �߰�
		strBuilder.append("Hello, ");
		strBuilder.append("World");
		
		String result = strBuilder.toString();
		System.out.println("Builder append : " + result);
		
		// insert �޼��带 ����Ͽ� ���ڿ� ����
		strBuilder.insert(7, "Java"); // 7��° �ε������� Java�� ����
		System.out.println("Builder insert : " + strBuilder.toString());
		
		// delete �޼��带 ����Ͽ� ���ڿ� ����
		strBuilder.delete(7, 12);
		System.out.println("Builder delete : " + strBuilder.toString());
		
		// replace �޼��带 ����Ͽ� ���ڿ� ��ü
		strBuilder.replace(7, 12, "Java �ְ��!!");
		System.out.println("Builder replace : " + strBuilder.toString());
		
		// reverse �޼��带 ����Ͽ� ���ڿ� �������� �����
		strBuilder.reverse();
		System.out.println("Builder reverser : " + strBuilder.toString());
	}

}
