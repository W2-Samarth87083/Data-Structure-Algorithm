import java.util.Arrays;

public class Insertion {

	public static void InsertionSort(int[] arr, int length) {
	  int comp=0; int pass=0;
		for (int i = 1; i < arr.length; i++) {
			pass++;
			int temp = arr[i];
			int j;
			for (j = i-1; j>=0; j--) {
				comp++;
				if (arr[j]>temp) 
					arr[j+1]=arr[j];
					else
						break;
				
			}
			arr[j+1]=temp;
		}
		System.out.println("No of pases :"+ pass);
		System.out.println("No of comps :"+ comp);
		
	}

	public static void main(String[] args) {

			int arr[] = {33, 22, 66, 55, 44, 11};
			//int arr[] = {11, 22, 33, 44, 55, 66};
			
			System.out.println("Array before sort : " + Arrays.toString(arr));
			
        		InsertionSort(arr, arr.length);

			
			System.out.println("Array after sort : " + Arrays.toString(arr));
		}


}