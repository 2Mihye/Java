package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		String originFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealCute.jpg";
		
		try (FileInputStream fis = new FileInputStream(originFile); 
				FileOutputStream fos = new FileOutputStream(outputFile)){
			byte[] buffer = new byte[1024]; // 1024 바이트 크기의 buffer 사용
			int byteRead; // int byteRead: fis.read(buffer) 메서드를 호출하여 버퍼로 읽어들인 바이트 수를 저장하는 변수 선언
			
			// 파일을 읽고 복사하는 동안 사용됨
			// fis.read(buffer)을 사용하여 파일에서 데이터를 읽어들이고 읽어들인 데이터를 fos.write(buffer,0,byteRead)로 읽어들인 데이터를 출력한다.
			// 파일의 끝에 도달하면 -1 을 반환하면서 while문을 종료한다.
			while ((byteRead = fis.read(buffer)) != -1) { // -1이란 inputStream에서 더이상 읽을 데이터가 없을 때 반환하는 것
				fos.write(buffer,0,byteRead);
			}
				System.out.println("파일이 복사되었습니다!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
