package behavioral.visitor;

public class Circle implements Shape{
	private double x;
	private double y;
	private double radius;
	
	public Circle(double radius)
	{
		this.x = 0.;
		this.y = 0.;
		this.radius = radius;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	public void accept(ShapeMethodVisitor visitor)
	{
		visitor.visit(this);
	}
}
