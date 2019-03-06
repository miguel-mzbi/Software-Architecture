package structural.bridge;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Paint extends JFrame{
	
	Toolbox toolbox;
	Canvas canvas;
	Scene scene;
	String mode = "DRAW";
	
	public Paint(String title)
	{
		//Creates a frame
		super(title);
		
		this.scene = new Scene(this);
				
		//Creates a container
		Container content = this.getContentPane();
				
		//sets the layout
		content.setLayout(new BorderLayout());
				
		//creates a Canvas
		this.canvas = new Canvas(this);
				
		//sets the canvas in the center
		content.add(canvas, BorderLayout.CENTER);
				
		// Craete the toolbox
		this.toolbox = new Toolbox(this);
				
		//sets the panel to the left
		content.add(toolbox, BorderLayout.WEST);
				
		//sets the size of the frame
		this.setSize(600, 600);
				
		//makes it so you can close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//makes it so you can see it
		this.setVisible(true);
	}
	
	public static void main(String[] args) throws IOException{
		new Paint("Paint");
	}
}
