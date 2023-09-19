package com.kh.practice;

import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		Stack<String> stack = new Stack<>();
		
		stack.push("¯��");
		stack.push("ö��");
		stack.push("����");
		stack.push("�ͱ�");
		stack.push("����");
		stack.push("���̸�");
		
		System.out.println(stack.pop()); // stack ������ ��(���̸�) ����
		
		System.out.println(stack.peek()); // stack�� �����ִ� ������ �� Ȯ��
		
		System.out.println(stack.size()); // stack ũ�� Ȯ��
		
		System.out.println(stack.empty()); // stack�� ����ִ��� Ȯ��.
		
		System.out.println(stack.contains("����")); // stack�� (����)�� ���ԵǾ��ִ��� Ȯ��
		
		stack.clear(); // stack ����
		
		System.out.println(stack.empty()); // stack ����ִ��� Ȯ��

	}

}
