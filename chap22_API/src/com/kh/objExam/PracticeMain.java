package com.kh.objExam;

import java.util.Scanner;

public class PracticeMain {
	/*
	 equals if
	 hashCode
	 toString
	 */
	
	Scanner sc = new Scanner (System.in);
	Object a = new Object();
	Object b = new Object();
	
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	public void practice1() {
		// Scanner �̿��ؼ� ����
		System.out.println("���ڿ� a�� �Է��ϼ���.");
		String a = sc.nextLine();
		System.out.println("���ڿ� b�� �Է��ϼ���.");
		String b = sc.nextLine();
		sc.close(); // �޸� ���� ����
		
		boolean isEqual = true;
		if (a.equals(b)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ� �ٸ��ϴ�.");
		}
		
		// ���ڿ��� �ؽ��ڵ� ���
		int hashCode1 = a.hashCode();
		int hashCode2 = b.hashCode();
		System.out.println("ù ��° ���ڿ��� �ؽ��ڵ� : " + hashCode1);
		System.out.println("�� ��° ���ڿ��� �ؽ��ڵ� : " + hashCode2);
		
		// ���ڿ��� ���ڿ� ǥ�� ���
		String aString = a.toString();
		String bString = b.toString();
		System.out.println("ù ��° ���ڿ��� ���ڿ� ǥ�� : " + aString);
		System.out.println("�� ��° ���ڿ��� ���ڿ� ǥ�� : " + bString);
		
	}

}
