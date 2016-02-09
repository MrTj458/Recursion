package ctec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea displayArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Fibonacci");
		factorialButton = new JButton("Factorial");
		inputField = new JTextField("Text Field");
		displayArea = new JTextArea("Text Area");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(displayArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayArea, -6, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, 0, SpringLayout.EAST, displayArea);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 0, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 54, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -6, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -71, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
