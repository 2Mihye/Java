package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice1();
		pm2.practice2();
		pm2.practice3();
		pm2.practice4();
		pm2.practice5();
	}
	
	// StringBufferÀ» È°¿ëÇÏ¿© ¹®ÀÚ¿­ µ¡ºÙÀÌ°í Ãâ·Â append
	public void practice1() {
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); // Àú³áÀº ¹¹¸ÔÁö
		sb.append("Àú³áÀº ");
		sb.append("¹¹¸ÔÁö");
		
		System.out.println("append : " + sb.toString());
	}
	
	
	// ¹®ÀÚ¿­ µÚÁı±â "¿À´Ã Àú³áÀº ¹¹¸ÔÁö" reverse
	public void practice2() {
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		str.reverse();
		System.out.println("reverse : " + str.toString());
	}
	
	
	// ¹®ÀÚ¿­ »ğÀÔ insert ? ¤¾¤¾
	public void practice3() {
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		// String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		// StringBuffer sb = new StringBuffer(str) È¤Àº new StringBuffer("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		str.insert(10, "?¤¾¤¾");
		System.out.println("insert : " + str.toString());
	}
	
	
	// ¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
	public void practice4() {
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer sb = new StringBuffer(str);
		sb.replace(7, 9, "Ä¡Å²ÅÙ´õ");
		System.out.println("replace : " + sb.toString());
	}

	
	// ¹®ÀÚ¿­ »èÁ¦ delete(,,);
	public void practice5() {
		StringBuffer str = new StringBuffer("¿À´Ã Àú³áÀº ¹¹¸ÔÁö");
		str.delete(2, 5);
		System.out.println("delete : " + str.toString());
	}
}
