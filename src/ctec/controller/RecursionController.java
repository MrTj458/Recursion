package ctec.controller;

import ctec.view.RecursionFrame;
import ctec.model.RecursionTool;

public class RecursionController
{
	private RecursionTool mathTool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	public RecursionController()
	{
		mathTool = new RecursionTool();
		baseFrame = new RecursionFrame(this);
		calculatedValue = "";
	}
	
	public void start(){}
	
	public String doFibinacci(String input)
	{
		calculatedValue = "The fibonacci sequence at " + input + " is: " + Double.toString(mathTool.fibonacciNumber(Double.parseDouble(input)));
		return calculatedValue;
	}
	
	public String doFibonacciIterative(String input)
	{
		calculatedValue = "The fibonacci sequence at " + input + " is: " + Double.toString(mathTool.fibonacciIterative(Double.parseDouble(input)));
		return calculatedValue;
	}
	
	public String doFactorial(String input)
	{
		calculatedValue = input + "! is: " + Double.toString(mathTool.factorialNumber(Double.parseDouble(input)));
		return calculatedValue;
	}
	
	public String doFactorialIterative(String input)
	{
		calculatedValue = input + "! is: " + Double.toString(mathTool.factorialIterative(Double.parseDouble(input)));
		return calculatedValue;
	}
}
