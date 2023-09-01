package com.kh.ifsample;
 
public class IfElseIfSample {

	public static void main(String[] args) {
		// if-else if-else : ���� ���� ������ ���������� ���ϰ� �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ����� �����ϴ� ����
		//					 ���� if�� else if�� ���ǵ� ���� �ƴ϶�� ������ else ����� �����.
		/*
		 if (����1) {
		 	// ����1�� ���� �� ����Ǵ� �ڵ�
		 } else if (����2) {
		 	// ����2�� ���� �� ����Ǵ� �ڵ�
		 } else {
		 	// ���� ��� ������ ������ �� ����Ǵ� �ڵ�
		 }
		 
		 */
		int age = 23;
		if (age == 20) {
			System.out.println("�ؿܿ��� ���ž�!");
		} else if (age >= 20) {
			System.out.println("���迩�� ���ž�!");
		} else { 
			System.out.println("���� ���� �ž�!");
		}
		
		int score = 85;
		if (score > 90) {
			System.out.println("������ " + score + "�� �̹Ƿ� A�Դϴ�.");
		} else if (score == 90) {
			System.out.println("������ " + score + "�� �̹Ƿ� B+�Դϴ�.");
		} else {
			System.out.println("������ " + score + "�� �̹Ƿ� B�Դϴ�.");
		}
		
		int hour = 15;
		if (hour < 12) {
			System.out.println("���� ��ħ�Դϴ�!");
		} else if (hour < 18) {
			System.out.println("������ �ڵ��սô�!");
		} else {
			System.out.println("�����ϼ̽��ϴ�.");
		}
		
		int temp = 28;
		if (temp > 30) {
			System.out.println("���� �����Դϴ�.");
		} else if (temp > 20) {
			System.out.println("������ �����Դϴ�.");
		} else {
			System.out.println("�ҽ��� �����Դϴ�.");
		}
		
		int numb = -5;
		if (numb > 0) { // 0���� Ŭ �� ��(true)
			System.out.println("����Դϴ�.");
		} else if (numb < 0) { // 0���� ���� �� ��(true)
			System.out.println("�����Դϴ�.");
		} else { // 0�� �� ��(true)
			System.out.println("0�Դϴ�.");
		}
		
		
		int myAge = 15;
		if (myAge >= 21) {
			System.out.println(myAge + "���� �����Դϴ�.");
		} else if (myAge >= 14 && myAge <= 20) {
			System.out.println(myAge + "���� û�ҳ��Դϴ�.");
		} else {
			System.out.println(myAge + "���� ����Դϴ�.");
		}
		
		
		// ���� ����ϱ�
		int month = 2;
		if (month == 1 || month == 2 || month == 12) { // 1, 2, 12 ��
			System.out.println("�ܿ�");
		} else if(month >= 3 && month <= 5) { // 3~5��
			System.out.println("��");
		} else if(month >= 6 && month <= 8) { // 6~9��
			System.out.println("����");
		} else { // ������
			System.out.println("����");
		}
		
	}

}
