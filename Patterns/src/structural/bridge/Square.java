package structural.bridge;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Figure{
	
	private Drawable squareDrawable;

    private int x = 0;
    private int y = 0;
    private int width = 50;
    private int height = 50;
    
    public Square(int x, int y)
    {
    	this.squareDrawable = new SquareDrawable(this);
    	this.x = x;
    	this.y = y;
    }
    
    public Drawable getDrawable() {
    	return this.squareDrawable;
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

}