import java.util.Scanner;

public class NonRepeating {


		public static int nonRepeatingElement(int[] arr, int key) {
			for (int i = 0; i < arr.length; i++) {
				int ind = arr[i];
				int count=0;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j]==ind) {
						count++;
						}
					}
				if(count==1) {
					System.out.println(arr[i]);
				}
			}
			return 0;
		}

		public static void main(String[] args) {
			int arr[]= {1,2,3,-1,-1,1,2,4,0};
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter key to be searched : ");
			int key = sc.nextInt();

			int index = nonRepeatingElement(arr, key);
	
		}
	}



