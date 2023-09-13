package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {
	Date currentDate = new Date();
	

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();
	}
	
	
	
	// yyyy-MM-dd 연 월 일
	public void practice1() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("연도 월 일 :" + forDate);
	}
	
	
	// HH:mm:ss 시 분 초
	public void practice2() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		String forDate = sdf.format(currentDate);
		System.out.println("시 분 초 :" + forDate);
	}
	
	
	// MM-dd 월 일
	public void practice3() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("월 일 :" + forDate);
	}
	
	
	// yyyy-HH 연도 시간
	public void practice4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println("연도 시간 :" + forDate);
	}
	
	
	// yyyy-dd 연도 월 일 요일
	public void practice5() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		String forDate = sdf.format(currentDate);
		System.out.println("연도 월 일 요일 :" + forDate);
	}
}
