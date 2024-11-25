package com.sunbeam;

import java.util.Arrays;
import java.util.Iterator;

public class SelectionSort {
	public static void selectionSort(int[] arr, int N) {
		for (int i = 0; i < N - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < N; j++) {

				if (arr[j] < arr[minindex])
					minindex = j;
			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {

		int arr[] = { 44, 11, 55, 22, 66, 33 };

		System.out.println("Array before sort : " + Arrays.toString(arr));

		selectionSort(arr, arr.length);

		System.out.println("Array after sort : " + Arrays.toString(arr));
	}
}
