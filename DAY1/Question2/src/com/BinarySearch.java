package com;

import java.util.Scanner;

public class BinarySearch {

private static int binarySearch(int [] arr, int key) {
	
	int left=0,right = arr.length-1 ,mid;
	
	int comp=0;
	while(left<=right) {
		comp++;
		mid = (left+right)/2;
		
		if (key==arr[mid]) {
			System.out.println("No of Comparison :" + comp);
			return mid;
		}
	
		if (key<arr[mid]) 
			 right = mid-1;
		
		else
			left = mid +1;
		
			}
return -1;
}
	public static void main(String [] args) {
		
		int arr [] = {1,3,6,8,10,28,22};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
		
		sc.close();

	}


}
