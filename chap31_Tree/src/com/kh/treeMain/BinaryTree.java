package com.kh.treeMain;
/*
 ��带 �����ϰ� ���ư��鼭 ����ϴ� ���� Ʈ��
 ���� ��ȸ(Pre-order traversal;Depth-First Search; ���� �켱 Ž��) : root(�Ѹ�)�� ���� ���� �湮
 ���� ��ȸ(In-order traversal;Depth-First Search; ���� �켱 Ž��) : �� �� ���� Ʈ���� �湮 �� root(�Ѹ�)�� �湮
 ���� ��ȸ(Post-order traversal;Depth-First Search; ���� �켱 Ž��): ���� Ʈ�� ��� �湮 �� root(�Ѹ�)�� �湮
 ���� ��ȸ(Level-order traversal;Breadth-First Search�ʺ� �켱 Ž��) : �� �� node�� ���� �Ʒ� �������� ���ʴ�� �湮
 */
public class BinaryTree {
	TreeNode root;
	public BinaryTree() {
		this.root = null;
	}
	
	
	// insert �޼���� insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴ� �� ���ȴ�.
	 
	
	public void insert(int data) { // insert �ܺο� ����Ǵ� �޼���
		root = insertRec(root, data);
	}
	
	private TreeNode insertRec(TreeNode root, int data) { // insertRec ���� ���� �۾� �޼���� ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 �����Ѵ�.
		// ����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���� ����
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
	
	public void inOrderT() { // in order traversal : ���� ��ȸ
		inOrderTR(root);
	}
	
	public void inOrderTR(TreeNode root) { // ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴ� �� ���ǰ� ���� ����Ʈ��, ���� ���, ������ ����Ʈ�� ������ ��� ���
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
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT();
	}

}
