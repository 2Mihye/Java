package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("������ �������ּ���.");
		int fruit = sc.nextInt();
		
		switch (fruit) {
			case 1:
				System.out.println("���");
				break;
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�.");
		}
		
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.print("1. �Ƹ޸�ī�� ");
		System.out.print("2. ��׷��� �ٴҶ�� ");
		System.out.print("3. ���ν���� ");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("��׷��� �ٴҶ�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���ν���� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
		*/
		
		// scanner�� �̿��Ͽ� ���ڸ� �����ϴ� switch �����
		System.out.println("���ڸ� �������ּ���.");
		System.out.print("1.������Ĩ / ");
		System.out.print("2.���Ҷ� / ");
		System.out.println("3.������ ");
		
		int choice;
		boolean isChoice = false;
		// choice = sc.nextInt();
		
		while (!isChoice) {
			choice = sc.nextInt();
		
			switch (choice) {
				case 1:
					System.out.println("1.������Ĩ �ֹ��ϼ̽��ϴ�.");
					isChoice = true;
					break;
				case 2:
					System.out.println("2.���Ҷ� �ֹ��ϼ̽��ϴ�.");
					isChoice = true;
					break;
				case 3:
					System.out.println("3.������ �ֹ��ϼ̽��ϴ�.");
					isChoice = true;
					break;
				default:
					System.out.println("�߸��� �ֹ��Դϴ�. �ٽ� �Է����ּ���.");
			}
		}
		

	}

}
