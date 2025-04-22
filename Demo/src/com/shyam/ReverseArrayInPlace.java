package com.shyam;

import java.util.Arrays;

public class ReverseArrayInPlace {
public static void main(String[] args) {
	int[] arr= {12,3,5,6,7,8};
	reverseArr(arr);
	System.out.println(Arrays.toString(arr));
}

public static void reverseArr(int[] arr) {
	int lIndex=0;
	int rIndex=arr.length-1;
	
	while(lIndex<rIndex) {
		int temp=arr[lIndex];//12
		arr[lIndex]=arr[rIndex];//8
		arr[rIndex]=temp;//12
		lIndex++;
		rIndex--;
	}
}
}
