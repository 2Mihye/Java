package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple","Cherry"},
				{"Grape","Orange","Strawberry"},
				{"Kiwi"}
		};
		System.out.println("fruits.length : " + fruits.length);
		System.out.println("fruits[i].length : " + fruits[0].length);
		System.out.println("fruits[1].length : " + fruits[1].length);
		System.out.println("fruits[2].length : " + fruits[2].length);
		
		for (int i = 0; i < fruits.length; i++) { // ù ��° for���� ��
			System.out.println("ù ��° for�� : " + i);
			for (int j = 0; j < fruits[i].length; j++) { // �� ��° for���� ��
				System.out.print(fruits[i][j] + " ");
				System.out.println("�� ��° for�� : " + j);
			}
			System.out.println(); // ���� ������ �̵��� �� �ֵ��� enter�� ��� �޼��� �Է�
		}
	}

}
