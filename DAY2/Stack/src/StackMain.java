import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {

		Stack s = new Stack(5);

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (s.isFull()) 
					System.out.println("Stack is Full");
				 else
					System.out.print("Enter data to be inserted : ");
				int data = sc.nextInt();
				s.push(data);
				break;

			case 2:
				if (s.isEmpty()) 
					System.out.println("Stack is Empty");
		
				else 
					System.out.println("Poped Data : " + s.pop());
				
				break;
				
			case 3 :
				if(s.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data : " + s.peek());
			}
		} while (choice != 0);
		sc.close();

	}

}
