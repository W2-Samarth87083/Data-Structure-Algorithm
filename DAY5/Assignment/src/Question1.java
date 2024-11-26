
public class Question1 {

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

	public Question1() {
		root = null;
	}

	public void addnode(int value) {
		root = addNode(root, value);
	}

	public Node addNode(Node trav, int value) {

		if (trav == null) {
			return new Node(value);
		}
		if (value < trav.data) {
			trav.left = addNode(trav.left, value);
		}
		if (value > trav.data) {
			trav.right = addNode(trav.right, value);
		}
		return trav;
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

	public static void main(String[] args) {
		Question1 q = new Question1();
		q.addnode(1);
		q.inOrder();

	}

}
