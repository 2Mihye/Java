package chap06_for;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// ������ �����
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		
		System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		
		int result = 0; // ���� ���� 0���� �ش�.
		
		for (int i = 1; i < num2; i++) { // for ������ ����Ͽ� i������ 0���� num2 �̸����� �ݺ��ϰ� �� ������ num2��ŭ �ݺ��Ѵ�.
			result += num1; // result ������ num1 ���� ���� // num2��ŭ num1�� ���ϴ� ȿ��
			System.out.println(num1 +" * " + i + " = " + result);
		}
		//System.out.println(num1 +" * " + num2 + " = " + result); // ���� ����� ����ϰ� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� ���
		
		

		}
	}


