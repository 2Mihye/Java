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
			writer = new FileWriter("LeeMujin.txt"); // 생성
			writer.write("이무진 잘생겼다."); // 파일 쓰기
			writer.close(); // 파일 안에 내용을 다 쓰면 닫기
			
			FileReader reader = new FileReader("LeeMujin.txt");
			BufferedReader bufferdReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferdReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferdReader.close(); // 파일을 다 읽으면 닫아주기(종료)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

/*
// 만약에 날짜가 오늘 날짜인 폴더가 없을 때
// 폴더를 만들고 mk라는 녀석을 써서 파일을 만든다.
String filePath = "설명 작성란/입출력IO.txt";
System.out.println("생성");
File f = new File("newFile.txt"); // File 변수이름 = new File("경로설정","newFile.txt");
try {
	if(f.createNewFile()) {
		System.out.println("파일을 생성했습니다.");
	} else {
		System.out.println("이미 존재하는 파일입니다.");
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

String fileName = f.getName();
// FileWriter fWriter = new FileWriter(filePath,true); // true는 파일 끝에 이어쓰기, false는 파일 덮어쓰기
// FileReader fReader = new FileReader(f,true);
 * 
 */
