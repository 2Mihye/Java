package com.kh.instance.tv;
	// TV ����
public class Tv {

	// TV �Ӽ�(�ʵ�)
	String color; // TV����
	boolean power; // ��������
	int channel; // ä��
	
	// TV��� (�޼���) -> �������� ��Ÿ�� �� ����
	public void power() {
		power = !power; // ��������
	}
	
	public void channelUP() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
