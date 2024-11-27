
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

    public void addNode(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addNode(value, root);
        }
    }

    private void addNode(int value, Node trav) {
        if (value < trav.data) {
            if (trav.left == null) {
                trav.left = new Node(value);
            } else {
                addNode(value, trav.left);
            }
        } else {
            if (trav.right == null) {
                trav.right = new Node(value);
            } else {
                addNode(value, trav.right);
            }
        }
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
        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();
    }

    public Node[] binarySearchWithParent(int key) {
        Node trav = root;
        Node parent = null;
        while (trav != null) {
            if (key == trav.data) {
                break;
            }
            parent = trav;
            if (key < trav.data) {
                trav = trav.left;
            } else {
                trav = trav.right;
            }
        }
        if (trav == null) {
            parent = null;
        }
        Node arr[] = new Node[] { trav, parent };
        return arr;
    }

    public void delete(int key) {
        Node arr[] = binarySearchWithParent(key);
        Node temp = arr[0];
        Node parent = arr[1];
        if (temp == null) {
            return;
        }

        if (temp.left != null && temp.right != null) {
            Node successor = temp.right;
            Node successorParent = temp;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            temp.data = successor.data;
            temp = successor;
            parent = successorParent;
        }

        Node child = (temp.left != null) ? temp.left : temp.right;
        if (temp == root) {
            root = child;
        } else if (temp == parent.left) {
            parent.left = child;
        } else {
            parent.right = child;
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(6);
        tree.addNode(8);

        System.out.println("Inorder before deletion:");
        tree.inOrder();

        tree.delete(5);

        System.out.println("Inorder after deletion:");
        tree.inOrder();
    }
}

