package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

// UDP ���� Ŭ����
public class UDPClient {
	// start()�� UDP ������ �����ϴ� �޼���� ����ó�� �ʿ�
	public void start() throws Exception {
		// ���� ���� UDP ����� �̷���.
		DatagramSocket dataSocket = new DatagramSocket();
		
		// .getAllByName���� ���� ������ �� �� �����Ƿ� All�� ���� Ȯ���� ��!
		InetAddress serverAddress = InetAddress.getByName("127.0.0.1"); // ������ �����ϱ� ���� ������ ����
		//127.0.0.1 = localhost Ŭ���̾�Ʈ�� ������ ���� ��ǻ�Ϳ��� ���� ���� ������ �����ϰ� ��Ʈ ��ȣ ������ �������� �����ϰ�, �������� ������ ��Ʈ�� ��
		
		//�����Ͱ� ����� ������ ������ ������ ũ��� byte �迭 ����
		byte[] msg = new byte[200];
		
		// ������ �����͸� ������ ���� ���� 
		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 9999);
		// �����κ��� �����͸� �����ϱ� ���� ����
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
		
		dataSocket.send(outPacket); // DatagramPacket�� ����
		dataSocket.receive(inPacket); // DatagramPacket�� ����
		
		// ���ŵ� �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ���� �ð��� ���
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		
		// Ŭ���̾�Ʈ�� ������ �ݾƼ� ������ ����
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
