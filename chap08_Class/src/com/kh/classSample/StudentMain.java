package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		// public Student(String name, int age, String grade) {
		Student student1 = new Student("�̹���",20,"1�г�");
		
		// �л� ���� ���
		student1.displayInfo();
		
		// �л��� 3�� ���� 3�� ����ϱ�
		// student2, student3, student4
		// ������ �̸��� ���̿� �г��� displayInfo�� ����ؼ� ����ϼ���.
		
		Student student2 = new Student("�̹���",20,"2�г�");
		student2.displayInfo();
		
		Student student3 = new Student("���ϴ�",20,"1�г�");
		student3.displayInfo();
		
		Student student4 = new Student("�ֿ���",50,"5�г�");
		student4.displayInfo();
	}

}
