package com.shyam.javaguides;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharInString {
public static void isDuplicateContainStr(String str) {
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	
	for(char ch:str.toCharArray()) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	boolean hasDuplicated=false;
	for(Entry<Character,Integer> entry : map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.print(entry.getKey()+" ");
			hasDuplicated=true;
		}
	}
	if(!hasDuplicated) {
		System.out.println("No Duplicate Found");
	}
}

public static void main(String[] args) {
	isDuplicateContainStr("shyamsundar");
}
}
