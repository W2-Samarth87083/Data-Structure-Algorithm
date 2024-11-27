
public class BST {

	class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	Node root;

	public BST() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addnode(int value) {
		if (root == null) {
			root = new Node(value);
		} else
			addNode(value, root);
	}

	public void addNode(int value, Node trav) {
		if (value < trav.data) {
			if (trav.left == null)
				trav.left = new Node(value);
			else
				addNode(value, trav.left);
		} else {
			if (trav.right == null) {
				trav.right = new Node(value);
			} else
				addNode(value, trav.right);
		}

	}

	private void inorder(Node trav) {
		if (trav == null) {
			return;
		}
		inorder(trav.left);
		System.out.println(" " + trav.data);
		inorder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println();
	}

	public Node[] binarysearchwithparent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data)
				break;

			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		if (trav == null)
			parent = null;
		Node arr[] = new Node[] { trav, parent };
		return arr;

	}

	public void delete(int key) {
		Node arr[] = binarysearchwithparent(key);
		Node temp = arr[0];
		Node parent = arr[1];
		if (temp == null) {
			return;
		}

		if (temp.left != null && temp.right != null) {
			Node pred = temp.left;
			parent = temp;

			while (pred.right != null) {
				parent = pred;
				pred = pred.right;
			}
			temp.data = pred.data;
			temp = pred;
		}

		if (temp.left == null) {
			if (temp == root)
				root = temp.right;
			else if (temp == parent.left)
				parent.left = temp.right;
			else if (temp == parent.right)
				parent.right = temp.right;
		}

		if (temp.right == null) {
			if (temp == root)
				root = temp.left;
			else if (temp == parent.left)
				parent.left = temp.left;
			else if (temp == parent.right)
				parent.right = temp.left;
		}
	}

	private int heightt(Node trav) {

		if (trav == null) {
			return -1;
		}
		int hl = heightt(trav.left);
		int hr = heightt(trav.right);

		int max = hl > hr ? hl : hr;
		return max + 1;

	}

	public int height() {
		return heightt(root);
	}

	public void deleteAll() {
		root = null;
	}
}
