package creational.factoryMethod;
public abstract class ShapeStore {
    public static Shape orderShape(String shapeType) {
        Shape shape = null;
        
        if(shapeType.equalsIgnoreCase("Rectangle")) {
            ShapeStore store = new RectangleStore();
            shape = store.createShape();
        }
        else if(shapeType.equalsIgnoreCase("Square")) {
            ShapeStore store = new SquareStore();
            shape = store.createShape();
        }
        return shape;
    }

    public abstract Shape createShape();
}
