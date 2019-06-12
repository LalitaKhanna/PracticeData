package com.test;

public class SortQuick {
	static void sort(int arr[], int low, int high) {
		if (low < high) 
		{
			int p = partition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) 
		{
			if (arr[j] <= pivot) 
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
        return i + 1;
	}

	static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 54, 87, 56, 90, 67, 82 };
		System.out.println("sorted array");
		sort(arr, 0, arr.length - 1);
		print(arr);

	}

}
