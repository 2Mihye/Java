package com.kh.classAM;

public class AM {
	public 	  int pNum = 10;
	protected int pNum2 = 20;
	// default   int pNum3 = 30; // ���������ڸ� ������� ������ �ڵ��� default�� �����.
	int pNum3 = 30;
	private   int pNum4 = 40;
	
	//ȣ�� �޼ҵ� �ۼ��ؼ� ���� ȣ���ϱ�
	public void publicMethod() {
		System.out.println("� Ŭ���������� ������ ���� / publicMethod() ȣ���");
	}
	
	protected void protectedMethod() {
		System.out.println("���� ��Ű�� ������ ������ ���� / protectedMethod() ȣ���");
	}
	
	// default void defaultMethod() { // �Ȱ��� �⺻���� ����Ǿ� �ֱ� ������ default ���������ڸ� �ۼ����� �ʾƵ� �ȴ�.
	void defaultMethod() {
		System.out.println("���� ��Ű�� �������� ������ ���� / defaultMethod() ȣ���");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod() ȣ���");
	}
}
