package behavioral.observer;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class BinaryView extends JPanel implements Observer, ActionListener{
    
	ConverterGUI app;
	
    // Components
    JButton btOk, btClear;
    JTextField tfInput;
    
    public BinaryView(ConverterGUI app, String title) {
        super();
        this.app = app;
        
        // Configure components
        this.setPreferredSize(new Dimension(300, 200));
        this.tfInput = new JTextField();
        this.tfInput.setPreferredSize(new Dimension(280, 30));
        this.btOk = new JButton("OK");
        this.btClear = new JButton("Clear");
        Border border = BorderFactory.createTitledBorder(title);
        this.setBorder(border);
        this.add(this.tfInput);
        this.add(this.btClear);
        this.add(this.btOk);
        this.btOk.addActionListener(this);
        this.btClear.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	String strBtSource = ((JButton) e.getSource()).getText();
    	if(strBtSource == "OK")
    	{
    		String strBinaryValue = this.app.binaryView.tfInput.getText();
    		int decimalValue = Integer.parseInt(strBinaryValue, 2);
    		this.app.decimalNumber.set(decimalValue);
    	}
    	else if(strBtSource == "Clear")
    	{
    		this.app.binaryView.tfInput.setText("");
    	}
    }
    
    public void update()
    {
    	this.app.binaryView.tfInput.setText(this.app.decimalNumber.getBinary());
    }
}

