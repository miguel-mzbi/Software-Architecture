package structural.adapter;

import java.awt.Graphics;

public class CircleWrapper extends Figure implements Adaptable {
	
	private Circle adaptee;
	
	public CircleWrapper(Circle adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void paint(Graphics g) {
		this.adaptee.draw(g);
	}

	@Override
	public void setX(int x) {
		this.adaptee.setX(x);
	}

	@Override
	public void setY(int y) {
		this.adaptee.setY(y);
	}

	@Override
	public int getX() {
		return this.adaptee.getX();
	}

	@Override
	public int getY() {
		return this.adaptee.getY();
	}

}
