package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpledateFormatMain {
/*
 SinpleDateFormat�̶�? : ��¥�� �ð��� ���ϴ� �������� �������ϰų� ���ڿ��κ��� ��¥�� �ð��� �Ľ�(����)�ϴ� �� ���Ǵ� Ŭ����
 
 yyyy-MM-dd HH:mm:ss
 y : ����
 M : ��
 d : ��
 H : 24�� ������ �ð�
 m : ��
 s : ��

 */
	public static void main(String[] args) {
		Date currentDate = new Date(); // import�� util.Date��!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// �����õ� ���ڿ��� ��ȯ
		String forDate = sdf.format(currentDate);
		
		//������
		System.out.println("�����õ� ��¥ �� �ð� : " + forDate);
	}

}
