
public class LinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {

			this.data = value;
			this.next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}

	}

	public void deleteFirst() {
		if (head == null)
			return;
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null)
			return;
		else if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}
	public void addPosition(int value, int pos) {
		
		Node newnode = new Node(value);
		if(head == null)
			head = newnode;
		else if(pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 && trav.next != null ; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	public void deletePosition(int pos) {
		if(head == null)
			return;
		else if(head.next == null)
			head = null;
		else if(pos <= 1)
			deleteFirst();
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 && trav.next.next != null ; i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}

	public void Display() {

		Node trav = head;

		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

	public void deleteAll() {
		head = null;
	}
}
