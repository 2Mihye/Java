package com.kh.arraylist.practice;

import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		ArrayList<String> rainbow = new ArrayList<>();
		
		// ��� �߰�
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");
		rainbow.add("����");
		rainbow.add("����");
	
		// ��� ����
		rainbow.set(1, "��");
		rainbow.set(3, "����");
		rainbow.set(5, "�׸�");
		
		// ���ϱ� 2ȸ -> ��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
		rainbow.add(2, "���ο�");
		rainbow.add(6, "�����Ķ�");
		
		System.out.println(rainbow);
		
		// ���� for�� �̿� ���� ��� // �� �� ��
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
	
		
		for(String colorList : rainbow) {
			System.out.println(colorList);
		}
		
	}

}
