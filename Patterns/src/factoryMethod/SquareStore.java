package factoryMethod;

public class SquareStore extends ShapeStore {

	@Override
	public Shape createShape() {
		return new Square();
	}
    
}