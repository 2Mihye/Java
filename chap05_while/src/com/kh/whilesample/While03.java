package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		int i = 1;
		while (i <= 10) { // 숫자가 특정숫자가 되면 출력을 멈추고 싶을 때
			System.out.println(i); // 위 조건이 참일 경우에만 출력을 함
			i = ++i;
			// i++ 일 때 i가 1 값을 먼저 대입했기 때문에 ++가 작동하지 않아서 무한루프가 발생
			// ++i 일 때는 i에 1을 먼저 더했기 때문에 1~10까지 출력 가능하고 무한루프가 발생하지 않음
		}
		
	}

}
