package com.shyam.collection;

import java.util.HashMap;

public class HashMapTest {
public static void main(String[] args) {
	
	HashMap<ABC, Integer> abcMap=new HashMap<>();
	
	ABC abc1=new ABC(12,"shyam");
	ABC abc2=new ABC(12,"shyam");
	
	abcMap.put(abc1, 1);
	abcMap.put(abc2, 1);
	
	System.out.println(abcMap);
	
}
}
