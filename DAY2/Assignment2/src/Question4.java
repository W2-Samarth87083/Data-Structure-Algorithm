import java.util.Arrays;

class Stack2{
	int arr[];
	int top;
	int SIZE;
	public Stack2( int size) {
		SIZE = size;
		this.arr = new int [SIZE];
		this.top = SIZE-1;
	}
	
	public void push(int value) {
		top--;
		arr[top]=value;
	}
	
	public int pop() {
	    int temp=arr[top];
		top++;
		return temp;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == SIZE-1;
	}
	public boolean isFull() {
		return top == -1;
	}

	@Override
	public String toString() {
		return "Stack2 [arr=" + Arrays.toString(arr) + ", top=" + top + ", SIZE=" + SIZE + "]";
	}
	
}
 
public class Question4 {

	public static void main(String [] args) {
		  int [] arr = {1,2,3,4}; 
		  
		  Stack2 s = new Stack2(5);
		  
		for (int i : arr) {
			s.push(i);
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =s.pop();
		}
		System.out.println("Reversed array: " + Arrays.toString(arr));
	}
}