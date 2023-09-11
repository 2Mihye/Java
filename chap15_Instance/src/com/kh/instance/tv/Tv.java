package com.kh.instance.tv;
	// TV 제작
public class Tv {

	// TV 속성(필드)
	String color; // TV색상
	boolean power; // 전원상태
	int channel; // 채널
	
	// TV기능 (메서드) -> 문장으로 나타낼 수 있음
	public void power() {
		power = !power; // 전원상태
	}
	
	public void channelUP() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
