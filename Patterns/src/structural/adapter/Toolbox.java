package structural.adapter;

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
		JButton clearButton = new JButton("Clear");
								
		//sets the sizes of the buttons
		squareButton.setPreferredSize(new Dimension(48, 48));
		circleButton.setPreferredSize(new Dimension(48, 48));
						
		//adds the buttons to the panel
		this.add(squareButton);
		this.add(circleButton);
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
		
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clearButtonEvents();
			}
			});
	}
	
	public void squareButtonEvents()
	{
		this.paint.mode = "DRAW_SQUARE";
	}
	
	public void circleButtonEvents()
	{
		this.paint.mode = "DRAW_CIRCLE";
	}
	
	public void clearButtonEvents()
	{
		this.paint.canvas.clear();
	}
}
