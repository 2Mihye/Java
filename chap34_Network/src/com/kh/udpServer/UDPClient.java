package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public void start() throws Exception {
		DatagramSocket dataSocket = new DatagramSocket();
		// .getAllByName���� ���� ������ �� �� �����Ƿ� All�� ���� Ȯ���� ��!
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
		
		//�����Ͱ� ����� ������ ������ ������ ũ��� byte �迭 ����
		byte[] msg = new byte[200];
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 9999);
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		dataSocket.send(outPacket); // DatagramPacket�� ����
		dataSocket.receive(inPacket); // DatagramPacket�� ����
		
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
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
