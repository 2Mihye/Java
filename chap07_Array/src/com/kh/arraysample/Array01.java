package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		/* Array �迭 : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		 			������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ� �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 			�迭�� ���α׷����� �����͸� ���� ȿ�������� �����ϰ� �����ϴµ� ���
		 			�������� ������ ���� �ٷ� �� �ֵ��� ������
		 			
		   Ư¡ 
		   1. ������ ũ�� : ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ� ����
		 	 		  	  : ���� �� ũ�⸦ ������ �� ����
		   2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ��������.
		   					ex) intŸ�� �迭�� ��� ��Ұ� �������� �Ѵ�.
		   3. index ��� ���� : �� �迭�� ��Ҵ� �������� index�� ������ 0���� �����ؼ� �迭 ũ�� -1������ ���� ����
		   					 index�� ����Ͽ� Ư�� ��ġ�� �ִ� ��� ���� ����
		   					 ex) �迭ũ�⸦ 5�� ��ٸ� index�� 0 ~ 4
		   4. �迭�� ����(length) : �迭�� ���̸� �� �� �ִ�.
		   
		   
		   �迭�� ����
		   		������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��]; // �迭 ���� �� �ʱ�ȭ
		   		
		   		C������ ������Ÿ�� �迭�̸�[] = ~ �� �����
		 */
		
		// int score1, score2, score3, score4, score5; // score�� ������ 5������ ���߿� 1000�����? -> �迭 ���
		/* int[] score = new int [5]; // ������ // int Ÿ�� 5���� �迭 ����
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		// System.out.println(score); // [I@5e91993f
	 	System.out.println(score[0]);
	 	*/
		/*
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[5]; // index 0 ~ 4���� ����� // int 5�� ����
		for(int i = 0; i < 5; i++) {
			// System.out.println("���� �Է��Ͻÿ�.");
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		*/
		
		String[] stringArray = new String[2]; // String[] stringArray = {" "," "," "};
		// � ���� ������ �� ��� ���
		System.out.println("stringArray : " + stringArray[0]); // StringArry : null // ���� ���� �Է����� �ʾұ� ����
		stringArray[0] = "��";
		System.out.println("stringArray : " + stringArray[0]); // stringArray : ��
		
		// String[] nameArray = {"��泭","�踻��","ȫ�浿"};
		String[] food = {"������","����ġ","���","�߰���","����","����Ƣ��"}; // index 5��
		int foodLength = food.length;
		System.out.println("food �迭�� ���� : " + foodLength); // length�� index���� 0���� ���� �ʰ� 1���� // 6
		// 
		
	}

}
