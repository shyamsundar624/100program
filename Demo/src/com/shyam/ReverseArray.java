package com.shyam;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[] arr= {12,3,5,6,7,8};
	reverseArr(arr);
	System.out.println(Arrays.toString(arr));
}
public static void reverseArr(int[] arr) {
	
	int left=0;
	int right=arr.length-1;
	
	while(left<right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		left++;
		right--;
	}
}
}
