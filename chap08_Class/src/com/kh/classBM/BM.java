package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM {
	// public static void main(String[]  args) { // Java프로그램의 시작점이라 
		// A생성자를 classBM에서 만들고 싶어!
	public void main() { // 위에 extends때문에 이렇게 사용함
		publicMethod();
		protectedMethod(); // 같은 패키지 안에서 무언가를 해야지만 사용 가능! main 메서드에서 직접 호출을 하거나 뭔가를 통해 호출을 해야 함
						   //접근 제한자를 가지고 있어서 같은 패키지 내에서 호출이 가능하지만 extends를 사용해서 호출을 한다.
		
		// defaultMethod(); 같은 패키지 안에서만 사용이 가능하므로 다른 패키지라 사용 불가능
	}

}
