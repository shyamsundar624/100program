package com.shyam.javaguides;

public class PalindromeCheck {
public static boolean ispalindrome(String str) {
	int size=str.length();
	for(int i=0;i<size/2;i++) {
		if(str.charAt(i)!=str.charAt(size-i-1)) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
System.out.println("Is String Palindrome "+ispalindrome("raceca"));
}
}
