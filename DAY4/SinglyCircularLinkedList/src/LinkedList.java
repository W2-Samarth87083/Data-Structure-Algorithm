
public class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head, tail;
	private int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public int size() {
		return size;
	}

	public void Display() {

		if (head == null) {
			return;
		}

		System.out.println("List");

		Node trav = head;

		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println();

	}

	public void addFirst(int value) {

		Node newnode = new Node(value);

		if (head == null) {

			head = tail = newnode;

			tail.next = head;
		} else {
			newnode.next = head;
			tail.next = newnode;
			head = newnode;
		}
		size++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);

		if (head == null) {

			head = tail = newnode;

			tail.next = head;
		} else {
			newnode.next = head;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}

	public void deleteFirst() {
		if (head == null)
			return;
		else if (head == tail)
			head = tail = null;

		else {
			tail.next = head.next;
			head = head.next;
		}
		size--;
	}

	public void deleteLast() {
		if (tail == null) {
			return;
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node trav = head;
			while (trav.next.next != head)
				trav = trav.next;
			trav.next = head;
			tail = trav;
		}
		size--;
	}

	public void addPostion(int value, int pos) {

		if (pos < 1 || pos > size + 1)
			return;
		Node newnode = new Node(value);
		if (head == null) {
			head = tail = newnode;
			tail.next = head;
		} else if (pos == 1) {
			addFirst(value);
			return;
		} else if (pos == size + 1) {
			addLast(value);
			return;
		} else {

			Node trav = head;

			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
				newnode.next = trav.next;
				trav.next = newnode;
			}
			size++;
		}
	}

	public void deletePosition(int pos) {

		if (pos<1 || pos> size+1) 
			return;

		if (head == null) {
			return;
		}
		else if (head==tail) {
			head=tail=null;
		}
		else {	
		if (pos==1) {
			deleteFirst();
			return;
		}
		else if (pos==size) {
			deleteLast();
			return;
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}
	size--;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}

}
