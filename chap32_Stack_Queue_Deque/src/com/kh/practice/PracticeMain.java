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
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		Stack<String> stack = new Stack<>();
		
		stack.push("짱구");
		stack.push("철수");
		stack.push("훈이");
		stack.push("맹구");
		stack.push("유리");
		stack.push("나미리");
		
		System.out.println(stack.pop()); // stack 마지막 값(나미리) 삭제
		
		System.out.println(stack.peek()); // stack에 남아있는 마지막 값 확인
		
		System.out.println(stack.size()); // stack 크기 확인
		
		System.out.println(stack.empty()); // stack이 비어있는지 확인.
		
		System.out.println(stack.contains("훈이")); // stack에 (훈이)가 포함되어있는지 확인
		
		stack.clear(); // stack 비우기
		
		System.out.println(stack.empty()); // stack 비어있는지 확인
	}

	public void PracticeQueue() {
		// 큐(Queue)에 요소 추가 반환 삭제하고 while 사용해보기
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(2);
		queue.offer(11);
		queue.offer(10);
		queue.offer(9);
		
		// 요소 추출
		int removedElement = queue.poll();
		System.out.println("removedElement : " + removedElement);
		removedElement = queue.poll();
		
		// 요소 확인
		int frontElement = queue.peek();
		System.out.println("frontElement : " + frontElement);
		
		// 크기 확인
		System.out.println("size : " + queue.size());
		
		while (!queue.isEmpty()) {
			int element = queue.poll();
			System.out.println(element);
		}
	}
}
