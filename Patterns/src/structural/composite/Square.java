package structural.composite;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Figure{
    private int x = 0;
    private int y = 0;
    private int width = 50;
    private int height = 50;
    
    public Square(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }

    public void setX(int x){ 
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    } 

    public int getHeight(){
        return height;
    }

    public void paint(Graphics g){
    	if(this.mode == "SELECT")
    	{
    		g.setColor(Color.RED);
            g.fillRect(x,y,width,height);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,width,height); 
    	}
    	else
    	{
            g.setColor(Color.BLACK);
            g.drawRect(x,y,width,height); 
    	} 
    }
}