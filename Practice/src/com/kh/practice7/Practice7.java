package com.kh.practice7;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// ����ڿ��� ���� ũ�⸦ �Է¹ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾� ������ ���� �迭�� ���� �� �Ҵ�
		// �� �ε����� 'a'���� �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		
		// ����ڿ��� ���� ũ�⸦ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
		int numRows = sc.nextInt();
		sc.nextLine(); // ���๮�� ����
		
		int[][] charArray = new int[numRows][]; // ���� �����Ӱ� �� �� �����Ƿ� �ุ �Է�
		// �� ����ŭ�� �ݺ��� ����
		for (int i = 0; i < numRows; i++) {
			// ���� ũ�⵵ �޾�
			System.out.print("���� ũ�� �ޱ� : ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int startValue = i * numCols + 1;
			for (int j = 0; j < numCols; j++) {
				charArray[i][j] = startValue++;
			}
			
			
			// �迭 ���
			}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < charArray[i].length; j++) {
				System.out.print('a' + charArray[i][j]-1);
			}
			System.out.println();
		}
	}

}
