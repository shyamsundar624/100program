package com.shyam.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	Integer reduce = numbers.stream().reduce(0,(a,b)->a+b);
	System.out.println(reduce);
	
}
}
