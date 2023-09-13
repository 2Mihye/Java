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
		
		LocalTime today = LocalTime.now();
		System.out.println("현재 시간 : " + today);
		
		LocalDateTime todayDate = LocalDateTime.now();
		System.out.println("날짜 시간 : " + todayDate);
	}

}
