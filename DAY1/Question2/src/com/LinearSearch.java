package com;



import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
	
	
	public static int LinearSearchNthOccurance(int arr[] ,int key) {
		
		int comp=0;
		for(int i = 0 ; i < arr.length ; i++) {
		comp++;
			if (key == arr[i]) {
				System.out.println("NO OF COMPARISON :" + comp);
				return i;
			}
			
		}
		return -1;
		
	}

	public static void main(String [] args) {
		int arr [] = {1,2,3};

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		
		int index = LinearSearchNthOccurance(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
	}
}

