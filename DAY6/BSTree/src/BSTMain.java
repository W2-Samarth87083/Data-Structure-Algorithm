
public class BSTMain {

	public static void main(String[] args) {
		BST b = new BST();
		b.addnode(1);
		b.addnode(2);
		b.addnode(3);
		b.addnode(4);
		b.addnode(5);
		b.inOrder();
		b.binarysearchwithparent(1);
		b.delete(1);
		b.inOrder();

	}

}
