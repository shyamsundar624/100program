package com.shyam;

public class ConsTest {
int x;
int y;
	public ConsTest() {
		this(10);
		System.out.println("Default Constructor");
	}

	public ConsTest(int i) {
		this(10.34);
		System.out.println("Int Argument Constructor");
	}

	public ConsTest(double d) {
		System.out.println("Double Argument Constructor");
	}

	public ConsTest(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		new ConsTest(12,15).disp();
		
	}
	void disp() {
		System.out.println("value of x "+x+" and y "+y);
	}
}
