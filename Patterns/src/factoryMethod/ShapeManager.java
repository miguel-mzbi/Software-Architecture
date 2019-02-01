package factoryMethod;

public class ShapeManager {
	public Shape createShape(String shapeType) {
		Shape shape = ShapeStore.orderShape(shapeType);
		return shape;
	}
	
	public static void main(String[] args) {
		ShapeManager shapeManager = new ShapeManager();
		Shape shape1 = shapeManager.createShape("Rectangle");
		Shape shape2 = shapeManager.createShape("Square");
		shape1.print();
		shape2.print();
	}
}
