package com.kh.arraylist.practice;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���, ���� for���� ����Ͽ� �迭�� ��� ��Ҹ� ���� ��� ���
		
		// 1. ���� �Է¹��� Scanner �����
		Scanner sc = new Scanner (System.in);
		int[] numbers = new int[5];
		
		System.out.println("������ �Է��ϼ��� : ");
		// �迭�� 5���� ������ �Է��ϴ� for��
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
		}
		
		// ������ �������� ���ϴ� ���̱� ������ ���� for�� ��� (=�Ǵ� �⺻ for���� �̿��ϰ� �ʹٸ� length�� ����ؼ� ��� ����)
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		
		// �迭�� ��� ��Ҹ� ���� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);

		//for(int num : numbers) {
		// System.out.println(num);
		//}
		
	}

}
