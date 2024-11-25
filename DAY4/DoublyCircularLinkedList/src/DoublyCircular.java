
public class DoublyCircular {
	static class Node {
		private int data;
		private Node next, prev;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;
	private int size;

	public DoublyCircular() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return size;
	}

	public void fDisplay() {
		if (head == null)
			return;
		System.out.print("Forward List : ");
		Node trav = head;
		do {
			// 2. print current node
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println();
	}

	public void rDisplay() {
		if (head == null)
			return;
		System.out.print("Backward List : ");
		Node trav = head.prev;
		do {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		} while (trav != head.prev);
		System.out.println();
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (head == null) {
			head = nn;
			nn.next = nn.prev = nn;
		} else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
		size++;
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (head == null) {
			head = nn;
			nn.next = nn.prev = nn;
		} else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
		}
		size++;
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null) {
			head = newnode;
			newnode.next = newnode.prev = newnode;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;
			newnode.next = trav.next;
			newnode.prev = trav;
			trav.next.prev = newnode;
			trav.next = newnode;
		}
		size++;
	}

	public void deleteFirst() {
		if (head == null)
			return;
		else if (head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		size--;
	}

	public void deleteLast() {
		if (head == null)
			return;
		else if (head.next == head)
			head = null;
		else {
		head.prev = head.prev.prev;
			head.prev.next = head;
		}
		size--;
	}

	public void deletePosition(int pos) {
		if (head == null)
			return;
		else if (head.next == head)
			head = null;
		else {
			Node trav = head;
//			for (int i = 1; i < pos; i++)
//				trav = trav.next;
//			trav.prev.next = trav.next;
//			trav.next.prev = trav.prev;
		}
		size--;
	}

	public void deleteAll() {
		head = null;
		size = 0;
	}
}
