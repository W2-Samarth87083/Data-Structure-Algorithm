
public class Queue {
	
	private int arr[];
	private int front,rear;
	private final int SIZE;

	public Queue(int size) {
		this.SIZE = size;
		arr=new int [SIZE];
		front=rear=-1;
	}
	
	public void push(int value) {
		rear++;
		arr[rear]=value;
	}
	
	public int pop() {
		int temp =arr[front+1];
		front++;
		return temp;
	}
	
	public int peek() {
		return arr[front+1];
	}
	
	
	public boolean full() {
		return rear==SIZE-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}

}
