package com.kh.arraylist.practice;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		/*
		ArrayList �̿��ؼ� ���ֳ����ĳ���
	 	����3ȸ 1,3,5 -> ��, ����, �׸����� ����
		���ϱ� 2ȸ -> ��Ȳ(��), [���ο�],�Ķ�,[�����Ķ�]
		���� for�� �̿� ���� ���//�� �� ��
		 */
		
		ArrayList<String> rainbow = new ArrayList<>();
		
		// �迭 Ȯ��
		System.out.println(rainbow);
		
		// ��� �߰�
		rainbow.add("����");
		rainbow.add("��Ȳ");
		rainbow.add("���");
		rainbow.add("�ʷ�");
		rainbow.add("�Ķ�");
		rainbow.add("����");
		rainbow.add("����");
		System.out.println("��ü ���� : " + rainbow);
	
		// ��� ����
		rainbow.set(1, "��"); // ��Ȳ -> ��
		rainbow.set(3, "����"); // �ʷ� -> ����
		rainbow.set(5, "�׸�"); // ���� -> �׸�
		System.out.println("���� ���� : " + rainbow);
		
		// ���ϱ� 2ȸ -> ��Ȳ(��), [���ο�],�Ķ�,[�����Ķ�]
		rainbow.add(2, "���ο�");
		rainbow.add(6, "�����Ķ�");
		
		System.out.println("���� �߰� : " + rainbow);
		
		// ArrayList�� �ڵ����� �迭�� ������ �Ǳ� ������ �ѹ� �����ϰ� ���� �ڿ��ִ� �迭�� �˾Ƽ� �����
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
	
		/* ���� for�� �̿� ���� ��� // �� �� ��
			1. �ε��� �̿��ؼ� �ڸ� ��� // System.out.println("���� ��� : " + �迭��.get(�ش� �ε�����))'
				System.out.println(rainbow.get(0) + rainbow.get(1) + rainbow.get(2));
			2. �ʱ�ȭ �� ���
				ArrayList<String> colors = new ArrayList<>();
				colors.add("��"); ...
				System.out.println("���� ��� : " + colors.get(0) + colors.get(1) + colors.get(2))"
		 
		*/
		for(String colorList : rainbow) {
			System.out.println(colorList);
		}
		
	}

}
