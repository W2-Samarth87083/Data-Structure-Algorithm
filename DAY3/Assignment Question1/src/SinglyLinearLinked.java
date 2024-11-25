
public class SinglyLinearLinked {
	static class Node {
		int data;
		Node next;

		Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public SinglyLinearLinked() {
		head = null;
		tail = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void deleteFirst() {
		if (isEmpty()) {
			return;
		} else {
			head = head.next;
		}
		size--;
	}

	public void deleteLast() {
		if (isEmpty()) {
			return;
		} else if (head.next == null) {
			tail = head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
		size--;
	}

	public void insertAfter(int pos, int data) {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		Node trav = head;
		while (trav != null && trav.data != pos) {
			trav = trav.next;
		}

		if (trav == null) {
			System.out.println("Target data not found.");
		} else {
			Node newNode = new Node(data);
			newNode.next = trav.next;
			trav.next = newNode;

			if (trav == tail) {
				tail = newNode;
			}
			size++;
		}
	}

	public void insertBefore(int pos, int data) {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}

		if (head.data == pos) {
			addFirst(data);
			return;
		}

		Node trav = head;
		Node previous = null;
		
		while (trav != null && trav.data != pos) {
			previous = trav;
			trav = trav.next;
		}

		if (trav == null) {
			System.out.println("Target data not found.");
		} else {
			Node newNode = new Node(data);
			newNode.next = trav;
			previous.next = newNode;
			size++;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		Node newnode = head;
		while (newnode != null) {
			System.out.print(newnode.data + "  ");
			newnode = newnode.next;
		}
	
	}
}
