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
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime todayDate = LocalDateTime.now();
		System.out.println("��¥ �ð� : " + todayDate);
		
		// ��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("������ �� ��¥ : " + futureDate);
		
		// minus�� plus�� Ȱ���Ͽ� ���� 2���� �����
		LocalDate lastDay = today.plusDays(154);
		System.out.println("������ : " + lastDay);
		LocalDate momBday = today.plusDays(817);
		System.out.println("���� ȯ�� : " + momBday);
		LocalDate startDay = today.minusDays(16);
		System.out.println("������ : " + startDay);
		LocalDate september = today.minusDays(12);
		System.out.println("9�� : " + september);
		
		
		
		// Ư�� ��¥�� �ð� �����ϱ� .of(��¥�� �ð�);
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		// date1.isBefore(date2)�� ����
		// date1.isAfter(date2)�� ����
		// ��¥ ��
		if(date1.isAfter(date2)) {
			System.out.println("������ �����Դϴ�."); // date1�� date2 ����
		} else if (date1.isBefore(date2)) {
			System.out.println("������ �����Դϴ�."); // date2�� date1 ����
		} else {
			System.out.println("�����Դϴ�"); // ���� ��
		}
	}

}
