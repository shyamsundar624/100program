package com.app.shyam;

public class Test {
public Test() {
	this(10);
	System.out.println("Default Constructor");
}
	
public Test(int i) {
	this(12,23);
System.out.println("Single Argument Constructor "+i);
}

public Test(int i, int j) {
System.out.println("DOuble Argument Constructor");
}

public static void main(String[] args) {
	new Test();
}
}
