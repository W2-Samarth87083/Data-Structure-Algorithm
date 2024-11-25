package com.sunbeam;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
	
	
	public static int Linear(int arr[] ,int key) {
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			if (key == arr[i]) {
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
		
		
		int index = Linear(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
	}
}
