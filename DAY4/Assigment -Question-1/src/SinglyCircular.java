
public class SinglyCircular {

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int size;

	public SinglyCircular() {
		tail = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);

		if (isEmpty()) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		size++;
	}

	public void addLast(int value) {
		Node newNode = new Node(value);

		if (isEmpty()) {
			tail = newNode;
			tail.next = tail;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void deleteFirst() {
		if (isEmpty()) {
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		size--;
	}

	public void deleteLast() {
		if (isEmpty()) {
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			Node current = tail.next;
			while (current.next != tail) {
				current = current.next;
			}
			current.next = tail.next;
			tail = current;
		}
		size--;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is empty.");
			return;
		}
		Node current = tail.next;
		do {
			System.out.print(current.data + "  ");
			current = current.next;
		} while (current != tail.next);

	}

	public void addPosition(int value, int pos) {

		if (pos < 1 || pos > size + 1) {
			return;
		}

		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = tail;
		} else if (pos == 1) {
			addFirst(value);
			return;

		} else if (pos == size + 1) {
			addLast(value);
			return;
		} else {

			Node trav = tail.next;

			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;

			newnode.next = trav.next;
			trav.next = newnode;
		}
size++;
	}

	public void deletePosition(int pos) {
		if (pos < 1 || pos > size + 1) {
			return;
		}

		if (isEmpty()) {
			return;
		}

		else if (pos == 1) {
			deleteFirst();
			return;
		} else if (pos == size + 1) {
			deleteLast();
			return;
		} else {

			Node trav = tail.next;

			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
				trav.next = trav.next.next;
			}
		}
		size--;
	}

	public void deleteAll() {
		tail = null;
		size = 0;
	}

}