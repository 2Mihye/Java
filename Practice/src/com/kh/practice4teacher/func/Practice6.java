package com.kh.practice4teacher.func;

import java.util.Scanner;

public class Practice6 {
	// ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ���
		System.out.println("ù ��° ���ڸ� �Է����ּ���.");
		int start = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է����ּ���.");
		int end = sc.nextInt();
		
		/*
		// �� ������ ���ڸ� ��� ���
		System.out.println(start + "���� " + end + "������ ����");
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		*/
		int reStart = end;
		int reEnd = start;
		if (start < end) { // ���� ù ��° ���ڰ� �� ��° ���ں��� ���� ��
			for (int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
		} else if (end < start) { // ���� �� ��° ���ڰ� ù ��° ���ں��� ���� ��
			for (int i = reStart; i <= reEnd; i++) {
				System.out.print(i + " ");
			}
		}
		
		/*
		 * int reStart,reEnd;
		 * if(start < end) {
		 * 		reStart = start;
		 * 		reEnd = end;
		 * } else if (end < start) {
		 * 		int reStart = end;
		 * 		int reEnd = start;
		 * }
		 * 
		 * int reStart, reEnd;
		 * for (
		 * 
		 for (int i = reStart; i <= 
		 */
		
		/*
		 Math �ڹٿ� ����� Ŭ����
		 min : ���� ���� �� ; �־��� �� ���� ���� �߿��� �� ���� ���� ��ȯ
		 max : ���� ū ��; �־��� �� ���� ���� �߿��� �� ū ���� ��ȯ
		 
		 int a = 5;
		 int b = 8;
		 int minValue = Math.min(a, b); // minValue���� 5�� �����
		 System.out.println("minValue : " + minValue); // 5
		 int maxValue = Math.max(a, b); // maxValue���� 8�� �����
		 System.out.println("maxValue : " + maxValue); // 8
		 
		 
		 //���� Ȱ���Ͽ�
		 System.out.pritnln("ù ��° ���ڸ� �Է��ϼ���.");
		 int firstNumber = sc.nextInt();
		 System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		 int secondNumber = sc.nextInt()
		 
		 int start = Matn.min(firstNumber, secondNumber);
		 // start���� �� �� ��������� �� ���� ���� ����.
		 int end = Math.max(firstNumber, secondNumber);
		 // end���� �� �� ��������� �� ū ���� ����.
		  
		 for (int i = start; i <= end; i++) {
		 System.out.println(i);
		
		 */
	}

}
