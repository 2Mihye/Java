package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		PracticeGraphMain pgm = new PracticeGraphMain();
		// pgm.DFSPracticeMain();
		pgm.BFSPracticeMain();
	}
	
	public void DFSPracticeMain() {
		int ver = 9;
		PracticeDFSGraph pg = new PracticeDFSGraph(ver);
		
		pg.addEdge(0, 1);
		pg.addEdge(1, 3);
		pg.addEdge(3, 5);
		pg.addEdge(1, 6);
		pg.addEdge(5, 8);
		pg.addEdge(6, 7);

		System.out.println("BFS Ž�� ��� : ");
		
		pg.DFS(0);
	}
	
	public void BFSPracticeMain() {
		// Graph ����
		BFSGraph bfs = new BFSGraph(9);
		// ���� �߰�
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 3);
		bfs.addEdge(1, 7);
		bfs.addEdge(2, 4);
		bfs.addEdge(2, 5);
		bfs.addEdge(4, 6);
		bfs.addEdge(6, 8);
		
		System.out.println("Ž�� ��� : ");
		
		// ���� ��� 0
		bfs.BFS(0);
	}

}
