package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;

// BFS main �޼��� :  �׷����� BFS Ž���� �����ϰ�, �־��� ���� ���κ��� ��� ����� ��带 �ʺ� �켱���� Ž���Ѵ�.

public class BFSMain {
	public static void main(String[] args) {
		// Graph ����
		Graph g = new Graph(6);
		
		// ���� �߰�
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		
		System.out.println("Ž�� ��� : ");
		
		// BFS�� ���� ��� 0���� ȣ���ؼ� ����
		g.BFS(0);
		
		// ����� BFS�� Ž�� ����� ��� ������ ���
	}
}