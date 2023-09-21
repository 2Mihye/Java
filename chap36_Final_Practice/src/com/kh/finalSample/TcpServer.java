package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	
public static void main(String[] args) {
	int port = 1010;
	
	try {
		ServerSocket server = new ServerSocket(port);
		System.out.println("������ ���۵Ǿ����ϴ�.");
		while(true) {
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "�� �����߽��ϴ�.");
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			OutputStream outStream = client.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			server.close();
			System.out.println("������ �������ϴ�.");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		

}
}





/*
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	int port = 3333;
	
	ServerSocket server;
	
	server = new ServerSocket(port);
	
	while(true) {
		Socket client = server.accept();
	}
	
}
*/

/* >>>>>>>>>>>>>>>>>>>������ Ǯ��<<<<<<<<<<<<<<<<<<<<<<<<
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		int port = 3333;
		
		ServerSocket server;
		
		server = new ServerSocket(port);
		System.out.println("������ ��Ʈ" + port + "���� ���� ���Դϴ�.");
		while(true) {
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ ����: " + client.getInetAddress());
			client.close();
		}
	}
}
*/

