package com.kh.Practice;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
	private int V; // 그래프의 정점 수
	private LinkedList<Integer>[] adj; // 인접 리스트
	
	//그래프 클래스 생성자에서 정점 수V를 받아 초기화 하고 인접한 정점들의 목록저장
	public BFSGraph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	// addEdge 그래프에 간선 추가하고, v와 w가 간선의 양 끝 정점을 나타냄
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	// BFS 탐색 수행
	public void BFS(int start) {
		// visited 배열이 각 정점의 방문 여부 추적
		boolean[] visited = new boolean[V]; // 방문여부 표시 배열
		// BFS를 위한 데이저 구조로 사용
		Queue<Integer> queue = new LinkedList<>();
		// 탐색은 start노드에서 시작하고 그 후에 큐에 추가
		visited[start] = true;
		queue.add(start);
		// 큐가 비어질 떄까지 반복적으로 다음 단계에 인접한 노드 방문
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
