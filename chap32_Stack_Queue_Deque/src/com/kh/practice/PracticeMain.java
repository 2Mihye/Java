package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		// pm.PracticeStack();
		pm.PracticeQueue();

	}
	
	public void PracticeStack() {
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

	public void PracticeQueue() {
		// ť(Queue)�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(2);
		queue.offer(11);
		queue.offer(10);
		queue.offer(9);
		
		// ��� ����
		int removedElement = queue.poll();
		System.out.println("removedElement : " + removedElement);
		removedElement = queue.poll();
		
		// ��� Ȯ��
		int frontElement = queue.peek();
		System.out.println("frontElement : " + frontElement);
		
		// ũ�� Ȯ��
		System.out.println("size : " + queue.size());
		
		while (!queue.isEmpty()) {
			int element = queue.poll();
			System.out.println(element);
		}
	}
}
