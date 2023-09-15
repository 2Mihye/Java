package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// �̹��� �ϳ� �ҷ�����
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.jpg";
		String outputImg = path + "\\folder\\reSizedCute.jpg";
		// ����ȭ�鿡 ���ο� ���� ����� mkdir
		File folder = new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		// ���� ���������� �̹����� ����ȭ�鿡 ���� ���� ���� �ȿ� �����ϱ�
		int width = 200; // ����
		int height = 400;// ����
		
		try {
			// ���� �ҷ�����
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			// ��������
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			// BufferedImage�� ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			
			// ��������� �̹����� ���Ϸ� ����
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ�!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� �������� �� ���� �߻�!" + e.getMessage());
		}

	}

}
