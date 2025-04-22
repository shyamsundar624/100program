package com.shyam;

public class FunctionalInterfaceExample {
public static void main(String[] args) {
	MyFunctionalInterface obj=()->System.out.println("Display Method Called");
	
	obj.display();
	obj.sayHello();
	MyFunctionalInterface.staticMethod();
}
}
