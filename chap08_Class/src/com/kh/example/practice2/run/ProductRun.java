package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;
// import�� ���� 1ȸ�� �ۼ�
public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ� ���� ��ǰ��, ����, �귣��� ����ϱ�
		Product goods1 = new Product ("�Һ�",20000,"��Ÿ����");
		goods1.information();
		
		Product goods2 = new Product ("�е�",50000,"����");
		goods2.information();
		
		Product goods3 = new Product ("�潽",30000,"�Ｚ");
		goods3.information();

	}

}
