package creational.abstractFactory;

public abstract class ShapeFactory {
	public static ShapeFactory getShapeFactory(String shapeType) {
		ShapeFactory factory = null;
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			factory = new RectangleFactory();
		}
		else if(shapeType.equalsIgnoreCase("Square")) {
			factory = new SquareFactory();
		}
		return factory;
	}
	
	public abstract Shape createShape();
}
