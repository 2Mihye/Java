package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		/*try {*/
			// 서버 주소와 포트 번호로 소켓 생성
			// 서버 주소와 포트 번호는 내가 연결하고자 하는 포트와 동일해야 함
			Socket socket = new Socket("localHost", 8080);
			System.out.println("[ Server Connect ]");
			
			
			// 보낼 때 코드
			OutputStream outStream = socket.getOutputStream(); // OutputStream import
			PrintStream printStream = new PrintStream(outStream); // PrintStream import
			printStream.print("HIIIIIII SERVERRRRRRRR");
			printStream.flush();
			
			// 서버로부터 읽어옴
			InputStream inStream = socket.getInputStream(); // InputStream import
			Scanner sc = new Scanner(inStream); // Scanner import
			System.out.println("[ Client ] server" + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server, See ya!");
			
			
			
		/*	
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 서버 되는지 테스트 메세지
			out.println("안녕 서버?");
			
			// 서버로부터 메세지 전달되는지 확인 테스트
			String response = in.readLine();
			System.out.println("서버 응답 : " + response);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
