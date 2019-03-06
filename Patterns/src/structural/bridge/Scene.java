package structural.bridge;

import java.awt.Graphics;
import java.util.ArrayList;

public class Scene {
	Paint paint;
	ArrayList<Figure> list;
	int currentIndex = -1;
	
	public Scene(Paint paint)
	{
		this.paint = paint;
		this.list = new ArrayList<Figure>();
	}
	
	public void add(Figure figure)
	{
		this.list.add(figure);
		this.currentIndex = this.list.size() - 1;
	}
	
	public Figure get(int index)
	{
		return this.list.get(index);
	}
	
	public Figure getCurrent()
	{
		return this.list.get(this.currentIndex);
	}
	
	public void clear()
	{
		this.list.clear();
	}
	
	public boolean isEmpty()
	{
		if(this.list.size() == 0)
			return true;
		return false;
	}
	
	public void paint(Graphics g)
	{
		for(int i = 0; i < list.size(); i++)
		{
			this.list.get(i).getDrawable().paintGraphic(g);;
		}
	}
}
