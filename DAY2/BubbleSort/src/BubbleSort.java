import java.util.Arrays;

public class BubbleSort {
	

	public static void bubbleSort(int[] arr, int length) {
		int passes=0,comps=0;
		for (int i = 1; i < arr.length; i++) {
			 passes++;
			for (int j = 0; j < arr.length-1; j++) {
				comps++;
				if (arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("No of pases :"+ passes);
		System.out.println("No of comps :"+ comps);
	}
	
	
	public static void improvedBubbleSort(int[] arr, int length) {
		int passes=0,comps=0;
		for (int i = 1; i < arr.length; i++) {
			passes++;
			for (int j = 0; j < arr.length-i; j++) {
				comps++;
				if (arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("No of pases :"+ passes);
		System.out.println("No of comps :"+ comps);
		
	}
	
	public static void furtherImprovedBubbleSort(int[] arr, int length) {
		int passes=0,comps=0; int flag=0;
		for (int i = 1; i < arr.length; i++) {
			passes++;
			for (int j = 0; j < arr.length-1; j++) {
				comps++;//if we want all comparisons
				if(arr[j]>arr[j+1]) {
					//comps++;//if we want only j> j+1 comparisons
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0) 
				break;
		}
		System.out.println("No of pases :"+ passes);
		System.out.println("No of comps :"+ comps);
		
	}

	public static void main(String[] args) {

			//int arr[] = {33, 22, 66, 55, 44, 11};
			int arr[] = {11, 22, 33, 44, 55, 66};
			
			System.out.println("Array before sort : " + Arrays.toString(arr));
			
			bubbleSort(arr, arr.length);
//			improvedBubbleSort(arr, arr.length);
			//furtherImprovedBubbleSort(arr, arr.length);
			
			System.out.println("Array after sort : " + Arrays.toString(arr));
		}

	}

