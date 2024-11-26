import java.util.LinkedList;

public class DisplayReverse {

	class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void reverse(Node trav) {
		if (trav == null) {
			return;
		}
		reverse(trav.next);
		System.out.println(trav.data);
	}

	public void Dreverse() {
		Node t1 = null;
		Node t2 = head;
		while (t2 != null) {
			head = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = head;
		}
		head = t1;
	}

	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void midFind() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}

	public boolean hasLoop() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if (fast==slow) {
				System.out.println("LOOP");
				return true;
			}
		}
		System.out.println("NO LOOP");
		return false;
	}
	
	
	public void sort() {
		for (Node i=head; i.next!=null;i=i.next ) {
			Node min = i;
			for (Node j = i.next; j!= null; j=j.next) {
				if (min.data>j.data) 
					min=j;
			}
			int  temp = i.data;
			i.data= min.data;
			min.data = temp;
		}	
	}
	public static void main(String[] args) {
		DisplayReverse d = new DisplayReverse();
		d.add(1);
		d.add(2);
		d.add(3);
		// d.reverse(d.head);

		System.out.println("Original List:");
		d.printList(d.head);

		d.Dreverse();
		System.out.println("Reversed List:");
		d.printList(d.head);

		d.midFind();
        d.hasLoop();
        
        d.sort();
        d.printList(d.head);
	
	}
}
