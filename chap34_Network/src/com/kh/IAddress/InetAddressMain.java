package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) {
		InetAddressMain iam = new InetAddressMain();
		// iam.InetExam();
		iam.InetSample();
		
	}
	
	public void InetExam() {
		try {
			// ȣ��Ʈ �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP �ּ� ���
			System.out.println("Hos Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			// ���� ȣ��Ʈ�� InetAddress ��ü ��� -> ���� ����ϴ� ��ǻ���� InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
			InetAddress address1 = InetAddress.getByName("www.naver.com");
			System.out.println("Hos Name : " + address1.getHostName());
			System.out.println("IP Address : " + address1.getHostAddress());
			
			InetAddress address2 = InetAddress.getByName("www.daum.net");
			System.out.println("Hos Name : " + address2.getHostName());
			System.out.println("IP Address : " + address2.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void InetSample() {
		// ȣ��Ʈ �̸��� �����ͼ� ��ü ����
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			// IP �ּҸ� byte �迭�� �б�
			// InetAddress ��ü���� IP �ּҸ� ����Ʈ �迭�� ����
			// IP �ּҸ� byte �迭�� ������ �� ����Ʈ�� ���� IP �ּҸ� �ٷ� �� �ִ�.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address�� byte�� ����"); // while�̳� for�� ��� ����
			for(byte ip : ipAddress) {
				System.out.println(ip + ".");
			}
			System.out.println();
			
			// ������ ���� ������ ��� ȣ��Ʈ�� IP �ּҸ� �迭�� ���
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("���ۿ� ������ ��� ȣ��Ʈ�� ������ �ּҸ� �迭�� ����");
			for (InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}