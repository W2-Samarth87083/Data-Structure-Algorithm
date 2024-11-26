
public class Question2 {

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

	public Question2() {
		root = null;
	}

	public void addnode(int value) {
		root = add(root, value);
	}

	public Node add(Node trav, int value) {
		if (trav == null) {
			return new Node(value);
		}
		if (value < trav.data) {
			trav.left = add(trav.left, value);
		} else {
			trav.right = add(trav.right, value);
		}
		return trav;
	}

	public void inorder(Node trav) {
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

	public Node search(Node trav, int key) {
		if (trav == null || trav.data == key) {
			return trav;
		}
		if (key < trav.data) {
			search(trav.left, key);
		}
		if (key > trav.data) {
			search(trav.right, key);
		}
		return trav;
	}

	public void search1(int key) {
		Node result = search(root, key);
		if (result != null) {
			System.out.println("Key " + key + " found in the tree.");
		} else {
			System.out.println("Key " + key + " not found in the tree.");
		}
	}

	public static void main(String[] args) {
		Question2 q = new Question2();
		q.addnode(1);
		q.addnode(2);
		q.inOrder();

		q.search1(1);

	}

}
