import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class BST {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {

		Node newNode = new Node(value);
		if (isEmpty()) {
			root = newNode;
		} else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else
						trav = trav.left;

				} else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else
						trav = trav.right;

				}
			}
		}
	}
	
	public void addNod(int value) { root = addnode(root, value); }
	public Node addnode(Node trav, int value) {
		if (trav == null) {
			return new Node(value);
		}
			  if (value < trav.data) {
			        trav.left = addnode(trav.left, value);
			    } else {
			        trav.right = addnode(trav.right, value);
			    }
		return trav;
	}
	
	


	private void preorder(Node trav) {
		if (trav == null) {
			return;
		}
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}

	public void preOrder() {
		System.out.print("PreOrder : ");
		preorder(root);
		System.out.println();

	}

	private void inorder(Node trav) {
		if (trav == null) {
			return;
		}
		inorder(trav.left);
		System.out.print(" " + trav.data);
		inorder(trav.right);
	}

	public void inOrder() {
		System.out.print("InOrder : ");
		inorder(root);
		System.out.println();
	}

	private void postorder(Node trav) {
		if (trav == null) {
			return;
		}
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(" " + trav.data);
	}

	public void postOrder() {
		System.out.print("PostOrder : ");
		postorder(root);
		System.out.println();
	}

	public void DFSTraversal() {

		Stack<Node> s = new Stack<BST.Node>();

		s.push(root);

		System.out.println("DFS TRAVERSAL : ");

		while (!s.isEmpty()) {

			Node trav = s.pop();

			System.out.print(trav.data);

			if (trav.right != null) {
				s.push(trav.right);
			}
			if (trav.left != null) {
				s.push(trav.left);
			}
		}
		System.out.println();
	}

	public void BFSTraversal() {
		Queue<Node> q = new LinkedList<BST.Node>();

		q.offer(root);

		System.out.println("BFS TRAVERSAL : ");

		while (!q.isEmpty()) {

			Node trav = q.poll();
			System.out.print(" " + trav.data);

			if (trav.left != null)
				q.offer(trav.left);

			if (trav.right != null)
				q.offer(trav.right);
		}
		System.out.println();
	}

	public boolean binarySearch(int key) {
		Node trav = root;
		while (!isEmpty()) {
			if (key == trav.data) {
				return true;
			}
			if (key < trav.data) {
				trav = trav.left;
			}
			if (key > trav.data) {
				trav = trav.right;
			}
		}
		return false;
	}

	
	public Node binaraysea(Node trav,int key) {
		
			if (key==trav.data || trav == null) {
				return trav;
			}
			if (key<trav.data) {
				binaraysea(trav.left, key);
			}
			if (key>trav.data) {
				binaraysea(trav.right, key);
			}
		
		return trav;
	}
	
	public void binary(int key) {
		  Node result = binaraysea(root, key);
		    if (result != null) {
		        System.out.println("Key " + key + " found in the tree.");
		    } else {
		        System.out.println("Key " + key + " not found in the tree.");
		    }
	}
	public void deleteAll() {
		root = null;
	}

}
