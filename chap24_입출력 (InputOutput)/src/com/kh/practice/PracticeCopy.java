package com.kh.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy pc = new PracticeCopy();
		pc.Practice1();
	}
	
	public void Practice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.jpg";
		
		try (FileInputStream fileInput = new FileInputStream(inputFile);
			FileOutputStream fileOutput = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while ((byteRead = fileInput.read(buffer)) != -1) {
				fileOutput.write(buffer,0,byteRead);
			}
				System.out.println("������ ����Ǿ����ϴ�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void Practice2() {
		// �̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� ����ȭ�鿡�� ������ ���� ���� �ȿ� ������ �̹��� �����ϱ�!
		String inputFile = "C:\\Users\\user1\\Desktop\\lovely.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\image";
		//newFolder.mkdir();
		String outputFile = newFolder + "\\" + "lovely.jpg";
		
			try (FileInputStream fis = new FileInputStream(inputFile); 
					FileOutputStream fos = new FileOutputStream(outputFile)){
				byte[] buffer = new byte[1024]; // 1024 ����Ʈ ũ���� buffer ���
				int byteRead; // int byteRead: fis.read(buffer) �޼��带 ȣ���Ͽ� ���۷� �о���� ����Ʈ ���� �����ϴ� ���� ����
				
				// ������ �а� �����ϴ� ���� ����
				// fis.read(buffer)�� ����Ͽ� ���Ͽ��� �����͸� �о���̰� �о���� �����͸� fos.write(buffer,0,byteRead)�� �о���� �����͸� ����Ѵ�.
				// ������ ���� �����ϸ� -1 �� ��ȯ�ϸ鼭 while���� �����Ѵ�.
				while ((byteRead = fis.read(buffer)) != -1) { // -1�̶� inputStream���� ���̻� ���� �����Ͱ� ���� �� ��ȯ�ϴ� ��
					fos.write(buffer,0,byteRead);
				}
					System.out.println("������ ����Ǿ����ϴ�!");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
