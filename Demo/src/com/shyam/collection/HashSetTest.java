package com.shyam.collection;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	
	HashSet<Person> hashSet=new HashSet<>();
	
	Person p1=new Person("Dev", "shyam");
	Person p2=new Person("Dev", "shyam");
	
	hashSet.add(p1);
	hashSet.add(p2);
	
	System.out.println(hashSet.size());
	System.out.println(hashSet);
	
}
}
