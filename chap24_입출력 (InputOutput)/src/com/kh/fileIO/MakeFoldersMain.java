package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/*
 mkdirs : ����ȭ�鿡 kh������ ����� image�� ����� ������ kh������ ���� �� ������ ������ִ� �༮
 		  �θ� ���丮�� �������� ���� ��� �߰� ��� ���丮�� �����Ѵ�.
 		  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "C:\\Users\\user1\\Desktop\\musician\\singers\\LeeMujin";
		
		// file ��ü ����
		File dir = new File(dirPath);
		
		// mkdirs �޼��带 ����Ͽ� ���丮 ���� �õ�
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("���� ���� ����!");
		} else {
			System.out.println("���� ���� ����...");
		}
	}

}
