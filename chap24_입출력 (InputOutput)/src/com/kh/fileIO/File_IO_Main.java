package com.kh.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File_IO_Main {

	public static void main(String[] args) {
		FileWriter writer;
		try {
			writer = new FileWriter("LeeMujin.txt"); // ����
			writer.write("�̹��� �߻����."); // ���� ����
			writer.close(); // ���� �ȿ� ������ �� ���� �ݱ�
			
			FileReader reader = new FileReader("LeeMujin.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); // ������ �� ������ �ݾ��ֱ�(����)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

/*
// ���࿡ ��¥�� ���� ��¥�� ������ ���� ��
// ������ ����� mk��� �༮�� �Ἥ ������ �����.
String filePath = "���� �ۼ���/�����IO.txt";
System.out.println("����");
File f = new File("newFile.txt"); // File �����̸� = new File("��μ���","newFile.txt");
try {
	if(f.createNewFile()) {
		System.out.println("������ �����߽��ϴ�.");
	} else {
		System.out.println("�̹� �����ϴ� �����Դϴ�.");
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

String fileName = f.getName();
// FileWriter fWriter = new FileWriter(filePath,true); // true�� ���� ���� �̾��, false�� ���� �����
// FileReader fReader = new FileReader(f,true);
 * 
 */
