package ctec.model;

public class RecursionTool
{
	public RecursionTool()
	{
		
	}
	
	public double getFibNumber(double position)
	{
		//Bounds check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else //recursive case
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}
	
	public double fibonacciIterative(double position)
	{
		int a = 0;
		int b = 1;
		
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			for(int index = 0; index < position; index++)
			{
				int nextNumber = a + b;
				a = b;
				b = nextNumber;
			}
		}
		return b;
	}
	
	public double getFactorialNumber(double position)
	{
		//Bounds check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0)
		{
			return 1;
		}
		else
		{
			return position * getFactorialNumber(position - 1);
		}
	}
	
	public double factorialIterative(double position)
	{
		if(position < 0)
		{
			return Double.MIN_VALUE;
		}
		
		double result = 1;
		
		for(int index = 1; index <= position; index++)
		{
			result = result * index;
		}
		
		return result;
	}
}
