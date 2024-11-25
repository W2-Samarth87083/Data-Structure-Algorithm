import java.util.Scanner;

public class LinearQueue {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if (q.full()) {
					System.out.println("Queue is full");
				} else {
					System.out.print("Enter data to be inserted : ");
					int data = sc.nextInt();
					q.push(data);
					break;
				}
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Poped Data : " + q.pop());
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Peeked Data : " + q.peek());
				break;
			}
		} while (choice!=0);
	}

}
