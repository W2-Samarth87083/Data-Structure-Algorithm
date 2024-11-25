
public class DoublyLinear {
	static class Node {
		private int data;
		private Node next, prev;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head, tail;

	public DoublyLinear() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void forwardDisplay() {
		System.out.print("Forwrad List :: ");
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void backwardDisplay() {
		System.out.print("Backward List :: ");
		Node trav = tail;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println();
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (head == null)
			head = tail = newnode;
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (head == null)
			head = tail = newnode;
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void deleteFirst() {
		if (head == null)
			return;
		else if (head == tail)
			head = tail = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		if (head == null)
			return;
		else if (head == tail)
			head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		if (head == null)
			head = tail = newnode;
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;
			newnode.next = trav.next;
			newnode.prev = trav;
			trav.next.prev = newnode;
			trav.next = newnode;
		}
	}
	
	public void deletePosition(int pos) {
		if(head == null)
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
//			trav.next = trav.next.next;
//			trav.next.prev = trav;
		}
	}

	public void DeleteAll() {
		head = tail = null;
		return;
	}

}
