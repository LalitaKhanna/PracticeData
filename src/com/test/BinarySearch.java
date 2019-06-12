package com.test;

public class BinarySearch {
	/**
	 * @param arr
	 * @param data
	 * @param l
	 * @param r
	 * @return
	 */
	int binarySearch(int arr[], int data, int start, int end) {
		
		while (start <= end) {
			if(arr[start]==data) {
				return start;
			} 
			if(arr[end]==data) {
				return end;
			} 
			int mid =1+(start+end)/2;
			if (arr[mid] == data) {
				return mid;
			}
			if (arr[mid] < data) {
				start = mid+ 1;
				return binarySearch(arr, data, start, end);
			} else {
				end = mid - 1;
				return binarySearch(arr, data, start, end);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 20, 34, 41, 58, 98, 100, 234 ,256 };

		int data = 100;
		BinarySearch o = new BinarySearch();
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result = o.binarySearch(arr, arr[i], 0, arr.length-1);
			//System.out.println("result :"+result);
		}
		
		if (result == -1)
			System.out.println("not present in array");
		else
			System.out.println("present in array at index " + result);

	}

}
