package com.kh.stackMain;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// stack �� �߰� : stack.push();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		/*
		 |       |
		 |   3   | // stack.push(3)
		 |   2   | // stack.push(2)
		 |___1___| // stack.push(1)
		 */
		
		// stack �� ���� : stack.pop();
		System.out.println(stack.pop()); // 3 ����
		System.out.println(stack.pop()); // 2 ����
		
		// stack ��ü �� ����, �ʱ�ȭ : stack.clear();
		stack.clear();
		
		// stack ���� ����� �� (���� �������� ���� ��) ��� : stack.peek();
		stack.peek();
		
		// stack�� ũ�� ��� : stack.size();
		stack.size();
		
		// stack�� ����ִ��� Ȯ�� : stack.empty(); -> ��������� true, �ϳ��� ������ false
		stack.empty();
		
		// stack�� 1�� �ִ��� Ȯ���ϰ� 1�� �ִٸ� true : stack.contains(1);
		stack.contains(1);
	}

}
