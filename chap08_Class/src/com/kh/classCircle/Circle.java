package com.kh.classCircle;

public class Circle {
	// ������� (�ʵ�)
	// final double PI = 3.14;
	// private final double PI = 3.14
	// private static final double PI = 3.14; // �޸� ��� ������ �Ǵ����� ���� �ٸ� �� ���� ����� ��.
	final double PI = 3.14; // ���
	private int radius = 1; // ����
	
	// ������
	public Circle() {
		// �⺻ ������
		
	}
	
	// �޼��忡�� �������� ���� ���
	public void inRadius() {
		// ������ ���� : ������ų ���� ������ �� �ִ�!
		radius++;
	}
	public void AreaCircle() {
		// ���� ���̸� ����ϰ� ����ϴ� �޼���
		double area = PI * radius * radius;
		System.out.println("���� ���� : " + area);
	}
	
	public void SizeOfCircle() {
		System.out.println("���� ũ��(������) : " + radius);
	}
}
