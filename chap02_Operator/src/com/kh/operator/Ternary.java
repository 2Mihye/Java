package com.kh.operator;

public class Ternary {

	public static void main(String[] args) {
		// 6. ���׿����� : ������ ���ϰ� �� ���� �� �� �ϳ��� ��ȯ�Ѵ�.
		// 				���� = ����? ���� : ����
		/*
		 * (����) ? ��1//�� : ��2//���� ���·� ����.
		 * ��1�� ������ ���� �� ���
		 * ��2�� ������ ������ �� ���
		 * 
		 * ex) ���� 20�̻��� �����ΰ� �̼������ΰ�
		 * int age = 20;
		 * 						����	   ?����1(��): ����2(����)
		 * String status = (age >= 20) ? "����" : "�̼�����";
		 * System.out.println(status);
		 */
		
		 int age = 20;
		 String status = (age >= 20) ? "����" : "�̼�����";
		 System.out.println(status);
		 
		 int score = 85;
		 String result = (score >= 60) ? "�հ�" : "���հ�";
		 System.out.println("���� ��� : " + result);
		 
		 int number = -5;
		 String sign = (number > 0) ? "true" : "false";
		 System.out.println("sign�� : " + sign);
		 
		 int temperature = 25;
		 String weather = (temperature > 21) ? "������ ����" : "�߿� ����";
		 System.out.println("���� ���� : " + weather);
		 
		 // ���� 7�� ���� ¦������ Ȧ�� ���� ���
		 int numb = 7;
		 String odd = (numb%2 > 0) ? "Ȧ��" : "¦��";	//== (numb%2 == 0) ? "¦��" : "Ȧ��";
		 System.out.println("���� 7�� �� : " + odd);
		 
		 int numb2 = -5;
		 // ������ ������ ��� �Ѿ.
		 String sign2 = (numb2 > 0) ? "���" : (numb2 < 0) ? "����" : "0";
		 System.out.println("������ ��ȣ : " + sign2);
	}

}
