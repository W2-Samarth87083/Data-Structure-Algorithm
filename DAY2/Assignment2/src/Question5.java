
public class Question5 {
	
	public static void main(String [] args) {
		int num =121;
		int rev=0;
		int temp=num;
		int rem;
		
		while (num!=0) {
			rem = num % 10;
			rev = rev + rem *10;
			
			 num = num/10;	
		}
		
		if (temp == rev) { System.out.println(temp + " is a palindrome"); }
		else { System.out.println(temp + " is not a palindrome"); }
		
	}
}
