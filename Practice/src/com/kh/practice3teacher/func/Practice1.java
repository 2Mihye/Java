package com.kh.practice3teacher.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1.�Է� / 2.���� / 3.��ȸ / 4.���� / 7.����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int choice = sc.nextInt();
		
		
		/** 1.if�� **/
		/*
		if (choice  == 1 ) {
			System.out.println("�Է� �޴��Դϴ�.");
		} else if (choice == 2) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (choice == 3) {
			System.out.println("��ȸ �޴��Դϴ�.");
		} else if (choice == 4) {
			System.out.println("���� �޴��Դϴ�.");
		} else if (choice == 7) { // else�� �� ��� ������ ���� ���ϱ� ������ else if�� ��� ��!
			System.out.println("���α׷��� ����˴ϴ�.");
		}
		*/
		
		/** 2. switch�� **/
		switch(choice) {
			case 1:
				System.out.println("�Է� �޴��Դϴ�.");
				break;
			case 2:
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 3:
				System.out.println("��ȸ �޴��Դϴ�.");
				break;
			case 4:
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 7:
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			default:
				System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
		}
	}

}
