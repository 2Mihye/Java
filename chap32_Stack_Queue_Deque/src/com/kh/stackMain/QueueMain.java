package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		// 큐(Queue) 생성
		Queue<String> queue = new LinkedList<>();
		
		// 큐(Queue)에 요소 추가
		queue.offer("Apple");
		queue.offer("banana");
		queue.offer("cherry");
		
		/*
		 *    Front               Rear(tail)
		 *      | (나오는부분)         | (들어가는 부분)
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
		
		
		// 큐(Queue)에서 요소 추출 및 출력 (FIFO 순서대로 출력)
		String removedElement = queue.poll(); // 큐(Queue)에서 Apple 제거하고 반환
		System.out.println(removedElement);
		removedElement = queue.poll(); // Banana 제거하고 반환
		
		// 큐(Queue) Front 요소 확인 (제거하지 않고 확인만 함)
		String frontElement = queue.peek(); // queue의 front요소 Cherry 반환
		
		// 큐(Queue)의 크기 확인 :  queue.size();
		int size = queue.size();
		System.out.println("size : " + size);// Cherry 하나 남아서 1 반환
		

		while(!queue.isEmpty()) {
			String element = queue.poll();
			System.out.println(element);
		}
	}

}
