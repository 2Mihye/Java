package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타는 데 사용
 		Java1.1 이후 권장되지 않음
 		Java.time 패키지 LocalDate LocalTime LocalDateTime에 사용하는게 좋음
 		
 */
	public static void main(String[] args) {
		// import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime todayDate = LocalDateTime.now();
		System.out.println("날짜 시간 : " + todayDate);
		
		// 날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("일주일 후 날짜 : " + futureDate);
		
		// minus와 plus를 활용하여 각각 2개씩 만들기
		LocalDate lastDay = today.plusDays(154);
		System.out.println("수료일 : " + lastDay);
		LocalDate momBday = today.plusDays(817);
		System.out.println("엄마 환갑 : " + momBday);
		LocalDate startDay = today.minusDays(16);
		System.out.println("시작일 : " + startDay);
		LocalDate september = today.minusDays(12);
		System.out.println("9월 : " + september);
	}

}
