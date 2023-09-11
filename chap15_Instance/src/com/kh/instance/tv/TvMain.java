package com.kh.instance.tv;

public class TvMain {

	public static void main(String[] args) {
		Tv tv; // TV 인스턴스 참조하기 위해서 변수 tv 선언
		tv = new Tv(); // Tv 인스턴스 생성 + 객체의 주소를 참조변수에 저장한다 // 이 두 문장을 Tv tv = new Tv(); 이렇게 쓸 수 있음
		
		tv.power(); // 메서드 호출
		tv.channel = 7; // Tv 인스턴스의 멤버변수 channel의 값을 7로 설정
		tv.channelDown(); // Tv 인스턴스의 메서드 channelDown을 호출
		System.out.println("Channel : " + tv.channel);
	}

}
