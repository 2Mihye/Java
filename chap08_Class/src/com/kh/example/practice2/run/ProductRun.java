package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;
// import는 최초 1회만 작성
public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고 각각 상품명, 가격, 브랜드명 출력하기
		Product goods1 = new Product ("텀블러",20000,"스타벅스");
		goods1.information();
		
		Product goods2 = new Product ("패드",50000,"애플");
		goods2.information();
		
		Product goods3 = new Product ("펜슬",30000,"삼성");
		goods3.information();

	}

}
