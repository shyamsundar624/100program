package com.app.shyam;

public class MaxNumber {
public static void main(String[] args) {
	int[] arr=new int[] {23,45,67,88,12};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Max Num present in Array "+max);
}
}
