package com.kh.whilesample;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
		boolean isChoice = false;
		
		while (!isChoice) { // !�� ����Ͽ� true�� ǥ��
			System.out.println("���� �Է����ּ���.");
			
			int month = sc.nextInt();
			
			switch(month) {
				case 1: case 2: case 12: // case 3�� �� �ϳ��� ���̸� ���
					System.out.println("�ܿ��Դϴ�.");
					isChoice = true; // �� !�� ���� ��� ���� �������� ����ǰ�, ������ ������ �������� ����Ǳ� ������
					// true�� �ۼ����༭ !�� ���� false�� ������ while���� �������ش�.
					break; // break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����.
				case 3: case 4: case 5:
					System.out.println("���Դϴ�.");
					isChoice = true;
					break;
				case 6: case 7: case 8:
					System.out.println("�����Դϴ�.");
					isChoice = true;
					break;
				case 9: case 10: case 11:
					System.out.println("�����Դϴ�.");
					isChoice = true;
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
		*/
		
		// ���̸� �Է¹޾� ����(19~20) û�ҳ�(14~18) ���(10~13)�� �з��ϰ� �̿� ���̴� �ٽ� �Է��Ͻÿ� ����ϱ�
		// while && switch case�� �̿��Ͽ� ����ϱ�
		
		boolean isChoice = true;
		while (isChoice) { // while������ boolean�� true�϶��� ������ ��.
			System.out.println("���̸� �Է����ּ��� :");
			int age = sc.nextInt();
			
			switch (age) {
				case 10: case 11: case 12: case 13:
					System.out.println("����Դϴ�.");
					isChoice = false; // while�� ����
					break; // switch case ����
				case 14: case 15: case 16: case 17: case 18:
					System.out.println("û�ҳ��Դϴ�.");
					isChoice = false;
					break;
				case 19: case 20:
					System.out.println("�����Դϴ�.");
					isChoice = false;
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
	}

}
