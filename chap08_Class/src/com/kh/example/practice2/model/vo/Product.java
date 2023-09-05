package com.kh.example.practice2.model.vo;
// sysout + ctrl + space => ��� �ڵ��ϼ�
/*
 - pName : String
 - price : int
 - brand : String
 + Product()
 + information() : void
 */
public class Product {
/*
 1. ������� ����
 - pName : String
 - price : int
 - brand : String
 
 2. ������ this�� Ȱ���ؼ� ��������
 + Product()
 
 3. ���� ��� �޼ҵ� �����
 + information() : void
 */
	//1.������� ����
	private String pname;
	private int price;
	private String brand;
	
	//2. ������ this�� Ȱ���ؼ� ��������
	public Product(String pname, int price, String brand) {
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	
	//3. ���� ��� �޼ҵ� �����
	public void information() {
		System.out.println("��ǰ�� : " + pname);
		System.out.println("���� : " + price + "��");
		System.out.println("�귣�� :" + brand);
	}
}
