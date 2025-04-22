package com.shyam.javaguides;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int size = str.length();
		char[] cs = str.toCharArray();
		char[] reverseChar=new char[size];
		
		int i=0;
		
		while(i!=size) {
			reverseChar[size-i-1]=cs[i];
			++i;
		}
		
		i=0;
		boolean result=true;
		while(i!=size) {
			if(cs[i]!=reverseChar[i]) {
				result=false;
				
			}
			++i;
		}
		return result;
	}
	
public static void main(String[] args) {
String str="madm";
System.out.println("Is String Palindrome " + isPalindrome(str));
}
}
