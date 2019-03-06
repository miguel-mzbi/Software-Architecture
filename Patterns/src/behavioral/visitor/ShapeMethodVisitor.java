package behavioral.visitor;

public interface ShapeMethodVisitor {
	public void visit(Circle circle);
	public void visit(Square square);
}
