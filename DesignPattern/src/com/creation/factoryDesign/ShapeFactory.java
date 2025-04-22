package com.creation.factoryDesign;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if ("Rectangle".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		}else {
			return null;
		}
	}
}
