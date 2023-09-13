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
		// world�� Java�� ��ü�ϰ� ���
		String reInput = input.replace("world", "Java");
		System.out.println(reInput);
	}

	// o�� �����ִ� ���ڿ��� x�� ġȯ(����)�ϱ�
	public void replace3() {
		String originalName = "Hello World";
		String reName = originalName.replace("o", "x");
		System.out.println("o�����ִ� ���ڿ� x�� ġȯ : " + reName);
		
	}
	
	// fox�� cat���� �ٲٱ�
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reString = originString.replace("fox", "cat");
		System.out.println("fox�� cat���� �ٲٱ� : " + reString);
		
	}
	
	// ��� ���� �����ϱ�
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reString = originString.replace(" ", "");
		System.out.println("��� ���� ���� : " + reString);
		//String reAllString = originString.replaceAll("\\s", "");
		//System.out.println("��� ���� ���� : " + reAllString); 
	}
	
	// replace ��� replaceAll�� �̿��Ͽ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
	public void replaceAll() {
		String originString = "Hello World";
		String reAllstr = originString.replaceAll("(?i)world", "java");
		System.out.println("replaceAll : " + reAllstr);
	}
}
