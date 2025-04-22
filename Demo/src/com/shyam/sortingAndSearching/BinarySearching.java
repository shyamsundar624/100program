package com.shyam.sortingAndSearching;

public class BinarySearching {

	public static int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1;

		while (left <= right) {
			//int mid = (left + right) / 2;
			int mid = left + (right-left) / 2;
			if (arr[mid] == target) {
				return mid;

			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,11};
		int target=8;
		int result = binarySearch(arr, target);
		if(result!=-1) {
			System.out.println("Element  Found at index "+result);
		}else {
			System.out.println("Element Not Found");
		}
	}
}
