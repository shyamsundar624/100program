package com.shyam.collection;

import java.util.HashSet;

public class ProductTest {
public static void main(String[] args) {
	
	HashSet<Product> hashSet=new HashSet<>();
	
	Product p1=new Product(12, "Laptop", 4343);
	Product p2=new Product(12, "Laptop", 6643);
	
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	
	hashSet.add(p1);
	hashSet.add(p2);
	
	System.out.println(hashSet);
}
}
