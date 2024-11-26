
public class StackUsingLinkedListMain {

	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("Peeked data : " + s.peek());
		System.out.println("Poped data : " + s.pop());
		System.out.println("Poped data : " + s.pop());
		System.out.println("Peeked data : " + s.peek());
		
		System.out.println("isEmpty : " + s.isEmpty());

	}

}
