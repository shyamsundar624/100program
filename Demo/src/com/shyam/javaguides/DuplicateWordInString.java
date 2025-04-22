package com.shyam.javaguides;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordInString {

	public static void duplicateWords(String str) {
		String[] strArr = str.split("\\s+");
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
		
		for(String word:strArr) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		
		boolean hasDuplicate=false;
		
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
				hasDuplicate=true;
			}
		}
		if(!hasDuplicate) {
			System.out.println("No Duplicates Found!");
		}
	}
	public static void main(String[] args) {
		duplicateWords("This is test . This test is easy");
	}
}
