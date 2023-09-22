package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = null;
			fw = new FileWriter("file.txt");
			System.out.println("������ �����Ǿ����ϴ�.");
			fw.write("1000");
			fw.write("10000");
			fw.write("1004");
			fw.close();
			System.out.println("������ �������ϴ�.");
			
			FileReader reader = new FileReader("file.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* �̾��
	   try {
	  		FileWriter fw = null;
	  		fw = new FileWriter("file.txt");
	 		fw.write(1000);
	 		fw.write(10000);
	   }catch (Exception e) {
	   		e. printStackTrace();
	   }
	 */
	
	
	
	/* �̾�� ������ Ǯ��
	public static void main(String[] args){
	   try {
	  		FileWriter fw = null;
	  		fw = new FileWriter("file.txt",true);
	 		// �� ��° ������ ���� boolean true �����Ǹ� �ش� ���Ͽ� �̾�Ⱑ ��
	 		fw.write("1000");
	 		fw.write("10000");
	   }catch (Exception e) {
	   		e. printStackTrace();
	   }
	}
	 */

}
