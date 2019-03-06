package structural.composite;

import java.awt.Graphics;
import java.util.ArrayList;

public class Grupo extends Figure{
	
	ArrayList<Figure> list;
	int currentIndex = -1;
	
	public Grupo() {
		this.list = new ArrayList<>();
	}
	
	public void addFigure(Figure figure) {
		this.list.add(figure);
	}
	
	public void removeFigure(int pos) {
		this.list.remove(pos);
	}

	@Override
	public void paint(Graphics g) {
		for(int i = 0; i < this.list.size(); i++) {
			this.list.get(i).paint(g);
		}
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

}
