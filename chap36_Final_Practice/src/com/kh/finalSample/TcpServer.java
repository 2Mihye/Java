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
		System.out.println("서버가 시작되었습니다.");
		while(true) {
			Socket client = server.accept();
			System.out.println(client.getInetAddress() + "가 접속했습니다.");
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			OutputStream outStream = client.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			server.close();
			System.out.println("서버가 닫혔습니다.");
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

/* >>>>>>>>>>>>>>>>>>>선생님 풀이<<<<<<<<<<<<<<<<<<<<<<<<
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws Exception {
		int port = 3333;
		
		ServerSocket server;
		
		server = new ServerSocket(port);
		System.out.println("서버가 포트" + port + "에서 실행 중입니다.");
		while(true) {
			Socket client = server.accept();
			System.out.println("클라이언트 접속: " + client.getInetAddress());
			client.close();
		}
	}
}
*/

