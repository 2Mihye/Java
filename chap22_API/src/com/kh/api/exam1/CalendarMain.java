package com.kh.api.exam1;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// Calendar Ŭ������ ����� ���� ��¥�� �ð� ��������
		Calendar calendar = Calendar.getInstance(); // abstract�̱� ������ new�� ���� ����
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int  day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar Ŭ������ �Ͽ��� ���� ��¥�� �ð�");
		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");

	}

}