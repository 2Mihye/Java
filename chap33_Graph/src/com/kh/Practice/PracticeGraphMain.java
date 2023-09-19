package com.kh.Practice;

public class PracticeGraphMain {

	public static void main(String[] args) {
		int ver = 9;
		PracticeGraph pg = new PracticeGraph(ver);
		
		pg.addEdge(0, 1);
		pg.addEdge(1, 6);
		pg.addEdge(6, 7);
		pg.addEdge(6, 8);

		System.out.println("DFS Å½»ö °á°ú : ");
		
		pg.DFS(0);
	}

}
