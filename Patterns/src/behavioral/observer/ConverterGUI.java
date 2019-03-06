package behavioral.observer;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ConverterGUI extends JFrame{
    
	DecimalNumber decimalNumber;	// Model, Publisher
									// 4-Views
	DecimalView decimalView;
    BinaryView binaryView;
    HexView hexView;
    OctalView octalView;
    
    public ConverterGUI() {
        super("Number Converter");
        this.setPreferredSize(new Dimension(600, 300));
        this.setLayout(new GridLayout(2, 2));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        // Components
        this.decimalNumber = new DecimalNumber();
        this.decimalView = new DecimalView(this, "Decimal Number");
        this.binaryView = new BinaryView(this, "Binary Number");
        this.hexView = new HexView(this, "Hexadecimal Number");
        this.octalView = new OctalView(this, "Octal Number");
        this.decimalNumber.addObserver(this.decimalView);
        this.decimalNumber.addObserver(this.binaryView);
        this.decimalNumber.addObserver(this.hexView);
        this.decimalNumber.addObserver(this.octalView);
      
        this.add(this.decimalView);
        this.add(this.binaryView);
        this.add(this.hexView);
        this.add(this.octalView);
        this.pack();
        
        // Default JFrame options
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ConverterGUI();
    }

}

