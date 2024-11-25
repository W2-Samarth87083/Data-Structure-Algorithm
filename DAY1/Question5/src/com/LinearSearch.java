package com;

import java.util.Scanner;

public class LinearSearch {
	
	private static int linearSearch(int[] arr, int num,int n) {
       int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==num) {
				count++;
				if (count==n) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String [] args) {
		int [] arr = {10,20,30,10,10,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to be searched : ");
		int num = sc.nextInt();
		int n =4;
		int index = linearSearch(arr, num,n);
		
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
		
		sc.close();
		}
	}

