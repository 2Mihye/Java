package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : 난수를 생성하기 위해 사용되는 클래스
 	난수 : 무작위로 만들어진 수
 */
public class RandomMain {
	public static void main(String[] args) {
		RandomMain rm = new RandomMain();
		// rm.RandomExam();
		rm.Lotto();

	}
	
	public void Lotto() {
		// 로또번호 생성기
		Random rd = new Random(); // 랜덤객체 생성
		// 번호를 담을 장바구니가 필요하므로 ArrayList 사용하기
		List<Integer> lottoNum = new ArrayList<>();
		// 중복을 피하기 위해 Set을 사용할 수 있음
		// 여섯 숫자만 들어갈 것
		while(lottoNum.size() < 6) {
			// 1 ~ 45 범위를 지정해서 난수 생성
			int ranNum = rd.nextInt(45)+1; // 0~44 자리에 랜덤으로 번호 하나
			
			// if문을 쓰지 않고 그냥 lottoNum.add(ranNum); 으로 써도 값은 나오지만 중복된 값이 list에 저장될 수 있으므로 설정
			if(!lottoNum.contains(ranNum)) {
			// !가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프 발생
				lottoNum.add(ranNum);
			}
			
		}
		System.out.println("로또 번호 : " + lottoNum);
		
		
		
		
	}
	
	public void RandomExam() {
		Random rd = new Random(); // 랜덤 객체 생성
		
		// 1. 정수 범위 내에서 랜덤인 난수를 만들어야 함
		int ranInt = rd.nextInt(100); // 0~99 사이에서 1개의 수를 생성
		System.out.println(ranInt);
		
		// 2. 실수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		double ranD = rd.nextDouble();
		System.out.println(ranInt + ranD); // 0.0 ~ 1.0 사이 정수는 배재하고 소수점 자리만 보겠다는 뜻임.
		
		boolean ranBool = rd.nextBoolean();
		System.out.println(ranBool);
	}
}
