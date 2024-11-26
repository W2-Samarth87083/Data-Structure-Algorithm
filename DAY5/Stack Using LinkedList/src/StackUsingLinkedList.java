
public class StackUsingLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public StackUsingLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void push(int value) {
		
		Node newNode = new Node(value);
		newNode.next=head;
		head=newNode;
	}
	
	public int pop() {
		
		if (isEmpty()) {
			return -1 ;
		}
		int temp = head.data;
		head = head.next;
		return temp;
	}
	
	
	
	public int peek() {
		return head.data;
	}

}
