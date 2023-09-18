package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.Practice1();
		
	}
	public void Practice1() {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> tp = new ArrayList<>();
		tp.add("�ý�");
		tp.add("����");
		tp.add("����ö");
		
		// Iterator ����
		Iterator<String> iter = tp.iterator();
		
		// Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String trans = iter.next();
			System.out.println(trans);
		}
		
		// Iterator�� ����Ͽ� ��� ����
		iter = tp.iterator();
		while (iter.hasNext()) {
			String trans = iter.next();
				
			// ���� smoke�� ������ �����ϱ� ����
			if (trans.equals("�ý�")) {
				iter.remove();
			}
			System.out.println(trans);
		}
		// ���� �� ArrayList ���
		System.out.println("���� �� ���");
		for (String a : tp) {
			System.out.println(a);
		}
	}
}
