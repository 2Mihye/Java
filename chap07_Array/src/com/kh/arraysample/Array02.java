package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/* Problem1
		 1. �迭�� ���̸� ����
		 2. 1~10������ �ݺ����� �̿�
		
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			// 3. ������� �迭 �ε����� ���� ��
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		// 4. �� ���� ���
		for (int i = 1; i<num.length; i++) {
			System.out.println("num[ " + i + " ] = " + num[i]);
		}
		
		// ���̰� 10�� �迭�� �����ϰ� 1~10������ ���� �ݺ����� �̿��ؼ� �������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		// ��°� : 10 9 8 7 6 5 4 3 2 1
		*/
		
		
		// Problem2
		// 1. 1���� 10�� �迭�� ����
		int[] rever = new int[10];
		// 2. 1���� 10���� ���� �������� �迭�� �Ҵ�
		int value = 10; // 10 ��ſ� rever.length��� �ᵵ ���� 
		for (int i = 0; i < rever.length; i++) {
			rever[i] = value--;
			System.out.println("rever[ " + i + " ] = " + rever[i]);
		}
		
		// Problem3
		// ���̰� 5�� String �迭 ����
		// "���" "��" "����" "������" "����"�� �ʱ�ȭ �� �� �迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		String[] fruit = {"���","��","����","������","����"};

		System.out.println("fruitIndex 1 = " + fruit[1]);
		
	}

}
