package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// 이미지 하나 불러오기
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.jpg";
		String outputImg = path + "\\folder\\reSizedCute.jpg";
		// 바탕화면에 새로운 폴더 만들기 mkdir
		File folder = new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		// 새로 리사이즈한 이미지를 바탕화면에 새로 만든 폴더 안에 저장하기
		int width = 200; // 가로
		int height = 400;// 세로
		
		try {
			// 원본 불러오기
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			// 리사이즈
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			// BufferedImage로 변환
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			
			// 리사이즈된 이미지를 파일로 저장
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 중 오류 발생!" + e.getMessage());
		}

	}

}
