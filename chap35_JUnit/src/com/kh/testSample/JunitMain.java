package com.kh.testSample;

import static org.junit.Assert.*; // 굳이 import를 여러개 둘 필요 없이 * 하나로 바꿔준다.


import org.junit.Test;

public class JunitMain {

	@Test // 아래 객체 생성 후 클릭해서 JUnit import
	public void testStringEqual() {
		String expected = "Hello, World!";
		String actual = "Hellow, World!";
		assertEquals(expected, actual); // assertEquals import
	}
	
	@Test
	public void testStringInequal() {
		String expected = "Hello, Java!";
		String actual = "Hello, World!";
		assertNotEquals(expected, actual); // assertNotEquals import
	}
	
	// Test는 Main 메서드 만들지 않는다!
	
	@Test
	public void testArrayEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual); // 배열 비교 assertArrayEquals import
	}
	
	@Test
	public void testArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual); // 배열이 다르다는 것을 검증
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertEquals(expected, actual, 0.001); // 부동소수점 비교(오차범위를 맨 위에 지정)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected, actual, 0.001); // 부동 소수점이 다르다는 것을 검증(오차범위 지정)
	}
}
