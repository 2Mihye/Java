package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int menu;
		boolean choiceMenu = false;
		
		System.out.println("1.�Է� / 2.���� / 3.��ȸ / 4.���� / 7.����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		 
			menu = sc.nextInt();
			switch (menu) {
				case 1:
					System.out.println(menu + "�� ��ȸ �޴��Դϴ�.");
					break;
				case 2:
					System.out.println(menu + "�� ���� �޴��Դϴ�.");
					break;
				case 3:
					System.out.println(menu + "�� ��ȸ �޴��Դϴ�.");
					break;
				case 4:
					System.out.println(menu + "�� ���� �޴��Դϴ�.");
					break;
				case 7:
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				default:
					System.out.println("�߸� �����̽��ϴ�. �ٽ� �����ּ���.");
			}
		}
	}
