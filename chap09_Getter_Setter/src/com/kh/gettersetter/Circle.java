package com.kh.gettersetter;

public class Circle {
	private double PI = 3.14; // ���
	private int radius = 1; // ����
	

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
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
