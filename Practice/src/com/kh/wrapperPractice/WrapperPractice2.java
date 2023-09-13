package com.kh.wrapperPractice;

public class WrapperPractice2 {

	public static void main(String[] args) {
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();
		String f = Float.valueOf(0.1f).toString();
		String d = Double.valueOf(0.2).toString();
		String bool = Boolean.valueOf(true).toString();
		String ch = Character.valueOf('a').toString();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(ch);
	}

}
