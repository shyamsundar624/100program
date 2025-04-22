package com.shyam.collection;

import java.util.Arrays;
import java.util.List;

public class LongestString {
public static void main(String[] args) {
	List<String> list=Arrays.asList("a", "bb", "ccc","hjhgkjhiu");
	String longestStr = list.stream().reduce("",(s1,s2)->s1.length()>s2.length()?s1:s2);
	
	System.out.println(longestStr);
}
}
