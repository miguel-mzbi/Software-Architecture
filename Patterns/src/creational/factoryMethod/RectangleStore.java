package creational.factoryMethod;

public class RectangleStore extends ShapeStore {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}