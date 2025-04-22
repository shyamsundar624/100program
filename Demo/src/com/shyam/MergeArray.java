package com.shyam;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {
public static void main(String[] args) {
	 Integer[] array1 = {1, 2, 3};
     Integer[] array2 = {4, 5, 6};
     
		/*
		 * Integer[] arr3=new Integer[array1.length+array2.length];
		 * 
		 * int index=0;
		 * 
		 * for(Integer el:array1) { arr3[index++]=el;
		 * 
		 * } for(Integer el:array2) { arr3[index++]=el;
		 * 
		 * }
		 */
     Integer[] arr3 = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(Integer[]::new);
     System.out.println(Arrays.toString(arr3));
}
}
