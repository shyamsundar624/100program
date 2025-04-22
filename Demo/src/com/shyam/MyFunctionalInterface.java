package com.shyam;


@FunctionalInterface
public interface MyFunctionalInterface {
	void display(); // Single Abstract Method (SAM)

    // You can have default methods
    default void sayHello() {
        System.out.println("Hello from default method!");
    }

    // You can have static methods
    static void staticMethod() {
        System.out.println("Hello from static method!");
    }
    
}
