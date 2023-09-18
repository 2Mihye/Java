package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 */
public class RandomMain {
	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		// rm.RandomExam();
		rm.Lotto();

	}
	
	public void Lotto() {
		// �ζǹ�ȣ ������
		Random rd = new Random(); // ������ü ����
		// ��ȣ�� ���� ��ٱ��ϰ� �ʿ��ϹǷ� ArrayList ����ϱ�
		List<Integer> lottoNum = new ArrayList<>();
		// �ߺ��� ���ϱ� ���� Set�� ����� �� ����
		// ���� ���ڸ� �� ��
		while(lottoNum.size() < 6) {
			// 1 ~ 45 ������ �����ؼ� ���� ����
			int ranNum = rd.nextInt(45)+1; // 0~44 �ڸ��� �������� ��ȣ �ϳ�
			
			// if���� ���� �ʰ� �׳� lottoNum.add(ranNum); ���� �ᵵ ���� �������� �ߺ��� ���� list�� ����� �� �����Ƿ� ����
			if(!lottoNum.contains(ranNum)) {
			// !�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ��� �߻�
				lottoNum.add(ranNum);
			}
			
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
		
		
		
		
	}
	
	public void RandomExam() {
		Random rd = new Random(); // ���� ��ü ����
		
		// 1. ���� ���� ������ ������ ������ ������ ��
		int ranInt = rd.nextInt(100); // 0~99 ���̿��� 1���� ���� ����
		System.out.println(ranInt);
		
		// 2. �Ǽ� ���� ������ ������ ������ ������ �ڴ�.
		double ranD = rd.nextDouble();
		System.out.println(ranInt + ranD); // 0.0 ~ 1.0 ���� ������ �����ϰ� �Ҽ��� �ڸ��� ���ڴٴ� ����.
		
		boolean ranBool = rd.nextBoolean();
		System.out.println(ranBool);
	}
}
