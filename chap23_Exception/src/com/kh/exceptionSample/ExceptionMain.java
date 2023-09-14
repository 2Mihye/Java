package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain em = new ExceptionMain();
		// em.ExceptionA();
		// em.ExceptionN();
		em.ExceptionF();

	}

	public void ExceptionA() {
		try {
			int result = 10 / 0; // 0���� ������ �õ�
			System.out.println("Result : " + result);
		} catch(ArithmeticException e) { // catch (�����̸� ������)
			/*
			 ArithmeticException : �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e���� e�� �츮�� ������ ������
			 getMessage�� ������ ������ �޼����� ���޹޴´�.
			 */
			System.out.println("��� �������� ���� �߻��� ����!!" + e.getMessage());
		}
	}

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); // ������ ���µ� text�� ���� ���ڿ��� ���̸� ���
			System.out.println("���ڿ� ���� : " + length);
		} catch(NullPointerException npe) {
			// System.out.println("�� ���Դϴ�."); -> ������ ���
			System.out.println("!!!�� ����!!!" + npe.getMessage());
		}

	}
	
	public void ExceptionF() {
		try {
			String iDNum = "�ȿ���904";
			int num = Integer.parseInt(iDNum); // ���ڿ��� ������ ��ȯ �õ�
			System.out.println("���� : " + num); // �ȿ� String�� ����ֱ� ������ ������ ���� ����.
		} catch (NumberFormatException format) {
			System.out.println("���ڸ� �־��ּ���.");
			System.out.println("NumberFormatException �߻� : " + format.getMessage());
		}
	}
}
