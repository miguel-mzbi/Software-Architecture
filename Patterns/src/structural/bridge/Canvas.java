package structural.bridge;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

public class Canvas extends JComponent{
	Paint paint;

	public Canvas(Paint paint){
		this.paint = paint;
		setDoubleBuffered(false);
		
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				mousePressedEvents(e.getX(), e.getY());
		}
		});
		
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				mouseDraggedEvents(e.getX(), e.getY());
			}

		});
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g); 
        this.paint.scene.paint(g);
	}

	// Clearing Canvas
	public void clear(){
		this.paint.scene.clear();
		repaint();
	}
	
	public void mousePressedEvents(int x, int y)
	{
		if(this.paint.mode == "DRAW_SQUARE")
		{
			this.paint.scene.add(new Square(x, y));
		}
		else if(this.paint.mode == "DRAW_CIRCLE")
		{
			this.paint.scene.add(new Circle(x, y));
		}
		repaint();
	}
	
	public void mouseDraggedEvents(int x, int y)
	{
		if(this.paint.mode == "DRAW_SQUARE")
		{
			this.paint.scene.getCurrent().setX(x);
			this.paint.scene.getCurrent().setY(y);
		}
		else if(this.paint.mode == "DRAW_CIRCLE")
		{
			this.paint.scene.getCurrent().setX(x);
			this.paint.scene.getCurrent().setY(y);
		}
		repaint();
	}
}

