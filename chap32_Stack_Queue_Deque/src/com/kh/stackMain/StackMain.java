package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack 값 추가 : stack.push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		/*
		 |       |
		 |   3   | // stack.push(3)
		 |   2   | // stack.push(2)
		 |___1___| // stack.push(1)
		 */
		
		// stack 값 삭제 : stack.pop();
		System.out.println(stack.pop()); // 3 제거
		System.out.println(stack.pop()); // 2 제거
		
		// stack 전체 값 제거, 초기화 : stack.clear();
		stack.clear();
		
		// stack 가장 상단의 값 (가장 마지막에 넣은 값) 출력 : stack.peek();
		stack.peek();
		
		// stack의 크기 출력 : stack.size();
		stack.size();
		
		// stack이 비어있는지 확인 : stack.empty(); -> 비어있으면 true, 하나라도 있으면 false
		stack.empty();
		
		// stack에 1이 있는지 확인하고 1이 있다면 true : stack.contains(1);
		stack.contains(1);
	}

}
