
public class SinglyLinearMain {
public static void main(String[] args) {
		
		SinglyLinearLinked list = new SinglyLinearLinked();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		// 10 -> 20 -> 30 -> 40
		
		//list.addLast(50);
		list.addLast(60);
		
		//list.deleteFirst();
		//list.deleteLast();
		
		list.insertAfter(20,0);
        list.insertBefore(30, 0);		
        list.display();
	}

}
