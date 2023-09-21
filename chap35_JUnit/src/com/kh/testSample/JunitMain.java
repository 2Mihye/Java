package com.kh.testSample;

import static org.junit.Assert.*; // ���� import�� ������ �� �ʿ� ���� * �ϳ��� �ٲ��ش�.


import org.junit.Test;

public class JunitMain {

	@Test // �Ʒ� ��ü ���� �� Ŭ���ؼ� JUnit import
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
	
	// Test�� Main �޼��� ������ �ʴ´�!
	
	@Test
	public void testArrayEqual() {
		int[] expected = {1,2,3};
		int[] actual = {1,2,3};
		assertArrayEquals(expected, actual); // �迭 �� assertArrayEquals import
	}
	
	@Test
	public void testArrayInEqual() {
		int[] expected = {1,2,3};
		int[] actual = {3,2,1};
		assertArrayEquals(expected, actual); // �迭�� �ٸ��ٴ� ���� ����
	}
	
	@Test
	public void testDoubleEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.3;
		assertEquals(expected, actual, 0.001); // �ε��Ҽ��� ��(���������� �� ���� ����)
	}
	
	@Test
	public void testDoubleInEqual() {
		double expected = 0.1 + 0.2;
		double actual = 0.31;
		assertNotEquals(expected, actual, 0.001); // �ε� �Ҽ����� �ٸ��ٴ� ���� ����(�������� ����)
	}
}
