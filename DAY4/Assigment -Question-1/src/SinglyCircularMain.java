
public class SinglyCircularMain {
	public static void main(String args[]) {

		SinglyCircular s = new SinglyCircular();
		s.addFirst(1);
		s.addLast(2);
//		s.deleteFirst();
//		s.deleteLast();
		
		s.addPosition(3, 3);
		s.deletePosition(3);
		s.display();
	}
}
