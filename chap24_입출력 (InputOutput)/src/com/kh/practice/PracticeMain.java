package com.kh.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	}
	
	public void practice1() { // ��μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\FileName.txt");
			w.write("�̹��� ��Ҹ� ����!");// ���Ͼ���
			w.close();// ���� �ݱ�
			
			FileReader reader = new FileReader ("C:\\Users\\user1\\Desktop\\FileName.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close(); // ���� �ݱ�
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
