import java.util.Arrays;

class Stack1 {
	int arr[];
	int top;
	int SIZE;

	public Stack1(int size) {
		SIZE = size;
		this.arr = new int[SIZE];
		this.top = SIZE-1;
	}

	public void push(int value) {
		top--;
		arr[top] = value;
	}

	public int pop() {
		int temp = arr[top];
		top++;
		return temp;
	}

	public int peek() {
		return arr[top];
	}
	

	public boolean isEmpty() {
		return top == SIZE - 1;
	}

	public boolean isFull() {
		return top == -1;
	}

	@Override
	public String toString() {
		return "Stack1 [arr=" + Arrays.toString(arr) + ", top=" + top + ", SIZE=" + SIZE + "]";
	}
    
}

public class Question3 {

	public static void main(String[] args) {
		Stack1 s = new Stack1(4);
		s.push(10);
		s.push(20);
		s.push(30);
	
		System.out.println(s.toString());

	}
}
