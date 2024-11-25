
public class Queue {

	private int arr[];
	private int rear,front;
	private final int SIZE;
	private int count;
	
	public Queue(int size) {
		this.SIZE = size ;
		arr=new int [SIZE];
		rear=front=-1;
		count=0;
	}
	
	public void push(int value) {
		rear=(rear+1)%SIZE;
		
		arr[rear]=value;
		count++;
	}
	
	public int pop() {
		int temp = arr[(front+1)%SIZE];
		front= (front+1)%SIZE;
		count--;
		return temp;
	}
	
	
	public int peek() {
		return arr[(front+1)%SIZE];	
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
}


