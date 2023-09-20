package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	private int V; // �׷����� ���� ��
	private LinkedList<Integer>[] adj; // ���� ����Ʈ
	
	//�׷��� Ŭ���� �����ڿ��� ���� ��V�� �޾� �ʱ�ȭ �ϰ� ������ �������� �������
	public BFSGraph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	// addEdge �׷����� ���� �߰��ϰ�, v�� w�� ������ �� �� ������ ��Ÿ��
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	// BFS Ž�� ����
	public void BFS(int start) {
		// visited �迭�� �� ������ �湮 ���� ����
		boolean[] visited = new boolean[V]; // �湮���� ǥ�� �迭
		// BFS�� ���� ������ ������ ���
		Queue<Integer> queue = new LinkedList<>();
		// Ž���� start��忡�� �����ϰ� �� �Ŀ� ť�� �߰�
		visited[start] = true;
		queue.add(start);
		// ť�� ����� ������ �ݺ������� ���� �ܰ迡 ������ ��� �湮
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start + " ");
			for (Integer neighbor : adj[start]) {
				if(!visited[neighbor]) {
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}
