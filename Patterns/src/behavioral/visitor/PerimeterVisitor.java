package behavioral.visitor;

public class PerimeterVisitor implements ShapeMethodVisitor{
	private double perimeter = 0;
	public void visit(Circle circle)
	{
		this.perimeter = 2 * Math.PI * circle.getRadius();
	}
	
	public void visit(Square square)
	{
		this.perimeter = 4 * square.getSize();
	}
	
	public double getPerimeter()
	{
		return this.perimeter;
	}
}
