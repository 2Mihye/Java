package com.kh.practice7.classroom;

public class ClassRoomMain {

	public static void main(String[] args) {
		/*
		 1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ� 2�� 3������ 2���� �迭 2���� �̿��Ͽ� �д��� ����
		 1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
		 ==1�д�== (2�� 3��)
		 ���ǰ� ������
		 ���볲 �����
		 ���̹� �ں���
		 ==2�д�== (2�� 3��)
		 �ۼ��� ������
		 ������ ��õ��
		 ��ǳǥ ȫ����
		 */
		
		// 1. ���ڿ� �迭�� ���� �� �ʱ�ȭ
		String[] students = {"���ǰ�", "������", "���볲", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		// 2. �� �д��� ��� ���� ������ ���� row: �ళ�� cols: ������
		int cols = 2;
		int rows = 3;
		
		//3. �� ���� 2���� ���ڿ� �迭 classRoom1 classRoom2 ���� �� �ʱ�ȭ
		// �� �д��Ǥ� �ڸ� ��ġ�� ��Ÿ����.
		String[][] classRoom1 = new String[rows][cols];
		String[][] classRoom2 = new String[rows][cols];
		
		// 4. �л� �迭�� �ݺ�ó���ϱ� ���� �ݺ���
		// i ������ �л� �ε���
		for (int i = 0; i < students.length; i++) {
			int row = i % rows; //  row ������ �� �ε���
			int col = i / rows; // col ������ �� �ε���
			if (col % 2 == 0) { // ���� ���� ¦�� ������ Ȯ�� // ¦�� ���� ù ��° �дܿ� �ش�
				classRoom1[row][col/2] = students[i]; // col/2 �� �ε����� ������ ���� �� ��ġ
			} else { // ���� ���� Ȧ�� ���� ��� �� ��° �дܿ� �ش�
				classRoom2[row][col/2] = students[i];
			}
		
		}
		// ���
		System.out.println("1�д�");
		printClassRoom(classRoom1);
		printClassRoom(classRoom2);
		// classroom1;
		System.out.println("2�д�");
		// classroom2;
	}
	// classRoom ��� �޼��� �д� �ڸ� ��ġ�� ����ϴ� ����
	public static void printClassRoom(String[][] classRoom) {
		// ���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ�
		for (int row = 0; row < classRoom.length; row++) { // ���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ�
			for (int col = 0; col < classRoom[0].length; col++) { // ���� ��ġ�� �ִ� �л��� �̸� ���
				System.out.println(classRoom[row][col] + " ");
			}
			System.out.println();
		}
				
	}

}