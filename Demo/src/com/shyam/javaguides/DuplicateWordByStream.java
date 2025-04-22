package com.shyam.javaguides;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordByStream {
static	boolean hasDuplicate=false;
public static void main(String[] args) {
	String str="this is test and test is easy";
	
	Map<String,Long> map = Arrays.stream(str.split("\\s")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
	
	System.out.println(map);
	
	
	map.forEach((key,value)->{
		if(value>1) {
			System.out.println(key);
			hasDuplicate=true;
		}
	});
	
	if(!hasDuplicate) {
		System.out.println("No Duplicate Found");
	}
}
}
