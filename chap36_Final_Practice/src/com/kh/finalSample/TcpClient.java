package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient { // 메서드를 하나 만들어줘야 함.

	public static void main(String[] args) {
	int port = 1010;
	String serverIP;
	
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP, port);
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		String userInputString;
		while((userInputString = userInput.readLine()) != null) {
			// 사용자 입력을 서버로 전송하겠습니다
			out.println(userInputString);
			
			// 서버로부터 받은 응답 출력
			String serverResponse = in.readLine();
			System.out.println(serverResponse);
		}
	} catch(Exception e){
		e.printStackTrace();
	}
	}
}







/*
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient { // 메서드를 하나 만들어줘야 함.
	int port = 3333;
	String serverIP;
	
	try {
		serverIP = InetAddress.getLocalHost().getHostAddress();
		Socket socket = new Socket(serverIP, port);
	} catch(Exception e){
		e.printStackTrace();
	}
}
*/