package com.shyam;

public class StaticTest {
static int i;
int j;
	static{
		//Static Block
		System.out.println("Static Block Get Executed"+i);
		i=20;
		//j=10;
	}
	
	static {
		System.out.println("Second Static Block");
	}
	
	public StaticTest() {
System.out.println("Constructor Get Executed");
	}
	
	public static void main(String[] args) {
		new StaticTest();
		System.out.println("Main Method Get Executed"+i);
	}
}
