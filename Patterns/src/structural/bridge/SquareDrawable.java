package structural.bridge;

import java.awt.Color;
import java.awt.Graphics;

public class SquareDrawable implements Drawable {

private Square square;
	
	public SquareDrawable(Figure square) {
		this.square = (Square) square;
	}

	@Override
	public void paintGraphic(Graphics g) {
		g.setColor(Color.BLACK);
        g.drawOval(this.square.getX(), this.square.getY(), this.square.getWidth(), this.square.getHeight());
	}

}
