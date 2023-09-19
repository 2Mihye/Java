package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// ť(Queue) ����
		Queue<String> queue = new LinkedList<>();
		
		// ť(Queue)�� ��� �߰�
		queue.offer("Apple");
		queue.offer("banana");
		queue.offer("cherry");
		
		/*
		 *    Front               Rear(tail)
		 *      | (�����ºκ�)         | (���� �κ�)
		 *      v                   v
		 *    +---+     +---+     +---+
		 *    | 1 | <-  | 2 | <-  | 3 |
		 *    +---+     +---+     +---+   
		 *    
		 * ========================================
		 * 
		 *      | 
		 *      v
		 * +----------+
		 * |  cherry  |
		 * |  banana  |
		 * |          |
		 * +----------+
		 *      |
		 *      v
		 *    apple
		 */
		
		
		// ť(Queue)���� ��� ���� �� ��� (FIFO ������� ���)
		String removedElement = queue.poll(); // ť(Queue)���� Apple �����ϰ� ��ȯ
		System.out.println(removedElement);
		removedElement = queue.poll(); // Banana �����ϰ� ��ȯ
		
		// ť(Queue) Front ��� Ȯ�� (�������� �ʰ� Ȯ�θ� ��)
		String frontElement = queue.peek(); // queue�� front��� Cherry ��ȯ
		
		// ť(Queue)�� ũ�� Ȯ�� :  queue.size();
		int size = queue.size();
		System.out.println("size : " + size);// Cherry �ϳ� ���Ƽ� 1 ��ȯ
		

		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
	}

}
