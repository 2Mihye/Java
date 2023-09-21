package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// UDP 서버 클래스
public class UDPClient {
	// start()는 UDP 서버를 시작하는 메서드로 예외처리 필요
	public void start() throws Exception {
		// 소켓 생성 UDP 통신이 이뤄짐.
		DatagramSocket dataSocket = new DatagramSocket();
		
		// .getAllByName으로 들어가면 오류가 날 수 있으므로 All이 들어갔나 확인할 것!
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1"); // 서버에 연결하기 위해 소켓을 생성
		//127.0.0.1 = localhost 클라이언트와 서버가 같은 컴퓨터에서 실행 중인 것으로 가정하고 포트 번호 설정을 서버에서 진행하고, 서버에서 연결한 포트로 들어감
		
		//데이터가 저장될 공간을 임이의 지정된 크기로 byte 배열 생성
		byte[] msg = new byte[200];
		
		// 서버로 데이터를 보내기 위한 설정 
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 9999);
		// 서버로부터 데이터를 수신하기 위한 설정
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		dataSocket.send(outPacket); // DatagramPacket을 전송
		dataSocket.receive(inPacket); // DatagramPacket을 수신
		
		// 수신된 데이터를 문자열로 변환하여 서버의 현재 시간을 출력
		System.out.println("서버의 현재 시간 : " + new String(inPacket.getData()));
		
		// 클라이언트의 소켓을 닫아서 연결을 종료
		dataSocket.close();
	}
	
	public static void main(String[] args) {
		try {
			new UDPClient().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
