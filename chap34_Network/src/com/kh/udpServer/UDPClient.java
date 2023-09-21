package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public void start() throws Exception {
		DatagramSocket dataSocket = new DatagramSocket();
		// .getAllByName으로 들어가면 오류가 날 수 있으므로 All이 들어갔나 확인할 것!
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		//데이터가 저장될 공간을 임이의 지정된 크기로 byte 배열 생성
		byte[] msg = new byte[200];
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 9999);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		dataSocket.send(outPacket); // DatagramPacket을 전송
		dataSocket.receive(inPacket); // DatagramPacket을 수신
		
		System.out.println("서버의 현재 시간 : " + new String(inPacket.getData()));
		
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
