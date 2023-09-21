package com.kh.jUnit.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayPracticeTest {
	private ArrayPractice arrp;
	
	@Test
	public void testArrayP1() {
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		// int[] actual = {1,2,3,4,5,6,7,8};
		ArrayPractice ap = new ArrayPractice(10);
		// int[] result = ap.practice1();
		assertArrayEquals(expected, ap.getArray());
	}
	
	@Test
	public void testArrayP2() {
		int[] expected = {1,2,3,5,6,7,8,9,10};
		// int[] actual = {0,1,2,3,4,5,6,7,8,9};
		ArrayPractice ap = new ArrayPractice(10);
		assertNotEquals(expected, ap.getArray());
	}
	
	@Test
	public void testArrayP3() {
		int[] expected = null;
		int[] actual = null;
		assertArrayEquals(expected, actual);
		
	}
}
