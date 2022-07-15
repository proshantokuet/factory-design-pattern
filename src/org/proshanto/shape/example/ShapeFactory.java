package org.proshanto.shape.example;

public class ShapeFactory {

	private Shape shape =null;
	public Shape getShape(ShapeEnum shapeType ){
		switch (shapeType) {
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANLE:
			shape=new Rectangle();
		default:
			break;
		}
		return shape;
	}
}
