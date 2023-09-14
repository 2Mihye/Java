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
	
	public void practice1() { // 경로설정해서 파일 만들기
		final String wpath = "C:\\Users\\user1\\Desktop\\FileName.txt"; // 파일 경로를 수정하지 못하게 적어둠
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\FileName.txt");
			w.write("이무진 목소리 좋다!");// 파일쓰기
			w.close();// 파일 닫기
			
			// 절대 경로는 어디서 보던지 경로가 확실한 경로를 말함
			FileReader reader = new FileReader ("C:\\Users\\user1\\Desktop\\FileName.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferReader.close(); // 파일 닫기
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public void practice2() {
		// 폴더를 만들고 폴더 안에 파일을 만들기 -> 파일 안에 내용 작성하기
		// window 는 \를 사용하고 Linux or MacOs는 /를 사용한다.
		// File.separator를 써서 구분함.
		String folderPath = "C:\\Users\\user1\\Desktop\\lecture"; // 원하는 경로 설정
		
		// 폴더 만들기
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
			fw.write("선생님 수업 좋아욤");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
