package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* System.out.println("나이를 입력해 주세요. : ");
		int age = sc.nextInt(); // 정수만 받는 next
		System.out.println("내 나이는 " + age + "살 입니다.");
		
		String name;
		int phoneNumber;
		
		System.out.println("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.println("당신의 번호를 입력하세요. : ");
		phoneNumber = sc.nextInt(); // -넣지 않기
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " + phoneNumber + " 입니다.");
		*/
		
		// 내 취미와 내가 좋아하는 음식과 내 주소 출력하기
		String hobby, food, address;
		System.out.println("당신의 취미는? : ");
		hobby = sc.next(); // 공백을 받지 않음 붙여쓰는 것만 가능!
		System.out.println("당신이 좋아하는 음식은? : ");
		food = sc.next();
		System.out.println("당신의 주소는? : ");
		address = sc.next();
		
		System.out.println("나의 취미는 " + hobby + "이고, 좋아하는 음식은 " + food + "입니다. 나의 주소는 " + address + "입니다.");
	
		String name1, name2;
	}

}
