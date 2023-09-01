package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 ���ڿ��� �Է� �޾� ���� �ϳ��ϳ� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ �� ��° index�� ��ġ�ϴ��� index����ϱ�
		1. ���ڿ��� �Է� �޾�
		2. ���� �ϳ��ϳ� �迭�� �ְ�
		3. �˻��� ���ڰ� ���ڿ��� 
		4.
		5. �� ��° �ε����� ��ġ�ϴ���
		6. �ε��� ����ϱ�
		 */
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("���ڿ��� �Է��ϼ���."); // 1. ���ڿ��� �Է� �����ÿ�
		String inputString = sc.next();
		System.out.println("�˻��� ���ڸ� �Է��ϼ���."); // �˻��� ���� �Է���
		char searchChar = sc.next().charAt(0); // ù ��°
		/*
		 2. ���� �ϳ��ϳ� �迭�� �ִ´�.
		 String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
		 char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		 String �ȿ� char�迭�� ������ִ� �༮ -> toCharArray
		 (ex) String �ȳ��ϼ��� -> {'��', '��', '��', '��', '��'}
		
		String[] food = {"ġŲ","������","����"};
		String hi = "�ȳ�";
		System.out.println(hi.toCharArray());
		*/
		
		
		// ���ڿ��� -> ���ڷ� ��ȯ
		// String -> char
		char[] charString = inputString.toCharArray(); // toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		int charCount = charString.length; // ���ڿ��� �� �� �� �ִ��� ���� -> length
		System.out.println("charCount : " + charCount);
		// �� ��° index�� ��ġ�ϴ��� index ����ϱ�
		// �� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		
		int count = 0;
		System.out.println(inputString + "�� " + searchChar + "�� �����ϴ� ��ġ(�ε���) : ");
		// �ݺ����� ����ؼ� ��ġ ã��
		for (int i = 0; i < charCount; i++) {
			// �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if (charString[i] == searchChar) { // charString[i]�� �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������
				// searchChar�� �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �Ӥ������ ��.
				//���� ���� �� ���ڸ� �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� ���
				// ���� �迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
				System.out.println(i);
				count++;
			}
			
			
		}
	}

}
