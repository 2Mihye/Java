package com.kh.stackMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {
	/*
			   ����                       ��
			    |                        |
			    v                        v
			 [First] <-> [Second] <-> [Third]
	      ^                                     ^
	      |                                     |
	   [     ]                               [     ]
	 */

	public static void main(String[] args) {
		// ArrayDequeue ����Ͽ� Dequeue ����
		Deque<String> deque = new ArrayDeque<>(); // import
		
		// ��� �߰�
		deque.addFirst("First");
		deque.addLast("Last");

		// �� �հ� �� �� ��� Ȯ��
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		// �� �հ� �� �� ��� ����
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
		
		// ����ִ��� Ȯ��
		System.out.println(deque.isEmpty());
	}

}