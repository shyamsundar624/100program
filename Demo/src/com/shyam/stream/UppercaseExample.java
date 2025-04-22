package com.shyam.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseExample {
public static void main(String[] args) {
	List<String> names = Arrays.asList("alice", "bob", "charlie");
	
	List<String> list = names.stream().map(String::toUpperCase).collect(Collectors.toList());
	
	System.out.println(list);

}
}
