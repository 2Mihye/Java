package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ�� �� ���
 		Java1.1 ���� ������� ����
 		Java.time ��Ű�� LocalDate LocalTime LocalDateTime�� ����ϴ°� ����
 		
 */
	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime today = LocalTime.now();
		System.out.println("���� �ð� : " + today);
		
		LocalDateTime todayDate = LocalDateTime.now();
		System.out.println("��¥ �ð� : " + todayDate);
	}

}
