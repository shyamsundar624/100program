package com.creation.factoryDesign;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("circle");
		shape.draw();
		Shape shape2 = factory.getShape("rectangle");
		shape2.draw();
	}
}
