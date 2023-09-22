package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = null;
			fw = new FileWriter("file.txt");
			System.out.println("파일이 생성되었습니다.");
			fw.write("1000");
			fw.write("10000");
			fw.write("1004");
			fw.close();
			System.out.println("파일이 닫혔습니다.");
			
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
	
	/* 이어쓰기
	   try {
	  		FileWriter fw = null;
	  		fw = new FileWriter("file.txt");
	 		fw.write(1000);
	 		fw.write(10000);
	   }catch (Exception e) {
	   		e. printStackTrace();
	   }
	 */
	
	
	
	/* 이어쓰기 선생님 풀이
	public static void main(String[] args){
	   try {
	  		FileWriter fw = null;
	  		fw = new FileWriter("file.txt",true);
	 		// 두 번째 인자의 값이 boolean true 지정되면 해당 파일에 이어쓰기가 됨
	 		fw.write("1000");
	 		fw.write("10000");
	   }catch (Exception e) {
	   		e. printStackTrace();
	   }
	}
	 */

}
