package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		Tv tv; // TV �ν��Ͻ� �����ϱ� ���ؼ� ���� tv ����
		tv = new Tv(); // Tv �ν��Ͻ� ���� + ��ü�� �ּҸ� ���������� �����Ѵ� // �� �� ������ Tv tv = new Tv(); �̷��� �� �� ����
		
		tv.power(); // �޼��� ȣ��
		tv.channel = 7; // Tv �ν��Ͻ��� ������� channel�� ���� 7�� ����
		tv.channelDown(); // Tv �ν��Ͻ��� �޼��� channelDown�� ȣ��
		System.out.println("Channel : " + tv.channel);
	}

}