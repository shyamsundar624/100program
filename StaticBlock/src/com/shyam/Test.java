package com.shyam;

public class Test {
	static int i;
	int j;
	static {
		System.out.println("Static Block Get Executed"+i);
		i=10;
	}
	{
		System.out.println(j+"Instance Block Get Executed"+i);
		i=20;
		j=90;
	}
	public Test() {
		System.out.println(j+"Constructor Get Executed"+i);
	}

	public static void main(String[] args) {
		//Test t=new Test();
		System.out.println("Main Method Get Executed"+i);
	}
}
