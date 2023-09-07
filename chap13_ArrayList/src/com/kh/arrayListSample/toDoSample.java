package com.kh.arrayListSample;

import java.util.ArrayList;

//toDoSample.java
//ArrayList �̿��ؼ� �� �� ����� �����ϰ� ����� ���� �� �����ϱ�
//�� ���� �� 3�� / ���� 2/ �ϳ� ����� / ���� ����

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDo = new ArrayList<>();
		// �� �� 3��
		toDo.add("�����ϱ�");
		toDo.add("�ϱ⾲��");
		toDo.add("��ϱ�");
		
		// �� �� ���� Ȯ��
		int size = toDo.size();
		System.out.println("�� �� ����� ũ�� : " + size);
		
		// �� �� Ȯ��
		System.out.println("�� �� ��� : " + toDo);
		
		// �� �� 2�� ����
		toDo.set(2, "�庸��");
		toDo.set(1, "��α� ����");
		System.out.println("�� �� ���� : " + toDo);
		
		// �� �� 1�� ����
		toDo.remove(2);
		System.out.println("�庸�� ���� : " + toDo);
		
		// List ��ȸ�ؼ� ��� ���
		for(String toDoList : toDo) {
			System.out.println("������ �� �� ��� : " + toDoList);
		}
		
		// ���� ����
		toDo.clear();
		System.out.println("�� �� �Ϸ� : " + toDo);
		
	}

}
