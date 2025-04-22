package com.shyam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
	public static void main(String[] args) {
		//Java from World Hello
		String str = "Hello World from Java";
		List<String> words = Arrays.asList(str.split(" "));
		
		Collections.reverse(words);
		String reversedStr = String.join(" ", words);
		System.out.println(reversedStr);
		
	}
}
