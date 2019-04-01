package formalSlang;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener 
{
	private JButton 	button;
	private JTextField 	tf1;

	
	GUI(String title)
	{
		super(title);
		   setSize(500,500);
		   setLayout(new FlowLayout());
		   
		// create / instantiate the GUI components and add listenera
		   button 	= new JButton("Compare");
		   tf1 		= new JTextField("Name of file.");
		   button.addActionListener(this);
		   
		   tf1.setToolTipText("enter your name here");
		   tf1.addActionListener(this);

		   // add the GUI components to the frame
		   add(tf1);
		   add(button);

		   setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	} 

}
