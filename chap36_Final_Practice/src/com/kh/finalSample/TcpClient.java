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


/*>>>>>>>>>>>>>>>선생님 풀이<<<<<<<<<<<<<<<<<<<<<<<
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient { // 메서드를 하나 만들어줘야 함.
	public static void main(String[] args) throws UnknownHostException {
		int port = 3333;
		String serverIP; // 내 아이피 주소
		
		serverIP = InetAddress.getLocalHost().getHostAddress(); // -> 우리가 사용하는 IP 주소를 자동으로 반환
		System.out.println("serverIP");
		try {
			// serverIP = InetAddress.getLocalHost().getHostAddress();
			// System.out.println("serverIP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			// 클라이언트와 통신을 위한 입출력 스트림 설정
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream(); // import
			
			// 클라이언트에서 서버로 메세지 전송
			String msg = "Hi, server";
			out.write(msg.getBytes());
			out.flush();
			
			socket.close();
			 
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
*/