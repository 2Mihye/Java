package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		// pm.Practice1();
		// pm.Practice2();
		pm.Practice3();
	}
	
	public void Practice1() {
		// 폴더 연속으로 2개 만들기 C:\Users\ user1\Desktop\이름1\이름2
		String dirPath = "C:\\Users\\user1\\Desktop\\Actor\\LeeJoonho";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("성공!");
		} else {
			System.out.println("실패...");
		}
		
	}
	
	public void Practice2() {
		// 폴더 연속으로 3개 만들기 C:\Users\ user1\Java_Workspace\chap25_
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\chap25_\\Java";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("성공!");
		} else {
			System.out.println("실패...");
		}
	}
	
	public void Practice3() {
		// 폴더 연속으로 5개 만들기 C:\Users\ user1\Documents\myPlace\Music\Korean\KPop\Group
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\KPop\\Group\\악뮤";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("성공!");
		} else {
			System.out.println("실패...");
		}
	}

}
