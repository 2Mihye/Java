package com.kh.linkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		// List �������̽� LinkedList ��ü Ȱ���ؼ� �� �ְ� ���
		// ���� String �ְ� ���� ���� ���
		// ����
		List<String> linkedList = new LinkedList<>();
		// ��� �߰�
		linkedList.add("������");
		linkedList.add("���Ƕ��̽�");
		linkedList.add("����ư�");
		// ��� ����
		linkedList.set(2,"ġŲ�ٴ�");
		// ��� ����
		linkedList.remove(2);
		// ���
		System.out.println(linkedList);
		
		// LinkedList ��ü new LinkedList ��ü
		// ���� int �ְ� ���� ���� ���
	}

}
