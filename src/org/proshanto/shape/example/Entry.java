package org.proshanto.shape.example;


public class Entry {

	public static void main(String[] args) {
		ShapeFactory shapeFacotry =new ShapeFactory();
		Shape shape = shapeFacotry.getShape(ShapeEnum.RECTANLE);
		
		shape.draw(0,0, 200, 200);

	}

}
