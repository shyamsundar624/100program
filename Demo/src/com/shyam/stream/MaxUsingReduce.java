package com.shyam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxUsingReduce {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10, 50, 30, 70, 20);
	Integer reduce = numbers.stream().reduce(0,(a,b)->a>b?a:b);
	Optional<Integer> max = numbers.stream().max((a,b)->a.compareTo(b));
	
	System.out.println(max);
}
}
