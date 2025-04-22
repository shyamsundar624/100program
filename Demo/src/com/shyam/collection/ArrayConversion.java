package com.shyam.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayConversion {
public static void main(String[] args) {
	String[] arr= {"Java","Python","Angular"};
	List<String> asList = Arrays.asList(arr);
	String[] array = asList.toArray(new String[0]);
	
	for(String str:array) {
		System.out.print(str+" ");
	}
	System.out.println(asList);
	
}
}
