package structural.bridge;

import java.awt.Color;
import java.awt.Graphics;

public class CircleDrawable implements Drawable {
	
	private Circle circle;
	
	public CircleDrawable(Circle circle) {
		this.circle = circle;
	}

	@Override
	public void paintGraphic(Graphics g) {
		g.setColor(Color.BLACK);
        g.drawOval(this.circle.getX(), this.circle.getY(), this.circle.getWidth(), this.circle.getHeight());
	}

}
