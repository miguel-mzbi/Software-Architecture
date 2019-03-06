package behavioral.visitor;

public class Square implements Shape{
	private double x;
	private double y;
	private double size;
	
	public Square(double size)
	{
		this.x = 0.;
		this.y = 0.;
		this.size = size;
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
	
	public double getSize()
	{
		return this.size;
	}
	
	public double getArea()
	{
		return Math.pow(this.size, 2);
	}
	
	public void accept(ShapeMethodVisitor visitor)
	{
		visitor.visit(this);
	}
}

