package com.kh.treeMain;
/*
 노드를 삽입하고 돌아가면서 출력하는 이진 트리
 전위 순회(Pre-order traversal;Depth-First Search; 깊이 우선 탐색) : root(뿌리)를 가장 먼저 방문
 중위 순회(In-order traversal;Depth-First Search; 깊이 우선 탐색) : 왼 쪽 하위 트리를 방문 후 root(뿌리)를 방문
 후위 순회(Post-order traversal;Depth-First Search; 깊이 우선 탐색): 하위 트리 모두 방문 후 root(뿌리)로 방문
 층별 순회(Level-order traversal;Breadth-First Search너비 우선 탐색) : 위 쪽 node들 부터 아래 방향으로 차례대로 방문
 */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
	}
	
	
	// insert 메서드와 insertRec 메서드는 이진 트리에 새로운 노드를 삽입하는 데 사용된다.
	 
	
	public void insert(int data) { // insert 외부에 노출되는 메서드
		root = insertRec(root, data);
	}
	
	private TreeNode insertRec(TreeNode root, int data) { // insertRec 실제 삽입 작업 메서드로 재귀적으로 노드를 삽입하고 적절한 위치를 찾아 새로운 노드를 생성한다.
		// 재귀적 : 자기 자신을 포함하고 다시 자기 자신을 사용해서 정의 내림
		if ( root == null ) {
			root = new TreeNode(data);
			return root;
		}
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data >  root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	public void inOrderT() { // in order traversal : 중위 순회
		inOrderTR(root);
	}
	
	public void inOrderTR(TreeNode root) { // 중위 순회를 수행하여 트리의 노드를 출력하는 데 사용되고 왼쪽 서브트리, 현재 노드, 오른쪽 서브트리 순서로 노드 출력
		if (root != null) {
			inOrderTR(root.left);
			System.out.println(root.data + " ");
			inOrderTR(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		System.out.println("이진 트리의 중위 순회 결과 : ");
		tree.inOrderT();
	}

}
