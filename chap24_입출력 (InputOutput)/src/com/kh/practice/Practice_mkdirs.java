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
		// ���� �������� 2�� ����� C:\Users\ user1\Desktop\�̸�1\�̸�2
		String dirPath = "C:\\Users\\user1\\Desktop\\Actor\\LeeJoonho";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("����!");
		} else {
			System.out.println("����...");
		}
		
	}
	
	public void Practice2() {
		// ���� �������� 3�� ����� C:\Users\ user1\Java_Workspace\chap25_
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\chap25_\\Java";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("����!");
		} else {
			System.out.println("����...");
		}
	}
	
	public void Practice3() {
		// ���� �������� 5�� ����� C:\Users\ user1\Documents\myPlace\Music\Korean\KPop\Group
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\KPop\\Group\\�ǹ�";
		File dir = new File(dirPath);
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("����!");
		} else {
			System.out.println("����...");
		}
	}

}
