package com.kh.Practice;

import java.util.LinkedList;

public class PracticeDFSGraph {
	private int K;
	private LinkedList<Integer>[] adjList; // 인접리스트 배열
	
	public PracticeDFSGraph (int ver) {
		K = ver;
		adjList = new LinkedList[ver];
		for (int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge (int source, int destination) {
		adjList[source].add(destination);
	}
	
	public void DFS (int startNode) {
		boolean[] visited = new boolean[K];
		DFSUtil(startNode, visited);
	}
	
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.println(currentNode + " ");
		
		for (int neighbor : adjList[currentNode]) {
			if (!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}

}
