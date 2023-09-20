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
			// 호스트 이름 이용해서 객체 생성
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP 주소 출력
			System.out.println("Hos Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			// 현재 호스트의 InetAddress 객체 얻기 -> 내가 사용하는 컴퓨터의 InetAddress 객체 얻기
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
		// 호스트 이름을 가져와서 객체 생성
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP 주소를 byte 배열로 읽기
			// InetAddress 객체에서 IP 주소를 바이트 배열로 얻음
			// IP 주소를 byte 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰 수 있다.
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address를 byte로 얻음"); // while이나 for문 사용 가능
			for(byte ip : ipAddress) {
				System.out.println(ip + ".");
			}
			System.out.println();
			
			// 도메인 명에 지정된 모든 호스트의 IP 주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.println("구글에 지정된 모든 호스트의 아이피 주소를 배열로 얻음");
			for (InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			// 호스트 이름 얻기
			String hostName  = address.getHostName();
			System.out.println("Host Name : " + hostName);	
			
			// 지역 호스트의 IP 주소 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			// 멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? " + isMultiCast);
			
			// 호스트 이름을 이용하여 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.google.com");
			System.out.println("IP 주소 이름 : "  + name.getHostAddress());
			
			// 호스트의 완전한 이름 가져오기 (전체 도메인 이름)
			// 호스트의 정규화된 (FQDN) 도메인의 이름을 얻음
			// FQDN(Full Qualified Domain Name)
			String hostFullName = name.getCanonicalHostName();
			System.out.println("Full Name : " + hostFullName);
			
			// LoopBack 주소 여부 확인
			boolean isLoopBack = address.isLoopbackAddress();
			System.out.println("뤂백인가요? " + isLoopBack);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
