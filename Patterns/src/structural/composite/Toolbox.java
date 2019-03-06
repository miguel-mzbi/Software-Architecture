package structural.composite;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbox extends JPanel{
	Paint paint;
	
	public Toolbox(Paint paint)
	{		
		this.paint = paint;
		
		//This sets the size of the panel
		this.setPreferredSize(new Dimension(64, 136));
		this.setMinimumSize(new Dimension(64, 136));
		this.setMaximumSize(new Dimension(64, 136));
						
		//creates the buttons
		JButton squareButton = new JButton(new ImageIcon("imgs\\blue.gif"));
		JButton circleButton = new JButton(new ImageIcon("imgs\\red.gif"));
		JButton groupButton = new JButton(new ImageIcon("imgs\\red.gif"));
		JButton selectButton = new JButton(" Sel ");
		JButton moveButton = new JButton("Move");
		JButton clearButton = new JButton("Clear");
								
		//sets the sizes of the buttons
		squareButton.setPreferredSize(new Dimension(48, 48));
		circleButton.setPreferredSize(new Dimension(48, 48));
						
		//adds the buttons to the panel
		this.add(squareButton);
		this.add(circleButton);
		this.add(selectButton);
		this.add(moveButton);
		this.add(clearButton);
		
		// Listennig for events
		squareButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				squareButtonEvents();
			}
			});
		
		circleButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				circleButtonEvents();
			}
			});
		
		selectButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				selectButtonEvents();
			}
			});
		
		moveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				moveButtonEvents();
			}
			});
		
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clearButtonEvents();
			}
			});
	}
	
	public void squareButtonEvents()
	{
		this.paint.mode = "DRAW_SQUARE";
		this.resetMode();
	}
	
	public void circleButtonEvents()
	{
		this.paint.mode = "DRAW_CIRCLE";
		this.resetMode();
	}
	
	public void selectButtonEvents()
	{
		if(!this.paint.scene.isEmpty())
		{
			this.paint.mode = "SELECT";
		}
	}
	
	public void moveButtonEvents()
	{
		if(this.paint.mode == "SELECT" && !this.paint.scene.isEmpty())
		{
			this.paint.mode = "MOVE";
		}
	}
	
	public void clearButtonEvents()
	{
		this.paint.canvas.clear();
	}
	
	private void resetMode()
	{
		for(int i = 0; i < this.paint.scene.list.size(); i++)
		{
			this.paint.scene.list.get(i).mode = "NORMAL";
		}
	}
}
