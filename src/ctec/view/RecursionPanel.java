package ctec.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ctec.controller.RecursionController;
import ctec.model.Timer;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton fibonacciIterative;
	private JButton factorialButton;
	private JButton factorialIterative;
	private JTextField inputField;
	private JTextArea resultsArea;
	private Timer timer;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Fibonacci");
		fibonacciIterative = new JButton("Fibonacci iterative");
		factorialButton = new JButton("Factorial");
		factorialIterative = new JButton("Factorial iterative");
		baseLayout.putConstraint(SpringLayout.NORTH, factorialIterative, 0, SpringLayout.NORTH, fibonacciIterative);
		baseLayout.putConstraint(SpringLayout.WEST, factorialIterative, 0, SpringLayout.WEST, factorialButton);
		inputField = new JTextField();
		resultsArea = new JTextArea();
		timer = new Timer();

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(fibonacciIterative);
		this.add(factorialButton);
		this.add(factorialIterative);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -6, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 0, SpringLayout.NORTH, factorialButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 54, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factorialButton, -6, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciIterative, -2, SpringLayout.NORTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 41, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciIterative, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -71, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					timer.startTimer();
					resultsArea.append(baseController.doFibinacci(input) + "\n");
					timer.stopTimer();
					resultsArea.append(timer.toString() + "\n");
					timer.resetTimer();
				}
			}
		});
		
		fibonacciIterative.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					timer.startTimer();
					resultsArea.append(baseController.doFibonacciIterative(input) + "\n");
					timer.stopTimer();
					resultsArea.append(timer.toString() + "\n");
					timer.resetTimer();
				}
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					timer.startTimer();
					resultsArea.append(baseController.doFactorial(input) + "\n");
					timer.stopTimer();
					resultsArea.append(timer.toString() + "\n");
					timer.resetTimer();
				}
			}
		});
		
		factorialIterative.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					timer.startTimer();
					resultsArea.append(baseController.doFactorialIterative(input) + "\n");
					timer.stopTimer();
					resultsArea.append(timer.toString() + "\n");
					timer.resetTimer();
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Double.parseDouble(input);
			isNumber = true;
		}
		catch(Exception e)
		{
			resultsArea.setText("You must type in a number.");
		}
		
		return isNumber;
	}
}
