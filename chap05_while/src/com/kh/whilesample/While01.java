package com.kh.whilesample;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		boolean isTrue = true;
		// int choice = sc.nextInt(); // while ������ �̵�����
		
		while (isTrue) { // isTrue�� true�̱� ������ true��ſ� isTrue ���
			System.out.println("Ŀ�Ǹ� �ֹ����ּ���. 1.�Ƹ޸�ī�� 2.īǪġ�� 3.������ũƼ");
			int choice = sc.nextInt(); // ������ �̵���Ŵ
			
			switch(choice) {
				case 1:
					System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
					isTrue = false; // �Ƹ޸�ī�� �ֹ��� �޾����� while���� �����ϱ� ���� false�� ����ִ´�.
					break;
				case 2: 
					System.out.println("īǪġ�� �ֹ��ϼ̽��ϴ�.");
					isTrue = false;
					break;
				case 3:
					System.out.println("������ũƼ �ֹ��ϼ̽��ϴ�.");
					isTrue = false;
					break;
				default:
					System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
					System.out.println();
			}
		}
	}

}
