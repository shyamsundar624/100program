package com.app.shyam;

public class Length {
	public static void main(String[] args) {
		String str = "shyam sundar yadav";
		char[] arr = str.toCharArray();
		int i = 0;
		int size = str.length();
		int vowCnt = 0, conCnt = 0, splCnt = 0;
		while (i != size) {
			if (arr[i] >= 'a' && arr[i] <='z' ) {
				if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
					++vowCnt;
				} else {
					++conCnt;
				}
			} else {
				++splCnt;
			}
			++i;
		}
		System.out.println("Consonant "+conCnt);
		System.out.println("Vowel "+vowCnt);
		System.out.println("Special "+splCnt);
	}
}
