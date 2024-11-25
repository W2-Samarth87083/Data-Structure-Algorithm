import java.util.Arrays;

public class Question1 {

	public static void InsertionSort(int[] arr, int length) {
	for (int i = 1; i < arr.length; i++) {
         int ind =arr[i];
         int j;
         for (j = i-1; j >=0; j--) {
			if (arr[j]<ind) 
				arr[j+1] =arr[j];
				else
					break;
		}
         arr[j+1]=ind;
         
	}
		
	}
	
	
	public static void main(String[] args) {

		int arr[] = {33, 22, 66, 55, 44, 11};
		//int arr[] = {11, 22, 33, 44, 55, 66};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
    		InsertionSort(arr, arr.length);

		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}



}
