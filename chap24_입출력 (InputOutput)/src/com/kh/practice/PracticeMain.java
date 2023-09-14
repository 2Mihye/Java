package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		// pm.practice1();
		pm.practice2();
	}
	
	public void practice1() { // ��μ����ؼ� ���� �����
		final String wpath = "C:\\Users\\user1\\Desktop\\FileName.txt"; // ���� ��θ� �������� ���ϰ� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\FileName.txt");
			w.write("�̹��� ��Ҹ� ����!");// ���Ͼ���
			w.close();// ���� �ݱ�
			
			// ���� ��δ� ��� ������ ��ΰ� Ȯ���� ��θ� ����
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
	
	public void practice2() {
		// ������ ����� ���� �ȿ� ������ ����� -> ���� �ȿ� ���� �ۼ��ϱ�
		// window �� \�� ����ϰ� Linux or MacOs�� /�� ����Ѵ�.
		// File.separator�� �Ἥ ������.
		String folderPath = "C:\\Users\\user1\\Desktop\\lecture"; // ���ϴ� ��� ����
		
		// ���� �����
		String wpath = folderPath + "\\new";
		File folder = new File(wpath);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Initialized empty new repository in " + folderPath + "\\new");
		} else {
			System.out.println("Reinitialized existingGit repository in C:\\Users\\user1\\Desktop\\lecture.");
		}
		
		
		try {
			FileWriter fw = new FileWriter(wpath + "\\new.txt");
			fw.write("������ ���� ���ƿ�");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
