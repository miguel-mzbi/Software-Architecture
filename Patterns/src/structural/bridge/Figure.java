package structural.bridge;

import java.awt.Graphics;

public abstract class Figure {
	public abstract void setX(int x);
	public abstract void setY(int y);
	public abstract int getX();
	public abstract int getY();
    public abstract Drawable getDrawable();
}
