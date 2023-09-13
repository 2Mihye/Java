package com.kh.wrapperPractice;

public class WrapperPractice1 {

	public static void main(String[] args) {
		// String을 기본자료형으로 바꾸기
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2");
		boolean bool = Boolean.parseBoolean("true");
		char c = "abc".charAt(0);
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		
	}

}
