package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice1();
		pm2.practice2();
		pm2.practice3();
		pm2.practice4();
		pm2.practice5();
	}
	
	// StringBuffer�� Ȱ���Ͽ� ���ڿ� �����̰� ��� append
	public void practice1() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� "); // ������ ������
		sb.append("������ ");
		sb.append("������");
		
		System.out.println("append : " + sb.toString());
	}
	
	
	// ���ڿ� ������ "���� ������ ������" reverse
	public void practice2() {
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.reverse();
		System.out.println("reverse : " + str.toString());
	}
	
	
	// ���ڿ� ���� insert ? ����
	public void practice3() {
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		// String str = "���� ������ ������";
		// StringBuffer sb = new StringBuffer(str) Ȥ�� new StringBuffer("���� ������ ������");
		str.insert(10, "?����");
		System.out.println("insert : " + str.toString());
	}
	
	
	// ���ڿ� ��ü replace(,,);
	public void practice4() {
		String str = "���� ������ ������";
		StringBuffer sb = new StringBuffer(str);
		sb.replace(7, 9, "ġŲ�ٴ�");
		System.out.println("replace : " + sb.toString());
	}

	
	// ���ڿ� ���� delete(,,);
	public void practice5() {
		StringBuffer str = new StringBuffer("���� ������ ������");
		str.delete(2, 5);
		System.out.println("delete : " + str.toString());
	}
}
