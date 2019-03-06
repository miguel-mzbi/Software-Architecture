package structural.composite;

import java.awt.Graphics;

public abstract class Figure {
	String mode = "NORMAL";
	public abstract void paint(Graphics g);
	public abstract void setX(int x);
	public abstract void setY(int y);
	public abstract int getX();
	public abstract int getY();
}
