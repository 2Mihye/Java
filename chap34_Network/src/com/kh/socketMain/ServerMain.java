package com.kh.socketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		// ���� ���� ����
		ServerSocket serverSocket = new ServerSocket(1004); // ServerSocket import -> throw
		System.out.println("������ ���۵Ǿ����ϴ�.");
		
		// Ŭ���̾�Ʈ ���� ���
		Socket clientSocket = serverSocket.accept(); // Socket import
		System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
		
		// Ŭ���̾�Ʈ�κ��� �����͸� �ޱ� ���� �Է� ��Ʈ�� ����
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));// BufferedReader import -> InputStreamReader import
		
		// Ŭ���̾�Ʈ�κ��� �����͸� ������ ���� ��� ��Ʈ�� ����
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // PrintWriter import
		String clientMsg;
		while((clientMsg = in.readLine()) != null) {
			System.out.println("Ŭ���̾�Ʈ�� ��ȭ : " + clientMsg);
			
			// Ŭ���̾�Ʈ���� ���� ����
			out.print("������ ���� ���� : " + clientMsg);
		}
		
		// Ŭ���̾�Ʈ���� ���� ����
		clientSocket.close();
		serverSocket.close();
	}

}
