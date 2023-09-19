package com.kh.graphMain;

import java.util.LinkedList;
/*
 Graph Class : ��������Ʈ�� ����Ͽ� ���� ������ �����Ѵ�.
 */
public class Graph {
	private int V; // �׷����� ��� ��
	private LinkedList<Integer>[] adjList; // ��������Ʈ �迭
	// adjList : ���� ����Ʈ�� �����ϴ� �迭�� �� ��帶�� ����� ������ �����ϱ� ���� LinkedList ��ü �迭�� �ʱ�ȭ �Ѵ�.
			
	// �׷��� ������ : �׷��� ũ��(��� ��)�� �޾ƿͼ� �׷����� �ʱ�ȭ�ϰ� adjList �迭�� �� ���Ҹ� �� LinkedList�� �ʱ�ȭ

	public Graph (int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// addEdge : �׷����� ���ο� ����(���)�� �߰�
	public void addEdge (int source, int des) {
		// source���� des�� ���� Edge�� �߰��ϸ� adjList �迭���� source�� �ش��ϴ� LinkedList�� des(������)�� �߰��Ѵ�.
		adjList[source].add(des);
	}
	
	// �׷��� Ž��(���� �켱 Ž��) : ���� �켱 Ž���� �����ϰ�, ���� ��带 �Ű������� �޴´�.
	public void DFS(int startNode) {
		// �湮 ���θ� �����ϱ� ���� visited �迭�ʱ�ȭ
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
	}
	
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.print(currentNode + " ");
		
		for (int neighbor : adjList[currentNode]) {
			if ( !visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
		
	}
}
