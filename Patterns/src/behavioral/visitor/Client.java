package behavioral.visitor;

public class Client {
	public static void main(String [] args)
	{
		Shape square = new Square(2.);
		Shape circle = new Circle(1.);

		System.out.println("Square's area = " + square.getArea());
		
		PerimeterVisitor visitor = new PerimeterVisitor();
		square.accept(visitor);
		System.out.println("Square's perim = " + visitor.getPerimeter());
		
		System.out.println("Circle's area = " + circle.getArea());
		
		visitor = new PerimeterVisitor();
		circle.accept(visitor);
		System.out.println("Circle's perim = " + visitor.getPerimeter());
	}
}
