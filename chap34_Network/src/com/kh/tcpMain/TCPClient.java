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
			// ���� �ּҿ� ��Ʈ ��ȣ�� ���� ����
			// ���� �ּҿ� ��Ʈ ��ȣ�� ���� �����ϰ��� �ϴ� ��Ʈ�� �����ؾ� ��
			Socket socket = new Socket("localHost", 8080);
			System.out.println("[ Server Connect ]");
			
			
			// ���� �� �ڵ�
			OutputStream outStream = socket.getOutputStream(); // OutputStream import
			PrintStream printStream = new PrintStream(outStream); // PrintStream import
			printStream.print("HIIIIIII SERVERRRRRRRR");
			printStream.flush();
			
			// �����κ��� �о��
			InputStream inStream = socket.getInputStream(); // InputStream import
			Scanner sc = new Scanner(inStream); // Scanner import
			System.out.println("[ Client ] server" + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server, See ya!");
			
			
			
		/*	
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// ���� �Ǵ��� �׽�Ʈ �޼���
			out.println("�ȳ� ����?");
			
			// �����κ��� �޼��� ���޵Ǵ��� Ȯ�� �׽�Ʈ
			String response = in.readLine();
			System.out.println("���� ���� : " + response);
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
