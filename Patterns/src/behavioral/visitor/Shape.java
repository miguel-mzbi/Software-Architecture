package behavioral.visitor;

public interface Shape {
	public abstract void setX(double x);
	public abstract void setY(double x);
	public abstract double getX();
	public abstract double getY();
	public abstract double getArea();
	public abstract void accept(ShapeMethodVisitor visitor);
}
