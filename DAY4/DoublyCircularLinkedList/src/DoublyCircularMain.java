import java.util.LinkedList;

public class DoublyCircularMain {

	public static void main(String [] args) {
		DoublyCircular l = new DoublyCircular();

		
		
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		
		l.addLast(50);
		l.addLast(60);
		
		//l.deleteFirst();
		//l.deleteLast();
		//l.addPosition(100, 3);
		l.deletePosition(3);
		
		l.fDisplay();
		l.rDisplay();

	}
	}	

