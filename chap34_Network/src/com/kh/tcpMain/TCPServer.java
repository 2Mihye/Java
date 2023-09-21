package com.kh.tcpMain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("Server Waiting!");
			
			// 만약 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드 작성
			while(true) {
				// 클라이언트와 연결 대기하는 코드
				Socket client = serverSocket.accept();
				System.out.println("connect Client");
				
				// 읽어올 때 코드
				InputStream inStream = client.getInputStream(); // InputStream import
				Scanner sc = new Scanner(inStream); // Scanner import
				System.out.println("Server | Client : " + sc.nextLine());
				
				OutputStream outStream = client.getOutputStream(); // OutputStream import
				PrintStream printStream = new PrintStream(outStream);
				printStream.print("Hi Client ");
				System.out.println("Server | Client ");
				printStream.flush(); // 버퍼의 데이터를 한 번에 쏟아냄
				
				client.close(); // Client와 연결만 해지
				System.out.println("Server " + client.getInetAddress().getHostAddress());
				
				// 만약 서버는 무한대로 실행이 되어야 하지만 실행 제한을 주고 싶을 떄
				int count = 0;
				if(count > 7) {
					serverSocket.close(); // Server를 죽임
					System.out.println("Server Close");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
