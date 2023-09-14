package com.kh.fileIO;

import java.io.File;

public class MakeFoldersMain {
/*
 mkdirs : 바탕화면에 kh폴더를 만들고 image를 만들고 싶은데 kh폴더가 없을 때 쭉쭉쭉 만들어주는 녀석
 		  부모 디렉토리가 존재하지 않을 경우 중간 모든 디렉토리를 생성한다.
 		  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath = "C:\\Users\\user1\\Desktop\\musician\\singers\\LeeMujin";
		
		// file 객체 생성
		File dir = new File(dirPath);
		
		// mkdirs 메서드를 사용하여 디렉토리 생성 시도
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("폴더 생성 성공!");
		} else {
			System.out.println("폴더 생성 실패...");
		}
	}

}
