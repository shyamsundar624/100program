package com.shyam.collection;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeating {
public static void main(String[] args) {
	String str="shyamsundar";
	LinkedHashMap<Character,Long> linkedHashMap = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
	
	linkedHashMap.forEach((key,value)->{
		if(value==1) {
			System.out.println(key);
		}
	});
}
}
