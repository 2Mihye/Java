package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// �ݺ������� ���
		int i = 1;
		while (i <= 10) { // ���ڰ� Ư�����ڰ� �Ǹ� ����� ���߰� ���� ��
			System.out.println(i); // �� ������ ���� ��쿡�� ����� ��
			i = ++i;
			// i++ �� �� i�� 1 ���� ���� �����߱� ������ ++�� �۵����� �ʾƼ� ���ѷ����� �߻�
			// ++i �� ���� i�� 1�� ���� ���߱� ������ 1~10���� ��� �����ϰ� ���ѷ����� �߻����� ����
		}
		
	}

}
