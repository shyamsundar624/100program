package com.shyam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringConcateReduce {
public static void main(String[] args) {
	List<String>words=Arrays.asList("Hello","World","Java","Stream");
	 String reduce = words.stream().reduce("Sentence: ",(a,b)->a+" "+b);
	System.out.println(reduce);
	
}
}
