package com.shyam.javaguides;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedChar {
public static char getFirstNonRepeatedChar(String str) {
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	
	for(char ch:str.toCharArray()) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	for(Map.Entry<Character, Integer> entrySet : map.entrySet()) {
		if(entrySet.getValue()==1) {
			return entrySet.getKey();
		}
	}
	
	return '\0';
}

public static void main(String[] args) {
	String str="aabbcc";
	
	char result = getFirstNonRepeatedChar(str);
	
	if(result!='\0') {
		System.out.println("First Non Repeated Character is : "+result);
	}else {
		System.out.println("No Non Repeated Character Found");
	}
}
}
