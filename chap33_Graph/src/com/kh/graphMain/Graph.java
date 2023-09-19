package com.kh.graphMain;

import java.util.LinkedList;
/*
 Graph Class : 인접리스트를 사용하여 노드와 간선을 저장한다.
 */
public class Graph {
	private int V; // 그래프의 노드 수
	private LinkedList<Integer>[] adjList; // 인접리스트 배열
	// adjList : 인접 리스트를 저장하는 배열로 각 노드마다 연결된 노드들을 저장하기 위해 LinkedList 객체 배열로 초기화 한다.
			
	// 그래프 생성자 : 그래프 크기(노드 수)를 받아와서 그래프를 초기화하고 adjList 배열의 각 원소를 빈 LinkedList로 초기화

	public Graph (int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// addEdge : 그래프에 새로운 간선(노드)를 추가
	public void addEdge (int source, int des) {
		// source에서 des로 가는 Edge를 추가하면 adjList 배열에서 source에 해당하는 LinkedList에 des(목적지)를 추가한다.
		adjList[source].add(des);
	}
	
	// 그래프 탐색(깊이 우선 탐색) : 깊이 우선 탐색을 수행하고, 시작 노드를 매개변수로 받는다.
	public void DFS(int startNode) {
		// 방문 여부를 추적하기 위한 visited 배열초기화
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
