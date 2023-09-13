package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain reMain = new ReplaceMain();
		
		// reMain.replace1();
		// reMain.replace2();
		reMain.replace3();
		reMain.replace4();
		reMain.replace5();
		reMain.replaceAll();
	}
	
	public void replace1() {
		String input = "Hello, World!";
		String reInput = input.replace(" ", "-");
		System.out.println("reInput : " + reInput);

		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+ input2);
	}
	
	public void replace2() {
		String input = "Hello world!";
		// world를 Java로 교체하고 출력
		String reInput = input.replace("world", "Java");
		System.out.println(reInput);
	}

	// o로 적혀있는 문자열들 x로 치환(변경)하기
	public void replace3() {
		String originalName = "Hello World";
		String reName = originalName.replace("o", "x");
		System.out.println("o적혀있는 문자열 x로 치환 : " + reName);
		
	}
	
	// fox를 cat으로 바꾸기
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reString = originString.replace("fox", "cat");
		System.out.println("fox를 cat으로 바꾸기 : " + reString);
		
	}
	
	// 모든 공백 제거하기
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reString = originString.replace(" ", "");
		System.out.println("모든 공백 제거 : " + reString);
		//String reAllString = originString.replaceAll("\\s", "");
		//System.out.println("모든 공백 제거 : " + reAllString); 
	}
	
	// replace 대신 replaceAll을 이용하여 대소문자 구분없이 문자열 치환하기
	public void replaceAll() {
		String originString = "Hello World";
		String reAllstr = originString.replaceAll("(?i)world", "java");
		System.out.println("replaceAll : " + reAllstr);
	}
}
