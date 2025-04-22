package com.shyam.collection;

public class SumOfDigits {
public static void main(String[] args) {
	String input="s32h3h39f";
	
	int sum=0;
	for(Character ch:input.toCharArray()) {
		if(Character.isDigit(ch)) {
			sum+=Character.getNumericValue(ch);
		}
	}
	System.out.println(sum);
}
}
