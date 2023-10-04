package com.kh.finalSample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileMain {
	public void fileSave(String fileName,Food food) {
		// 전달받은 fileName으로 파일 객체를 생성
		try {
			FileOutputStream  fOStream = new FileOutputStream(fileName); // FileOutputStream import
			
			// 파일 객체와 연결하는 파일 출력 스트림 생성
			ObjectOutputStream objStream = new ObjectOutputStream(fOStream); // ObjectOutputStream import
			
			// 파일에 food 객체를 기록
			objStream.writeObject(food);
			
			// 스트림 닫기
			objStream.close();
			fOStream.close();
			
			System.out.println("Food 객체를 파일에 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileMain fm = new FileMain();
		Food foodSample = new Food("사과", 20);
		fm.fileSave("food.txt", foodSample);
	}
}
